package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class FeedbackRestController 
{
	@Autowired
	private IntFeedbackService service;

	
	//1. to save the data
	@PostMapping
	public ResponseEntity<String> saveFeedback(@RequestBody Feedback c)
	{
		String id=service.saveFeedback(c);
		ResponseEntity<String> resp=new ResponseEntity("Student"+id+" Created",HttpStatus.CREATED);
		return resp;
	}
//2. to view the data	
@GetMapping("/all")
public List<Feedback> getAllFeedback()
{
	List<Feedback> allStudent=service.getAllFeedback();
	return allStudent;
	}

@PostMapping("/email")
public void sendMail(@RequestBody EmailRequest emailRequest) {
service.sendEmail(emailRequest);
}
}