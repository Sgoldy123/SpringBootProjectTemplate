package com.MicroService.MicroService.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info=@Info(
            title = "Microservie",
            description = "About microservice",
            summary = "CRUD operation",
            version = "v1.0"
    ),
        servers = @Server(
                description = "Dev",
                url = "http://localhost:8080"
        )
)
public class SwaggerDocConfig {
}
