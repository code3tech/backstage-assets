package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.validator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Objects;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

@Component
@EnableConfigurationProperties(TokenValidatorProperties.class)
public class TokenValidatorComponent {
	@Autowired
	TokenValidatorProperties properties;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public boolean validateToken(String accessToken) throws TokenExpiredException, SignatureException,
			IllegalArgumentException, UnsupportedEncodingException, CertificateException {
		logger.info("Validating access token: " + accessToken);
		if (accessToken == null) {
			throw new IllegalArgumentException("AccessToken token is null");
		}
		Algorithm algorithm = Algorithm.RSA512(getParsedPublicKey(this.properties.getPubcert()), null);
		JWTVerifier verifier = JWT.require(algorithm).acceptLeeway(300).build(); // Reusable verifier instance
		String[] aToken = accessToken.split(" ");
		if (aToken.length > 1) {
			accessToken = aToken[1];
		}
		if (!validateClientID(accessToken, this.properties.getClientId())) {
			throw new IllegalArgumentException("Application does not have permission");
		}
		if (!validateScope(accessToken, this.properties.getScope())) {
			throw new IllegalArgumentException("Invalid Scope.");
		}
		// Esse verify ja verifica se o token esta expirado ou nao, caso esteja lança um
		// TokenExpiredException.
		//DecodedJWT jwt = verifier.verify(accessToken);
		
		DecodedJWT jwt = JWT.decode(accessToken);
		Date date = new Date();
		Date expiresAt = jwt.getExpiresAt();
		if (expiresAt.before(date)) {
			throw new IllegalArgumentException("Token Expirado");
		}
		
		logger.info("Token validation success. Token expires in " + jwt.getExpiresAt().toString());
		return true;
	}

	private RSAPublicKey getParsedPublicKey(String key) throws UnsupportedEncodingException, CertificateException {
		byte[] decodedCert = Base64.getDecoder().decode(key);
		CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
		InputStream in = new ByteArrayInputStream(decodedCert);
		X509Certificate certificate = (X509Certificate) certFactory.generateCertificate(in);
		return (RSAPublicKey) certificate.getPublicKey();
	}

	private boolean validateClientID(String accessToken, String clientID)
			throws UnsupportedEncodingException, CertificateException {
		String tokenClientId = this.getClientID(accessToken);
		if (tokenClientId == null)
			return this.validateClientIDList(accessToken, new String[] { clientID });
		var valid = clientID.toUpperCase().contains(tokenClientId.toUpperCase());
		logger.info("Loaded Clients {} +-+-+-+ Token {} +-+-+-+ Result {}", clientID, tokenClientId, valid);
		return valid;
	}

	private boolean validateScope(String accessToken, String scope)
			throws UnsupportedEncodingException, CertificateException {
		String tokenScope = JWT.decode(accessToken).getClaim("scope").asString();
		if (tokenScope == null) {
			boolean validScope = this.validateScopeList(accessToken, new String[] { scope });
			return validScope;
		}
		var valid = scope.toUpperCase().contains(tokenScope.toUpperCase());
		logger.info("Loaded Scopes {} +-+-+-+ Scope {} +-+-+-+ Result {}", scope, tokenScope, valid);
		return valid;
	}

	private boolean validateClientIDList(String accessToken, String[] clientID)
			throws UnsupportedEncodingException, CertificateException {
		String tokenClientId = this.getClientID(accessToken);
		Stream<String> streamCliente = Arrays.stream(clientID);
		return streamCliente.anyMatch(tt -> tt.toUpperCase().contains(tokenClientId.toUpperCase()));
	}

	private String getClientID(String accessToken) {
		String tokenClientId = JWT.decode(accessToken).getClaim("client").isNull()
				? JWT.decode(accessToken).getClaim("oracle.oauth.client_origin_id").asString()
				: JWT.decode(accessToken).getClaim("client").asString();
		return tokenClientId;
	}
	
	private boolean validateScopeList(String accessToken, String[] scope)
			throws UnsupportedEncodingException, CertificateException {
		String tokenScope = JWT.decode(accessToken).getClaim("oracle.oauth.scope").asString();
		if (Objects.isNull(tokenScope)) {
			String[] tokenScopeList = JWT.decode(accessToken).getClaim("scope").asArray(String.class);
            boolean isValidScope = false;
            for (String tscope : tokenScopeList) {
                isValidScope = Arrays.stream(scope).anyMatch(tt-> tt.toUpperCase().contains(tscope.toUpperCase()));
                if(isValidScope) {
                	return isValidScope;
                }
            }
            return isValidScope;
		} else {
			Stream<String> streamScope = Arrays.stream(scope);
			return streamScope.anyMatch(tt -> tt.toUpperCase().contains(tokenScope.toUpperCase()));
		}
	}
}