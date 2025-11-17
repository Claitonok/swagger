package com.example.swagger.swaggerConfiguration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defOpenAPI(){

        Server server = new Server();
        server.setUrl("http://localhost:8080/");
        server.setDescription("api/usuario");

        Contact myContact = new Contact();
        myContact.setName("Claiton dos Santos Silva");
        myContact.setEmail("claiton_santos1@hotmail.com");

        Info information = new Info()
        .title("API - Swagger")
        .version("v4.2")
        .description("System open Swagger - API")
        .contact(myContact);

        return new OpenAPI().info(information).servers(List.of(server));
    }

}
