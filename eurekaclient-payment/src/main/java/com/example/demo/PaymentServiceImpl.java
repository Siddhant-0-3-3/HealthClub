package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements IntPaymentService 
{
@Autowired
private PaymentRepository repo;
Payment x=null;

	@Override
	public Integer savePayment(Payment c) {
		c=repo.save(c);
		return c.getUserId();
	}

	@Override
	public List<Payment> getAllPayments() {
		List x=(List) repo.findAll();
		return x;
	}

	@Override
	public Payment getOnePayment(Integer id) {
	Optional<Payment> opt=repo.findById(id);
		return opt.get();
	}

}
