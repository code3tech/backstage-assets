package br.com.tlf.dip.customer.customerinformationmgmt.framework.exception;


/**
 * Enum responsável por armazenar os tipos de códigos de erro previstos 
 * para chamadas HTTP REST. Tende a evoluir conforme a necessidade de novos códigos.
 * Criado por: @author A0089321 - arthur.gjunior
 * Data de criação: 05/05/2021
 *
 */
public enum GenericErrorsEnum {
	BAD_REQUEST("400", "A requisição é inválida."),
	UNAUTHORIZED("401", "O cliente deve se autenticar para obter a resposta solicitada."),
	FORBIDDEN("403", "O cliente não tem direitos de acesso ao conteúdo da informação."),
	NOT_FOUND("404", "O servidor não pode encontrar o recurso solicitado."),
	METHOD_NOT_ALLOWED("405", "O método de solicitação é conhecido pelo servidor, mas foi desativado e não pode ser usado."),
	NOT_ACCEPTABLE("406", "Não foi encontrado nenhum conteúdo seguindo os critérios fornecidos pelo agente do usuário."),
	PROXY_AUTHENTICATION_REQUIRED("407", "É necessário que a autenticação seja feita por um proxy."),
	REQUEST_TIMEOUT("408", "o servidor derrubou esta conexão."),
	CONFLICT("409", "A requisição conflita com o estado atual do servidor."),
	GONE("410", "O conteúdo requisitado foi permanentemente deletado do servidor."),
	LENGTH_REQUIRED("411", "O campo Content-Length do cabeçalho não está definido."),
	PRECONDITION_FAILED("412", "O cliente indicou nos seus cabeçalhos pré-condições que o servidor não atende."),
	PAYLOAD_TOO_LARGE("413", "A entidade requisição é maior do que os limites definidos pelo servidor."),
	URI_TOO_LONG("414", "A URI requisitada pelo cliente é maior do que o servidor aceita para interpretar."),
	UNSUPPORTED_MEDIA_TYPE("415", "O formato de mídia dos dados requisitados não é suportado pelo servidor."),
	REQUESTED_RANGE_NOT_SATISFIABLE("416", "O trecho especificado pelo campo Range do cabeçalho na requisição não pode ser preenchido."),
	EXPECTATION_FAILED("417", "A expectativa indicada pelo campo Expect do cabeçalho da requisição não pode ser satisfeita pelo servidor."),
	I_AM_A_TEAPOT("418", "O servidor recusa a tentativa."),
	UNPROCESSABLE_ENTITY("422", "A requisição está inabilitada para ser seguida devido a erros semânticos."),
	LOCKED("423", "O acesso ao recurso acessado está travado."),
	FAILED_DEPENDENCY("424", "A requisição falhou devido a falha em requisição prévia."),
	TOO_EARLY("425", "o servidor não irá processar uma requisição que pode ser refeita."),
	UPGRADE_REQUIRED("426", "O servidor se recusa a executar a requisição usando o protocolo corrente."),
	PRECONDITION_REQUIRED("428", "O servidor de origem requer que a resposta seja condicional."),
	TOO_MANY_REQUESTS("429", "O usuário enviou muitas requisições num dado tempo (limitação de frequência)."),
	REQUEST_HEADER_FIELDS_TOO_LARGE("431", "O servidor não quer processar a requisição. Os campos de cabeçalho são muito grandes."),
	UNAVAILABLE_FOR_LEGAL_REASONS("451", "O usuário requisitou um recurso ilegal."),
	ERROR_GENERIC("500", "Internal Server Error");

  private String code;
  private String reason;

  private GenericErrorsEnum(String code, String reason) {
    this.code = code;
    this.reason = reason;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
}
