package com.demo.reflect;

public class User {
	private String username;
	private String userpass;
	private int age;

	public User() {
	}

	public User(String username, String userpass, int age) {
		super();
		this.username = username;
		this.userpass = userpass;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public String getUserpass() {
		return userpass;
	}

	public int getAge() {
		return age;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
