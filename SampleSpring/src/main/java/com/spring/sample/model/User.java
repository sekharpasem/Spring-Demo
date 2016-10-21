package com.spring.sample.model;

public class User {
	private String name;
	private String username;
	private String phone;

	public User() {

	}

	public User(String name, String username, String phone) {
		super();
		this.name = name;
		this.username = username;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
