package com.tritronik.shipping.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API ShippingOrder")
            .description("## TMF API Reference: TMF 700 - Shipping Order   ### February 2021     A Shipping Order is a document used by a business to specify what items are to be transferred by a logisitic partner from a storage location or warehouse to a party in a different location.When goods are sent to the customers, shipment information can be provided to them so they can be aware of when things were shipped and when they will arrive. The service provider creates a Shipping Order which can be sent to a Logistic Partner to manage the physical shipment. The Shipping Order can be split into one or more Shipments with associated  Shipment Tracking to capture information about the current status of the shipment, the past checkpoints and the estimated arrival date .  Copyright © TM Forum 2018. All Rights Reserved.")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("4.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.tritronik.shipping.server.api"))
                    .build()
                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
