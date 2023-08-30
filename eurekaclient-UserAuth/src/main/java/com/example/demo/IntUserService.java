package com.example.demo;

import java.util.List;

public interface IntUserService 
{
public Integer saveUser(User c);
public List<User> getAllUsers();
public User getOneUser(Integer id);
}
