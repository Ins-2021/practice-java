package com.ins2021.inseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsEurekaApplication.class, args);
    }

}
