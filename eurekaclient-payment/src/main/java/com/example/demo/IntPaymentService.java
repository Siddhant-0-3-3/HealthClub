package com.example.demo;

import java.util.List;

public interface IntPaymentService 
{
public Integer savePayment(Payment c);
public List<Payment> getAllPayments();
public Payment getOnePayment(Integer id);
}
