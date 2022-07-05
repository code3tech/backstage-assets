package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.integration.config;

//import static springfox.documentation.builders.PathSelectors.regex;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;

// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.builders.ResponseBuilder;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.service.AuthorizationScope;
// import springfox.documentation.service.Contact;
// import springfox.documentation.service.Response;
// import springfox.documentation.service.SecurityReference;
// import springfox.documentation.service.VendorExtension;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spi.service.contexts.SecurityContext;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// @Configuration
// @EnableSwagger2
@Deprecated
public class SwaggerConfig {
	
	// @Bean
    // public Docket productApi() {
    //     return new Docket(DocumentationType.SWAGGER_2)
    //             .select()
    //             .apis(RequestHandlerSelectors.basePackage("br.com.tlf.dip.customer.customerinformationmgmt"))
    //             .paths(regex("/customerinformationsummary/v1.*"))
    //             .build()
    //             .useDefaultResponseMessages(false)
    //             .globalResponses(HttpMethod.GET, getGlobalResponses())
    //             //.securitySchemes(Arrays.asList(new ApiKey("Token Access", HttpHeaders.AUTHORIZATION, In.HEADER.name())))
    //             //.securityContexts(Arrays.asList(securityContext()))
    //             .apiInfo(metaInfo());
    // }

	// private List<Response> getGlobalResponses() {
	// 	return new ArrayList<Response>() {
	// 		/**
	// 		 * 
	// 		 */
	// 		private static final long serialVersionUID = 1L;

	// 	{
	// 		add(new ResponseBuilder()
	// 			.code("400")
	// 			.description("A requisição é inválida.")
	// 			.build());
	// 		add(new ResponseBuilder()
	// 			.code("401")
	// 			.description("O cliente deve se autenticar para obter a resposta solicitada.")
	// 			.build());
	// 		add(new ResponseBuilder()
	// 			.code("403")
	// 			.description("O cliente não tem direitos de acesso ao conteúdo da informação.")
	// 			.build());
	// 		add(new ResponseBuilder()
	// 			.code("404")
	// 			.description("O servidor não pode encontrar o recurso solicitado.")
	// 			.build());
	//         add(new ResponseBuilder()
	//             .code("500")
	//             .description("Internal Server Error")
	//             .build());
	//         add(new ResponseBuilder()
	//             .code("504")
	//             .description("Request timeout exceeded")
	//             .build());
	//     }};
	// }

    // private ApiInfo metaInfo() {

    //     @SuppressWarnings("rawtypes")
	// 	ApiInfo apiInfo = new ApiInfo(
    //             "Customer Information Summary",
    //             "MS para Consultar Informações de Cliente Centralizado",
    //             "1.0",
    //             "Terms of Service",
    //             new Contact("Vivo", "http://www.vivo.com.br",
    //                     "vivo@telefonica.com"),
    //             "Apache License Version 2.0",
    //             "https://www.apache.org/license.html", new ArrayList<VendorExtension>()
    //     );

    //     return apiInfo;
    // }

    // private SecurityContext securityContext() {
    //     return SecurityContext.builder()
    //         .securityReferences(defaultAuth())
    //         .forPaths(PathSelectors.ant("/users/**"))
    //         .build();
    // }
    
    // List<SecurityReference> defaultAuth() {
    //     AuthorizationScope authorizationScope
    //         = new AuthorizationScope("ADMIN", "accessEverything");
    //     AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
    //     authorizationScopes[0] = authorizationScope;
    //     return Arrays.asList(
    //         new SecurityReference("Token Access", authorizationScopes));
    // }

}
