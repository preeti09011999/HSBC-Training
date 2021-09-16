package com.hsbc.exception;

public class UserAlreadyExistsException extends Exception{
	private String username;
	public UserAlreadyExistsException(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return username + " Already Exists";
	}
}
