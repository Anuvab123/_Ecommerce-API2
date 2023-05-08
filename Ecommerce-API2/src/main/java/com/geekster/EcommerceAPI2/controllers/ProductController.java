package com.geekster.EcommerceAPI2.controllers;

import com.geekster.EcommerceAPI2.models.Product;
import com.geekster.EcommerceAPI2.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    IProductRepository productRepository;

    @PostMapping(value="/product")
    public void createProduct(@RequestBody Product product){
        productRepository.save(product);
    }

    @GetMapping(value="/product/{cat}")
    public List<Product> getAllProducts(@PathVariable String cat){
         return productRepository.findProductsByCategory(cat);
    }
}
