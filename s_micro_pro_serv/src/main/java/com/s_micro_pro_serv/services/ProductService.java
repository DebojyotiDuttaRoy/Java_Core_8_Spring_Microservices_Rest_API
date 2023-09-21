package com.s_micro_pro_serv.services;

import com.s_micro_pro_serv.entity.Product;
import com.s_micro_pro_serv.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getAllProduct(){
        return repo.findAll();
    }
    public Optional<Product> getProductById(int pid){
        return repo.findById(pid);
    }
    public Product saveProduct(Product product){
        return repo.save(product);
    }
}
