package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment 
{
@Id
@GeneratedValue
private Integer userId;
private Integer trainerId;
private Integer days;
private Double amount;

@Override
public String toString() {
	return "Payment [userId=" + userId + ", trainerId=" + trainerId + ", days=" + days + ", amount=" + amount + "]";
}

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

public Integer getTrainerId() {
	return trainerId;
}

public void setTrainerId(Integer trainerId) {
	this.trainerId = trainerId;
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
	this.trainerId = trainerId;
	this.days = days;
	this.amount = amount;
}

public Payment() {
	super();
}


}