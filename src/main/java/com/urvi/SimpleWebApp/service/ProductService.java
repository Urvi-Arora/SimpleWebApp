package com.urvi.SimpleWebApp.service;

import com.urvi.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService{
    List<Product> products=new ArrayList<>(Arrays.asList(
        new Product(1,"Laptop", 50000),
        new Product(2,"Mobile", 20000),
        new Product(3,"Tablet", 30000)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int id){
        return products.stream().filter(p -> p.getProdId() == id).findFirst().orElse(null);
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}