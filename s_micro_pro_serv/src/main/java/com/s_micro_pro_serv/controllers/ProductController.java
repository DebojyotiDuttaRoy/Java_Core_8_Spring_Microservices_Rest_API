package com.s_micro_pro_serv.controllers;

import com.s_micro_pro_serv.entity.Product;
import com.s_micro_pro_serv.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/")
    public List<Product> getProducts(){
        return service.getAllProduct();
    }

    @PostMapping("/")
    public Product saveProducts(@RequestBody Product p){
        return service.saveProduct(p);
    }

    @GetMapping("{id}")
    public Optional<Product> getProductById(@PathVariable("id") int pid){
        return service.getProductById(pid);
    }
}