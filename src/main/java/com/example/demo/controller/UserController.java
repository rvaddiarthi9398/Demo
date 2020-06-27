package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.excetion.AgenotFound;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	 @GetMapping("/AngularTest")
	public String AngularTest() {
		return "welcome to full stack course";
	
	} 
	 
	    @GetMapping("/Hellobean")
		public Hellobean Hellobean() {
	    	return new Hellobean("welcome to full stack course");
	    	
	    	//throw new RuntimeException("Some thing went wrong");
		
			
		} 
	 
	

		 
	    @GetMapping("/Hellobean/{name}")
		public Hellobean Hellobeanpath(@PathVariable String name) {
			return new Hellobean(String.format("welcome to full stack course, %s", name));
		
		} 
	 
	
	
	
	
	@PostMapping("/persons")
	public int save(@RequestBody User user) {
		System.out.println(user);
		userService.saveOrUpdate(user);
		return user.getId();
	
	
    } 
	
	
	
	
	   @GetMapping("/retrieveData")
	   public List<User> retrieveData() {
		
		return userService.getPersonData();
	    } 
	  
	  

	   @GetMapping("/retrieveAgeData/{age}")
	   public List<User> retrieveAgeData(@PathVariable int age) {
		
		return userService.getPersonAgeData(age);
	    }  
	 
	   @GetMapping("/countAgeData/{age}")
	   public String countAgeData(@PathVariable int age) throws AgenotFound  {
		
		   List size=null;
		 
		   size=userService.getCountByAge(age);
		   System.out.println("the age count "+size);
		   
		    if (size.size()==0  || size==null || size.isEmpty()) {
		    	throw new AgenotFound("Age not found our database");
			} else {
				return "total no of records : " + size;
			}
			    }  
	   
	   
	   
	 
	   
	   @DeleteMapping("/user/{id}")
	   public String delteById(@PathVariable int id) {
		
		List size=userService.getDeleteById(id);
		return "total no of records  deleted: " + size.size();
		
	    } 
	   
	  
	   

}
