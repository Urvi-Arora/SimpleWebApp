package com.urvi.SimpleWebApp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.urvi.SimpleWebApp.service.ProductService;
import com.urvi.SimpleWebApp.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@RestController 
public class ProductController {
    
    @Autowired 
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getProducts();
    } 

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    } 
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    

}