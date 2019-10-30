package com.skilldrive.app.controller;

import com.skilldrive.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.skilldrive.app.model.User;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/getUsers")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user){
        userService.addUser(user);
    }
    
    @PostMapping("/createUser2")
	 @Consumes("text/html") 
    public void createUser2(@BeanParam User user){
	  userService.addUser(user); }


    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PutMapping("/users/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUSer(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}