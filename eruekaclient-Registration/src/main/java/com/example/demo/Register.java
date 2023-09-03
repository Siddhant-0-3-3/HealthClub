package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Register 
{
@Id
@GeneratedValue
private Integer userId;
private String UserName;
private Integer age ;
private Double bmi;
private String email;
public Register(Integer userId, String userName, Integer age, Double bmi, String email) {
	super();
	this.userId = userId;
	UserName = userName;
	this.age = age;
	this.bmi = bmi;
	this.email = email;
}
public Register() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Register [userId=" + userId + ", UserName=" + UserName + ", age=" + age + ", bmi=" + bmi + ", email="
			+ email + "]";
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Double getBmi() {
	return bmi;
}
public void setBmi(Double bmi) {
	this.bmi = bmi;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
