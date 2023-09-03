package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment 
{
@Id
//@GeneratedValue
private Integer userId;
private String trainerName;
private Integer days;
private Double amount;

@Override
public String toString() {
	return "Payment [userId=" + userId + ", trainerId=" + trainerName + ", days=" + days + ", amount=" + amount + "]";
}

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

public String getTrainerName() {
	return trainerName;
}

public void setTrainerName(String trainerId) {
	this.trainerName = trainerName;
}

public Integer getDays() {
	return days;
}

public void setDays(Integer days) {
	this.days = days;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public Payment(Integer userId, Integer trainerId, Integer days, Double amount) {
	super();
	this.userId = userId;
	this.trainerName = trainerName;
	this.days = days;
	this.amount = amount;
}

public Payment() {
	super();
}


}