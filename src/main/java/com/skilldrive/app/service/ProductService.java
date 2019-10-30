package com.skilldrive.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skilldrive.app.model.Product;
import com.skilldrive.app.model.User;
import com.skilldrive.app.repository.ProductRepository;
import com.skilldrive.app.repository.UserRepository;

@Component
public class ProductService {
	
	@Autowired
    ProductRepository productRepository;

    public void addProduct(Product product){
    	productRepository.save(product);
    }
    
    public Product getProduct(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(() -> new RuntimeException("Couldn't find User with Id:" + id));
    }

}
