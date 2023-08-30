package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements IntAppointmenttService 
{
@Autowired
private AppointmentRepository repo;
Appointment x=null;

	@Override
	public Integer saveAppointment(Appointment c) {
		c=repo.save(c);
		return c.getScheduleId();
	}

	@Override
	public List<Appointment> getAllAppointments() {
		List x=(List) repo.findAll();
		return x;
	}

	@Override
	public Appointment getOneAppointment(Integer id) {
	Optional<Appointment> opt=repo.findById(id);
		return opt.get();
	}

	@Override
	public void deleteAppointment(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
