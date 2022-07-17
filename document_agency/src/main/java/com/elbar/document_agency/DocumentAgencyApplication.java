package com.elbar.document_agency;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class DocumentAgencyApplication {
    public static void main(String[] args) {
        SpringApplication.run(DocumentAgencyApplication.class, args);
    }

}
