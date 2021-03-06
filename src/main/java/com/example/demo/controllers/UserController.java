package com.example.demo.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return service.getAll();
	}

	@PostMapping("/users")
	public String addOne(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@GetMapping("/user")
	public List<User> getFamilyUsers(@RequestParam String fam) {
		return service.getbyFamily(fam);
	}
}