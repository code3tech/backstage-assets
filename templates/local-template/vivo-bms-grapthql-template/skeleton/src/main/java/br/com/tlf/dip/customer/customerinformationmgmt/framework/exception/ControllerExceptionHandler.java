package br.com.tlf.dip.customer.customerinformationmgmt.framework.exception;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

/**
 * Classe responsável por "escutar" as exceções na camada de controle e tratar
 * de acordo com o tipo da exceção para o padrão REST. Criado por: @author
 * A0089321 - arthur.gjunior Data criação: 05/05/2021
 */
@ControllerAdvice
public class ControllerExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerExceptionHandler.class);

	/**
	 * Recupera a exceção de AbstractBusinessException e trata conforme o tipo de
	 * exceção
	 * 
	 * @param e - AbstractBusinessException
	 * @return Error
	 */
	@ExceptionHandler({ AbstractBusinessException.class })
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<Error> abstractBusinessException(AbstractBusinessException e) {
		Error response = new Error(new Date(), Integer.parseInt(e.getCodigo()), e.getReason(),
				e.getMensagemStackTrace(), e.getMensagemAmigavel());
		LOGGER.error(response.toString(), e.getMensagemAmigavel());
		return new ResponseEntity<>(response, new HttpHeaders(), CustomerErrorResponses.getStatus(e.getCodigo()));
	}

	@ExceptionHandler({ HttpClientErrorException.class })
	public ResponseEntity<Error> httpClientErrorException(HttpClientErrorException e) {

		Error response = new Error(new Date(), Integer.valueOf(e.getRawStatusCode()), e.getStatusText(), null,
				e.getStatusCode().name());
		LOGGER.info(response.toString(), e.getMessage());
		LOGGER.error(e.getStackTrace().toString());
		return new ResponseEntity<>(response, new HttpHeaders(), e.getStatusCode());
	}

	@ExceptionHandler({ HttpServerErrorException.class })
	public ResponseEntity<Error> httpClienServerErrorException(HttpClientErrorException e) {

		Error response = new Error(new Date(), Integer.valueOf(e.getRawStatusCode()), e.getMessage(), null,
				e.getStatusCode().name());
		LOGGER.info(response.toString(), e.getMessage());
		return new ResponseEntity<>(response, new HttpHeaders(), e.getStatusCode());
	}

	@ExceptionHandler({ KeyManagementException.class})
	public ResponseEntity<Error> keyManagementException(HttpServerErrorException e) {

		Error response = new Error(new Date(), Integer.valueOf(e.getRawStatusCode()), e.getMessage(), null,
				e.getStatusCode().name());
		LOGGER.info(response.toString(), e.getMessage());
		return new ResponseEntity<>(response, new HttpHeaders(), e.getStatusCode());
	}
	
	@ExceptionHandler({KeyStoreException.class})
	public ResponseEntity<Error> keyStoreException(HttpServerErrorException e) {

		Error response = new Error(new Date(), Integer.valueOf(e.getRawStatusCode()), e.getMessage(), null,
				e.getStatusCode().name());
		LOGGER.info(response.toString(), e.getMessage());
		return new ResponseEntity<>(response, new HttpHeaders(), e.getStatusCode());
	}
	
	@ExceptionHandler({ NoSuchAlgorithmException.class })
	public ResponseEntity<Error> noSuchAlgorithmException(HttpServerErrorException e) {

		Error response = new Error(new Date(), Integer.valueOf(e.getRawStatusCode()), e.getMessage(), null,
				e.getStatusCode().name());
		LOGGER.info(response.toString(), e.getMessage());
		return new ResponseEntity<>(response, new HttpHeaders(), e.getStatusCode());
	}
}
