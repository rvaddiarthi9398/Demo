package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todos;


@Service
public class TodosService {
	
	
	private static List<Todos> todoslist=new ArrayList();
	private static int countnum=0;
	
	static {
		todoslist.add(new Todos(++countnum,"learn java",false,new Date(),"welcome"));
		todoslist.add(new Todos(++countnum,"learn to advjava",false,new Date(),"welcome"));
		todoslist.add(new Todos(++countnum,"learn to microservicesa",false,new Date(),"welcome"));
		todoslist.add(new Todos(++countnum,"servlets",false,new Date(),"welcome"));
	
	}

	
	public List<Todos> retriedata(){
		return todoslist;
		
	}
	

public Todos deleteByid(int id)
{ 

	Todos todo =findById(id);
	if(todo==null) return null;
	
	if(todoslist.remove(todo)) {
		return todo;
	}
	
	return null;  
    
}




public Todos findById(int id) {
	for(Todos todos : todoslist) {
		if(todos.getNumber()==id){
			 return todos;
			}
		
	
	}
	
	return null;
}

public Todos save(Todos todo) {
	if (todo.getNumber()==-1 || todo.getNumber()==0 ) {
		
		todo.setNumber(++countnum);
		
		todoslist.add(todo);
		 System.out.println("Create user1"+todo);
	} else {
		deleteByid(todo.getNumber());
		todoslist.add(todo);
	}
	return todo;
}















	
}
	

