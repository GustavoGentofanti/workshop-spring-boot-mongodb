package com.gento.workshopmongo;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.gento.workshopmongo"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaInfo());
		}
	
	 private ApiInfo metaInfo() {

	        ApiInfo apiInfo = new ApiInfo(
	                "Posts API REST",
	                "API REST de posts da internet.",
	                "1.0",
	                "Terms of Service",
	                new Contact("Gustavo Gentofanti Silvany", "https://www.linkedin.com/in/gustavo-gentofanti-silvany-45125122b/",
	                        "gustavogentofanti.pro@gmail.com"),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
	        );

	        return apiInfo;
	    }
}
