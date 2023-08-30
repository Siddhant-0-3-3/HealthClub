package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User 
{
@Id
@GeneratedValue
private int userId;
private String userName;
private long mobile;
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", mobile=" + mobile + ", age=" + age + ", email="
			+ email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
}

private int age;
private String email;
public User(int userId, String userName, long mobile, int age, String email, String password, String confirmPassword) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.mobile = mobile;
	this.age = age;
	this.email = email;
	this.password = password;
	this.confirmPassword = confirmPassword;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

private String password;
private String confirmPassword;

public User() {
	super();
}


}
