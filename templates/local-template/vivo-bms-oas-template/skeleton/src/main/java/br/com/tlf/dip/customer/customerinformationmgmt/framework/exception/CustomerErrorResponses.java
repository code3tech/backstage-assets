package br.com.tlf.dip.customer.customerinformationmgmt.framework.exception;

import org.springframework.http.HttpStatus;

/**
* Responsável por armazenar e identificar tipos possíveis e esperados de exceções HTTP.
* @author arthur.gomes - 23/08/2021
*
*/
public class CustomerErrorResponses {

	/**
	* Recupera o HttpStatus correto.
	* @author arthur.gomes - 23/08/2021
	* @param code - Código do erro de negócio
	* @return - HttpStatus
	*/
	public static HttpStatus getStatus(String code ) {
	HttpStatus httpStatus = null;
	switch (code) {
	/**
	* Essa resposta significa que o servidor não entendeu a requisição pois está com uma sintaxe inválida.
	*/
	case "400":
	httpStatus=HttpStatus.BAD_REQUEST;
	break;
	/**
	* Embora o padrão HTTP especifique "unauthorized", semanticamente, essa resposta significa "unauthenticated".
	* Ou seja, o cliente deve se autenticar para obter a resposta solicitada.
	*/
	case "401":
	httpStatus=HttpStatus.UNAUTHORIZED;
	break;
	/**
	* O cliente não tem direitos de acesso ao conteúdo portanto o servidor está rejeitando dar a resposta.
	* Diferente do código 401, aqui a identidade do cliente é conhecida.
	*/
	case "403":
	httpStatus=HttpStatus.FORBIDDEN;
	break;

	/**
	* O servidor não pode encontrar o recurso solicitado. Este código de resposta talvez seja o mais famoso
	* devido à frequência com que acontece na web.
	*/
	case "404":
	httpStatus=HttpStatus.NOT_FOUND;
	break;

	/**
	* O método de solicitação é conhecido pelo servidor, mas foi desativado e não pode ser usado.
	* Os dois métodos obrigatórios, GET e HEAD, nunca devem ser desabilitados e não devem retornar este código de erro.
	*/
	case "405":
	httpStatus=HttpStatus.METHOD_NOT_ALLOWED;
	break;
	/**
	* Essa resposta é enviada quando o servidor da Web após realizar a negociação de conteúdo orientada pelo servidor,
	* não encontra nenhum conteúdo seguindo os critérios fornecidos pelo agente do usuário.
	*/
	case "406":
	httpStatus=HttpStatus.NOT_ACCEPTABLE;
	break;
	/**
	* Semelhante ao 401 porem é necessário que a autenticação seja feita por um proxy.
	*/
	case "407":
	httpStatus=HttpStatus.PROXY_AUTHENTICATION_REQUIRED;
	break;
	/**
	* Esta resposta é enviada por alguns servidores em uma conexão ociosa, mesmo sem qualquer requisição
	* prévia pelo cliente. Ela significa que o servidor gostaria de derrubar esta conexão em desuso.
	* Esta resposta é muito usada já que alguns navegadores, como Chrome, Firefox 27+, ou IE9, usam mecanismos
	* HTTP de pré-conexão para acelerar a navegação. Note também que alguns servidores meramente derrubam a conexão sem enviar esta mensagem.
	*/
	case "408":
	httpStatus=HttpStatus.REQUEST_TIMEOUT;
	break;

	/**
	* Esta resposta será enviada quando uma requisição conflitar com o estado atual do servidor.
	*/
	case "409":
	httpStatus=HttpStatus.CONFLICT;
	break;

	/**
	* Esta resposta será enviada quando o conteúdo requisitado foi permanentemente deletado do servidor,
	* sem nenhum endereço de redirecionamento. É experado que clientes removam seus caches e links para o recurso.
	* A especificação HTTP espera que este código de status seja usado para "serviços promocionais de tempo limitado".
	* APIs não devem se sentir obrigadas a indicar que recursos foram removidos com este código de status.
	*/
	case "410":
	httpStatus=HttpStatus.GONE;
	break;

	/**
	* O servidor rejeitou a requisição porque o campo Content-Length do cabeçalho não está definido e o servidor o requer.
	*/
	case "411":
	httpStatus=HttpStatus.LENGTH_REQUIRED;
	break;

	/**
	* O cliente indicou nos seus cabeçalhos pré-condições que o servidor não atende.
	*/
	case "412":
	httpStatus=HttpStatus.PRECONDITION_FAILED;
	break;

	/**
	* A entidade requisição é maior do que os limites definidos pelo servidor;
	* o servidor pode fechar a conexão ou retornar um campo de cabeçalho Retry-After.
	*/
	case "413":
	httpStatus=HttpStatus.PAYLOAD_TOO_LARGE;
	break;

	/**
	* A URI requisitada pelo cliente é maior do que o servidor aceita para interpretar.
	*/
	case "414":
	httpStatus=HttpStatus.URI_TOO_LONG;
	break;

	/**
	* O formato de mídia dos dados requisitados não é suportado pelo servidor, então o servidor rejeita a requisição.
	*/
	case "415":
	httpStatus=HttpStatus.UNSUPPORTED_MEDIA_TYPE;
	break;

	/**
	* O trecho especificado pelo campo Range do cabeçalho na requisição não pode ser preenchido;
	* é possível que o trecho esteja fora do tamanho dos dados da URI alvo.
	*/
	case "416":
	httpStatus=HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE;
	break;

	/**
	* Este código de resposta significa que a expectativa indicada pelo campo Expect do cabeçalho da requisição
	* não pode ser satisfeita pelo servidor.
	*/
	case "417":
	httpStatus=HttpStatus.EXPECTATION_FAILED;
	break;
	/**
	* O servidor recusa a tentativa de coar café num bule de chá.
	*/
	case "418":
	httpStatus=HttpStatus.I_AM_A_TEAPOT;
	break;
	/**
	* A requisição está bem formada mas inabilitada para ser seguida devido a erros semânticos.
	*/
	case "422":
	httpStatus=HttpStatus.UNPROCESSABLE_ENTITY;
	break;

	/**
	* O recurso sendo acessado está travado.
	*/
	case "423":
	httpStatus=HttpStatus.LOCKED;
	break;

	/**
	* A requisição falhou devido a falha em requisição prévia.
	*/
	case "424":
	httpStatus=HttpStatus.FAILED_DEPENDENCY;
	break;

	/**
	* Indica que o servidor não está disposto a arriscar processar uma requisição que pode ser refeita.
	*/
	case "425":
	httpStatus=HttpStatus.TOO_EARLY;
	break;

	/**
	* O servidor se recusa a executar a requisição usando o protocolo corrente mas estará pronto a fazê-lo
	* após o cliente atualizar para um protocolo diferente.
	* O servidor envia um cabeçalho Upgrade (en-US) numa resposta 426 para indicar o(s) protocolo(s) requeridos.
	*/
	case "426":
	httpStatus=HttpStatus.UPGRADE_REQUIRED;
	break;

	/**
	* O servidor de origem requer que a resposta seja condicional.
	* Feito para prevenir o problema da 'atualização perdida', onde um cliente pega o estado de um recurso (GET) , modifica-o,
	* e o põe de volta no servidor (PUT), enquanto um terceiro modificou o estado no servidor, levando a um conflito.
	*/
	case "428":
	httpStatus=HttpStatus.PRECONDITION_REQUIRED;
	break;

	/**
	* O usuário enviou muitas requisições num dado tempo ("limitação de frequência").
	*/
	case "429":
	httpStatus=HttpStatus.TOO_MANY_REQUESTS;
	break;

	/**
	* O servidor não quer processar a requisição porque os campos de cabeçalho são muito grandes.
	* A requisição PODE ser submetida novemente depois de reduzir o tamanho dos campos de cabeçalho.
	*/
	case "431":
	httpStatus=HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE;
	break;

	/**
	* O usuário requisitou um recurso ilegal, tal como uma página censurada por um governo.
	*/
	case "451":
	httpStatus=HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS;
	break;
	/**
	* O servidor encontrou uma situação com a qual não sabe lidar.
	*/
	default:
	httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
	break;
	}
	return httpStatus;
	}
	
}
