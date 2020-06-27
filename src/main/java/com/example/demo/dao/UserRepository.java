package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	public List<User> findByAge(int age);

	public List<User> countByAge(int age);

	public List<User> deleteById(int id);
}
