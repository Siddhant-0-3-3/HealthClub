package com.example.demo;

import java.util.List;

public interface IntRegisterService 
{
public Integer saveRegister(Register c);
public List<Register> getAllRegister();
public Register getOneRegister(Integer id);
public void deleteRegister(Integer id);
//public List<String> displayTrainers();
}
