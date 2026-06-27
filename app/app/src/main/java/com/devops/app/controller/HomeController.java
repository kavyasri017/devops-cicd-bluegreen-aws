package com.devops.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to DevOps CI/CD Blue-Green Deployment Project";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Healthy";
    }
}
