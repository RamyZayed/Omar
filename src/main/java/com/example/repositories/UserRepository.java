package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.User;

import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Integer>{

}
