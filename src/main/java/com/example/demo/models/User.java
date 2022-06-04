package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer id = null;
	
	@Column(name = "user_name",nullable = false)
	private String userName;
	
	@Column(name = "user_family",nullable = false)
	private String familyName;

	public User(Integer id, String userName,String familyName) {
		super();
		this.id = id;
		this.userName = userName;
		this.familyName = familyName;
	}

	public User() {
		super();
// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}