package com.skilldrive.app.controller;

import java.util.Map;

import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.skilldrive.app.model.Product;
import com.skilldrive.app.model.User;
import com.skilldrive.app.service.UserService;
import com.skilldrive.app.service.ProductService;


@Controller
public class ProductController2 {
	
	@Autowired
	ProductService productService;
	
	
	
	@GetMapping("/productForm")
    public String greetingForm(Model model) {
        model.addAttribute("product", new Product());
        return "product";
    }

    @PostMapping("/addProduct")
    @Consumes("text/html")
    public String greetingSubmit(@ModelAttribute Product product) {
    	productService.addProduct(product);
        return "result2";
    }

}
