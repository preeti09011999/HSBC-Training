package com.hsbc.moviebookingapp.entity;

public class User {
	
	private String name;
	private int idProof;
	private int contact;
	public User(String name, int idProof, int contact) {
		this.name = name;
		this.idProof = idProof;
		this.contact = contact;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdProof() {
		return idProof;
	}
	public void setIdProof(int idProof) {
		this.idProof = idProof;
	}
	
}
