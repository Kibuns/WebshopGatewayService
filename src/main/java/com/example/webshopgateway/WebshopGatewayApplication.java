package com.example.webshopgateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebshopGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebshopGatewayApplication.class, args);
    }

}
