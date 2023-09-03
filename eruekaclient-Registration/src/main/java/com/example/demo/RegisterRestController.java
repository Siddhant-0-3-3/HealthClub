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
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/register")
public class RegisterRestController {

    @Autowired
    private IntRegisterService service;

//    private final RestTemplate restTemplate = new RestTemplate();
//    private final String userMicroserviceUrl = "http://172.31.7.158:9086/register/1";
    
   
    
    
    @PostMapping
    public ResponseEntity<String> saveCourse(@RequestBody Register c) {
      
    
    	Integer id=service.saveRegister(c);
		ResponseEntity<String> resp=new ResponseEntity("User "+id+" Created",HttpStatus.CREATED);
		return resp;
        // Create Register object with retrieved data
//        Register Register = new Register();
//        Register.setUserId(c.getUserId());
//        Register.setUserName(c.getUserName());
//        Register.setAge(c.getAge());
//        Register.setBmi(c.getBmi());
//        Register.setEmail(c.getEmail());

//        Integer id = service.saveRegister(Register);
//        ResponseEntity<String> resp = new ResponseEntity<>("User" + id + " Created", HttpStatus.CREATED);
//        return resp;
    }

    @GetMapping("/all")
    public List<Register> getAllProduct() {
        List<Register> allProduct = service.getAllRegister();
        return allProduct;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductId(@PathVariable Integer id) {
        Register pro = service.getOneRegister(id);
        ResponseEntity<?> resp = null;
        try {
            resp = ResponseEntity.ok(pro);
        } catch (Exception ae) {
            resp = new ResponseEntity<>("Unable to fetch Data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return resp;
    }

    // Other methods...

}
