package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/register")

public class UserRestController 
{
	@Autowired
	private IntUserService service;
	
	//1. to save the data
	@PostMapping
	public ResponseEntity<String> saveUser(@RequestBody User c)
	{
		Integer id=service.saveUser(c);
		ResponseEntity<String> resp=new ResponseEntity("Course"+id+" Created",HttpStatus.CREATED);
		return resp;
	}
//2. to view the data	
@GetMapping("/all")
public List<User> getAllCourse()
{
	List<User> allCourse=service.getAllUsers();
	return allCourse;
	}

//3. Fetch course by id.
@GetMapping("/{id}")
public ResponseEntity<?> getCourseId(@PathVariable Integer id)
{
	User course=service.getOneUser(id);
	ResponseEntity<?> resp=null;
	try
	{
	 resp=ResponseEntity.ok(course);
	}
	catch(Exception ae)
	{
	 resp=new ResponseEntity<String>("Unable to fetch Data",HttpStatus.INTERNAL_SERVER_ERROR);
	}
		return resp;
	
}

//login



}
/* Postman
{
"cid": 105,
"cname": "priya",
"cfee": 5000.0,
"ctype": "advance java",
"discount": 200.0,
"gst": 300.0
}
*/