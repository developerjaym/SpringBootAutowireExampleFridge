package com.example.fridge;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PreDestroy;
import java.util.Scanner;

@Configuration
public class ApplicationConfiguration {
    @Bean(name = "amazon")
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().rootUri("https://www.amazon.com").build();
    }

    @Bean(name = "walmart")
    public RestTemplate wmRestTemplate() {
        // Spring Boot doesn't know how to create a RestTemplate
        // so I need to do the building of the RestTemplate
        return new RestTemplateBuilder().rootUri("https://www.walmart.com").build();
    }

    @Bean
    public Scanner getScanner() {
        // Spring Boot doesn't know how to create a scanner
        // So I need to do 'new Scanner...'
        return new Scanner(System.in);
    }
}
