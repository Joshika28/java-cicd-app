package com.example.javacicdapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaCicdAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaCicdAppApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello from CI/CD Pipeline!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}