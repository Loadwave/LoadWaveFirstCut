package com.skilldrive.app.controller;

import java.util.Map;

import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.skilldrive.app.model.User;
import com.skilldrive.app.service.UserService;


@Controller
public class UserController2 {
	
	@Autowired
    UserService userService;
	
	@GetMapping({"/", "/hello"})
    public String home(Map<String, String> model) {
        model.put("message", "SkillDrive Solutions");
        return "index";
    }
	
	@GetMapping("/userForm")
    public String greetingForm(Model model) {
        model.addAttribute("user", new User());
        return "User";
    }

    @PostMapping("/addUser")
    @Consumes("text/html")
    public String greetingSubmit(@ModelAttribute User user) {
    	userService.addUser(user);
        return "result";
    }

}
