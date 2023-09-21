package com.s_mic_hys_api_gateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallbackController {
    @GetMapping("custService")
    public String custService(){
        return "customer-service is down...";
    }
    @GetMapping("productService")
    public String productService(){
        return "product-service is down...";
    }
}
