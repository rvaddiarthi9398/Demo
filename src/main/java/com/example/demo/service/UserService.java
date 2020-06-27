package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;



@Service
@Transactional
public class UserService {
	
	
	@Autowired
	private UserRepository 	userRepository;
	

	  public void saveOrUpdate(User user) {
		  userRepository.save(user);
	    }
	  
	  
	  
	   
	   public List<User>  getPersonData() {
	        return userRepository.findAll();
	    }
	
	   
	   
	   public List<User>  getPersonAgeData(int age) {
	        return userRepository.findByAge(age);
	    }
	   
	   public List<User>  getCountByAge(int age) {
	        return userRepository.countByAge(age);
	    }
	   
	   public List<User>  getDeleteById(int id) {
	        return userRepository.deleteById(id);
	    }
	   
	   
	}
