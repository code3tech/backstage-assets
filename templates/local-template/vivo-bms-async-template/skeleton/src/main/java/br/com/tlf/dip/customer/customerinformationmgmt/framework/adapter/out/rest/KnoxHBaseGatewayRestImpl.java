package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.rest;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.KnoxHBaseGatewayPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.Row;

@Component
public class KnoxHBaseGatewayRestImpl implements KnoxHBaseGatewayPortOut {


	@Value("${knox.tableCnpj:TBL_EMAIL_UNICO_CNPJ}")
	private String TABLE_EMAIL_UNICO_CNPJ;
	@Value("${knox.tableConta:TBL_EMAIL_UNICO_CONTA}")
	private String TABLE_EMAIL_UNICO_CONTA;
	@Value("${knox.tableEmail:TBL_EMAIL_UNICO_EMAIL}")
	private String TABLE_EMAIL_UNICO_EMAIL;
	@Value("${knox.tableLiha:TBL_EMAIL_UNICO_LINHA}")
	private String TABLE_EMAIL_UNICO_LINHA;
	
	@Value("${knox.scheme}")
	private String scheme;
	@Value("${knox.host}")
	private String host;
	@Value("${knox.port}")
	private String port;
	@Value("${knox.basePath}")
	private String basePath;
	@Value("${knox.namespace}")
	private String namespace;

	@Value("${knox.user}")
	private String knoxUser;
	@Value("${knox.password}")
	private String knoxPassword;

	private static Logger logger = LoggerFactory.getLogger(KnoxHBaseGatewayRestImpl.class);

	@Override
	public Row getCNPJ(String cnpj) {
		ResponseEntity<Row> re = performRequest(cnpj, TABLE_EMAIL_UNICO_CNPJ);
		return re.getBody();
	}

	@Override
	public Row getConta(String conta) {
		ResponseEntity<Row> re = performRequest(conta, TABLE_EMAIL_UNICO_CONTA);
		return re.getBody();
	}

	@Override
	public Row getEmail(String email) {
		ResponseEntity<Row> re = performRequest(email, TABLE_EMAIL_UNICO_EMAIL);
		return re.getBody();
	}

	@Override
	public Row getLinha(String linha) {
		ResponseEntity<Row> re = performRequest(linha, TABLE_EMAIL_UNICO_LINHA);
		return re.getBody();
	}

	private HttpHeaders createHeaders() {
		HttpHeaders headers = new HttpHeaders();
		String var = knoxUser + ":" + knoxPassword;
		byte[] authEncBytes = Base64.encodeBase64(var.getBytes());
		String authStringEnc = new String(authEncBytes);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Basic " + authStringEnc);
		return headers;
	}

	private ResponseEntity<Row> performRequest(String data, String operation) {
		String knoxUrl = scheme + "://" + host + ":" + port + basePath + "/" + namespace + ":" + operation + "/" + data;
		HttpHeaders headers = createHeaders();
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(knoxUrl);

		logger.info("Connect to URL: {}", uriBuilder.toUriString());

		ResponseEntity<Row> response = null;

		RestTemplate restTemplate = null;
		try {
			restTemplate = getRestTemplate();
		} catch (KeyManagementException | KeyStoreException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		response = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, new HttpEntity<>(headers),
				Row.class);

		logger.info("RESPONSE: HTTP {}, Body {}, Headers {}", response.getStatusCode(), response.getBody(),
				response.getHeaders());

		return response;
	}

	public RestTemplate getRestTemplate() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
		TrustStrategy acceptingTrustStrategy = (x509Certificates, s) -> true;
		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy)
				.build();
		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext, new NoopHostnameVerifier());
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		return restTemplate;
	}
}