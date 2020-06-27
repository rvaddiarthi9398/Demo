package com.example.demo.model;

import java.util.Date;


public class Todos {

	private int number;
	private String  description;
	private  Boolean verificationdone;
	private  Date targetDate;
	private String  username;
	
	protected Todos(){
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todos other = (Todos) obj;
		if (number != other.number)
			return false;
		return true;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNumber() {
		return number;
	}
	
	public Todos(int number, String description, Boolean verificationdone, Date targetDate,String username) {
		super();
		this.number = number;
		this.description = description;
		this.verificationdone = verificationdone;
		this.targetDate = targetDate;
		this.username = username;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getVerificationdone() {
		return verificationdone;
	}
	public void setVerificationdone(Boolean verificationdone) {
		this.verificationdone = verificationdone;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	
	
}
