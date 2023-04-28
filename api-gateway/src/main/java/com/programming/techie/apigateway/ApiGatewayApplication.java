package com.programming.techie.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);

        HashMap<String, Integer> hashMap = new HashMap<>();
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        Map<String, Integer> conHashMap = new ConcurrentHashMap<>();
        List<String> list = new ArrayList<>();
    }
}
