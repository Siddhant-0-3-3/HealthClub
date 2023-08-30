package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentRestController 
{
	@Autowired
	private IntAppointmenttService service;
	
	//1. to save the data
	@PostMapping
	public ResponseEntity<String> saveCourse(@RequestBody Appointment c)
	{
		Integer id=service.saveAppointment(c);
		ResponseEntity<String> resp=new ResponseEntity("Employee"+id+" Created",HttpStatus.CREATED);
		return resp;
	}
//2. to view the data	
@GetMapping("/all")
public List<Appointment> getAllEmployee()
{
	List<Appointment> allEmployee=service.getAllAppointments();
	return allEmployee;
	}

//3. Fetch course by id.
@GetMapping("/{id}")
public ResponseEntity<?> getEmployeeId(@PathVariable Integer id)
{
	Appointment emp=service.getOneAppointment(id);
	ResponseEntity<?> resp=null;
	try
	{
	 resp=ResponseEntity.ok(emp);
	}
	catch(Exception ae)
	{
	 resp=new ResponseEntity<String>("Unable to fetch Data",HttpStatus.INTERNAL_SERVER_ERROR);
	}
		return resp;
	
}

@PutMapping("/{id}")
public ResponseEntity<String> updateAppointment(@PathVariable Integer id, @RequestBody Appointment updatedAppointment) {
    try {
        Appointment existingAppointment = service.getOneAppointment(id);

        if (existingAppointment == null) {
            return new ResponseEntity<>("Appointment not found", HttpStatus.NOT_FOUND);
        }

        // Update the fields of the existing appointment with the fields from the updatedAppointment
        existingAppointment.setTrainerName(updatedAppointment.getTrainerName());
        existingAppointment.setWorkoutName(updatedAppointment.getWorkoutName());
        existingAppointment.setDuration(updatedAppointment.getDuration());

        service.saveAppointment(existingAppointment);

        return new ResponseEntity<>("Appointment updated successfully", HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>("Error updating appointment", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

// 5. Delete appointment
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteAppointment(@PathVariable Integer id) {
    try {
        Appointment existingAppointment = service.getOneAppointment(id);

        if (existingAppointment == null) {
            return new ResponseEntity<>("Appointment not found", HttpStatus.NOT_FOUND);
        }

        service.deleteAppointment(id);

        return new ResponseEntity<>("Appointment deleted successfully", HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>("Error deleting appointment", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
}
