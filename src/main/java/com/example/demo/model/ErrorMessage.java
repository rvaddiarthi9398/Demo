package com.example.demo.model;




public class ErrorMessage {
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorMessage(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	private int code;
	private String  message;
	
	
	
	

}
