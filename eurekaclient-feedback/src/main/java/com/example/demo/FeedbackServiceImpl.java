package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements IntFeedbackService 
{
	@Autowired 
	private JavaMailSender javaMailSender;
	
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

	@Override
	public void sendEmail(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		SimpleMailMessage mailMsg=new SimpleMailMessage();
//		mailMsg.setFrom("hsakshay@jssateb.ac.in");
		mailMsg.setTo(emailRequest.getRecipient());
		mailMsg.setText(emailRequest.getMsgBody());
		mailMsg.setSubject(emailRequest.getSubject());
		
		javaMailSender.send(mailMsg);
	}


}
