package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IntUserService 
{
@Autowired
private UserRepository repo;
User x=null;

	@Override
	public Integer saveUser(User c) {
		c=repo.save(c);
		return c.getUserId();
	}

	@Override
	public List<User> getAllUsers() {
		List x=(List) repo.findAll();
		return x;
	}

	@Override
	public User getOneUser(Integer id) {
	Optional<User> opt=repo.findById(id);
		return opt.get();
	}

}
