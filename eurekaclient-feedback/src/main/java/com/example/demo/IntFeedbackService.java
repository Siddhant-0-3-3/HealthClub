package com.example.demo;

import java.util.List;

public interface IntFeedbackService 
{
public String saveFeedback(Feedback c);
public List<Feedback> getAllFeedback();
public void sendEmail(EmailRequest emailRequest);
}
