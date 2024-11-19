package com.pirog.example.alldtoserializeinsnakecase.config

import com.fasterxml.jackson.databind.ObjectMapper
import io.swagger.v3.core.jackson.ModelResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerUiConfig {
    /**
     * To use property naming strategy like in spring.jackson.property-naming-strategy
     * in application.yaml
     */
    @Bean
    fun swaggerJacksonConfig(objectMapper: ObjectMapper): ModelResolver {
        return ModelResolver(objectMapper)
    }
}