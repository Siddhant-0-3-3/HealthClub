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

import com.victorp.model.Trainer;
@RestController
@RequestMapping("/payment")
public class PaymentRestController {

    @Autowired
    private IntPaymentService service;

    private final RestTemplate restTemplate = new RestTemplate();
    private final String userMicroserviceUrl = "http://172.31.7.158:9086/register/1";
    
   

    @PostMapping
    public ResponseEntity<String> saveCourse(@RequestBody Payment c) {
        // Fetch user details
        ResponseEntity<User> userResponse = restTemplate.getForEntity(userMicroserviceUrl + c.getUserId(), User.class);
        User user = userResponse.getBody();

    

        // Create Payment object with retrieved data
        Payment payment = new Payment();
        payment.setUserId(user.getUserId());
        payment.setTrainerName(c.getTrainerName());
        payment.setDays(c.getDays());
        payment.setAmount(c.getAmount());

        Integer id = service.savePayment(payment);
        ResponseEntity<String> resp = new ResponseEntity<>("Product " + id + " Created", HttpStatus.CREATED);
        return resp;
    }

    @GetMapping("/all")
    public List<Payment> getAllProduct() {
        List<Payment> allProduct = service.getAllPayments();
        return allProduct;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductId(@PathVariable Integer id) {
        Payment pro = service.getOnePayment(id);
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
