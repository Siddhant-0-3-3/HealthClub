package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements IntFeedbackService 
{
@Autowired
private FeedbackRepository repo;
Feedback x=null;

	@Override
	public String saveFeedback(Feedback c) {
		c=repo.save(c);
		return c.getId();
	}

	@Override
	public List<Feedback> getAllFeedback() {
		List x=(List) repo.findAll();
		return x;
	}


}
