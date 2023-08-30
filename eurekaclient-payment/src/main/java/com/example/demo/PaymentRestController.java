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
@RequestMapping("/payment")
public class PaymentRestController 
{
	@Autowired
	private IntPaymentService service;
	
	//1. to save the data
	@PostMapping
	public ResponseEntity<String> saveCourse(@RequestBody Payment c)
	{
		Integer id=service.savePayment(c);
		ResponseEntity<String> resp=new ResponseEntity("Product"+id+" Created",HttpStatus.CREATED);
		return resp;
	}
//2. to view the data	
@GetMapping("/all")
public List<Payment> getAllProduct()
{
	List<Payment> allProduct=service.getAllPayments();
	return allProduct;
	}

//3. Fetch course by id.
@GetMapping("/{id}")
public ResponseEntity<?> getProductId(@PathVariable Integer id)
{
	Payment pro=service.getOnePayment(id);
	ResponseEntity<?> resp=null;
	try
	{
	 resp=ResponseEntity.ok(pro);
	}
	catch(Exception ae)
	{
	 resp=new ResponseEntity<String>("Unable to fetch Data",HttpStatus.INTERNAL_SERVER_ERROR);
	}
		return resp;
	
}

}
