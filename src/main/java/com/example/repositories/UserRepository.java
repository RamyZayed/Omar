package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.User;

import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByfamilyNameContaining(String fam);

}
