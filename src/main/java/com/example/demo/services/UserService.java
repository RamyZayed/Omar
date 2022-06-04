package com.example.demo.services;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.User;
import com.example.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> getAll() {
		return userRepository.findAll();
	}

	public String addUser(User user) {
		userRepository.save(user);
		return "success";
	}
}