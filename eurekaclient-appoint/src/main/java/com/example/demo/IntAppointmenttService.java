package com.example.demo;

import java.util.List;

public interface IntAppointmenttService 
{
public Integer saveAppointment(Appointment c);
public List<Appointment> getAllAppointments();
public Appointment getOneAppointment(Integer id);
public void deleteAppointment(Integer id);
}
