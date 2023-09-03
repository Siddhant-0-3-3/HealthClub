package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements IntRegisterService 
{
//	List<String> trainers=new ArrayList<String>(Arrays.asList("akshay","sidhanth","harsh"));

	
@Autowired(required=false)
private RegisterRepository repo;
Register x=null;

	@Override
	public Integer saveRegister(Register c) {
		c=repo.save(c);
		return c.getUserId();
	}

	@Override
	public List<Register> getAllRegister() {
		List x=(List) repo.findAll();
		return x;
	}

	@Override
	public Register getOneRegister(Integer id) {
	Optional<Register> opt=repo.findById(id);
		return opt.get();
	}

	@Override
	public void deleteRegister(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	

}
