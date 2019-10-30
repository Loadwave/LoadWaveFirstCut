package com.skilldrive.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldrive.app.model.Product;
import com.skilldrive.app.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
    ProductService productService;
	
	@PostMapping("/createProduct")
    public void createProduct(@RequestBody Product product){
		productService.addProduct(product);
	}
		
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Long id){
	       return productService.getProduct(id);
	 } 

    
}
