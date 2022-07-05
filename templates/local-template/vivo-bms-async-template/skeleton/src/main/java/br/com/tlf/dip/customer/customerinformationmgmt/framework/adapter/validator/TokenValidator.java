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
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;


public class TokenValidator {
	 private Logger logger = LoggerFactory.getLogger(this.getClass());
     
	    public void validateToken(String accessToken, String publicKey, String userAPI, String clientID, String scopeAPI) throws TokenExpiredException, SignatureException, IllegalArgumentException, UnsupportedEncodingException, CertificateException  {
	        logger.info("Validando Token de acesso: " + accessToken);
	          
	        if (accessToken == null) {
	            throw new IllegalArgumentException("AccessToken token nulo ou vazio");
	        }
	          
	        Algorithm algorithm = Algorithm.RSA512(getParsedPublicKey(publicKey), null);
	          
	        JWTVerifier verifier = JWT.require(algorithm).acceptLeeway(300)
	            .build(); //Reusable verifier instance
	        
	        String[] aToken = accessToken.split(" ");
	        if (aToken.length > 1) {
	            accessToken = aToken[1];
	        }  

	        if (!validateClientID(accessToken, clientID)) {
	            throw new IllegalArgumentException("Aplicação não tem permissão de acesso ao serviço.");
	        }
	         
	        if (!validateScope(accessToken, scopeAPI)) {
	            throw new IllegalArgumentException("Escopo inválido.");
	        }
	        
	                      
	        //Esse verify ja verifica se o token esta expirado ou nao, caso esteja lança um TokenExpiredException.
	        DecodedJWT jwt = verifier.verify(accessToken);
	          
	        logger.info("Token validado com sucesso. Token irá expirar em " + jwt.getExpiresAt().toString() + ".");
	    }
	      
	    public RSAPublicKey getParsedPublicKey(String key) throws UnsupportedEncodingException, CertificateException {
	        byte[] decodedCert = Base64.getDecoder().decode(key);
	        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
	        InputStream in = new ByteArrayInputStream(decodedCert);
	        X509Certificate certificate = (X509Certificate)certFactory.generateCertificate(in);
	        return (RSAPublicKey) certificate.getPublicKey();
	    }
	      
	     
	    private boolean validateClientID(String accessToken, String clientID) throws UnsupportedEncodingException, CertificateException {
	    	String tokenClientId = JWT.decode(accessToken).getClaim("oracle.oauth.client_origin_id").asString();
	        return tokenClientId.toUpperCase().contains(clientID.toUpperCase());
	        
	    }
	     
	    private boolean validateScope(String accessToken, String scope) throws UnsupportedEncodingException, CertificateException {
	        String tokenScope = JWT.decode(accessToken).getClaim("oracle.oauth.scope").asString();
	        return tokenScope.toUpperCase().contains(scope.toUpperCase());
	        
	    }

		public void validateToken(String accessToken, String publicKey, String[] userAPI, String[] clientId,
				String scopeAPI) throws TokenExpiredException, SignatureException, IllegalArgumentException, UnsupportedEncodingException, CertificateException {
			
			logger.info("Validando Token de acesso: " + accessToken);
	        
	        if (accessToken == null) {
	            throw new IllegalArgumentException("AccessToken token nulo ou vazio");
	        }
	        
	        Algorithm algorithm = null;
	        JWTVerifier verifier = null;
	        try {
	        	 algorithm = Algorithm.RSA256(getParsedPublicKey(publicKey), null);
	            
	            verifier = JWT.require(algorithm).acceptLeeway(300).build(); //Reusable verifier instance
	        } catch (Exception e) {
	        	throw new IllegalArgumentException("Erro ao validar a chave publica do Token.");
	        }
	        
	        
	        String[] aToken = accessToken.split(" ");
	        if (aToken.length > 1) {
	            accessToken = aToken[1];
	        }  

	        if (!validateClientIDList(accessToken, clientId)) {
	            throw new IllegalArgumentException("Aplicação não tem permissão de acesso ao serviço.");
	        }
	         
	        if (!validateScopeList(accessToken, scopeAPI)) {
	            throw new IllegalArgumentException("Escopo inválido.");
	        }
	        
	                      
	        //Esse verify ja verifica se o token esta expirado ou nao, caso esteja lança um TokenExpiredException.
	        DecodedJWT jwt = verifier.verify(accessToken);
	          
	        logger.info("Token validado com sucesso. Token irá expirar em " + jwt.getExpiresAt().toString() + ".");
			
		}
		
		private boolean validateClientIDList(String accessToken, String[] clientID) throws UnsupportedEncodingException, CertificateException {
	    	String tokenClientId = JWT.decode(accessToken).getClaim("client").asString();
	    	Stream<String> streamCliente = Arrays.stream(clientID);
	    	return streamCliente.anyMatch(tt-> tt.toUpperCase().contains(tokenClientId.toUpperCase()));
	    }
	     
	    private boolean validateScopeList(String accessToken, String scope) throws UnsupportedEncodingException, CertificateException {
	        String[] tokenScope = JWT.decode(accessToken).getClaim("scope").asArray(String.class);
	    	return Arrays.stream(tokenScope).anyMatch(tt-> tt.toUpperCase().contains(scope.toUpperCase()));
	    	
	    }

}
