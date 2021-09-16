package com.hsbc.moviebookingapp.entity;

public class Ticket {
	private User user;
	private Movie movie;
	private int seatNo;
	
	public Ticket(User user, Movie movie, int seatNo) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.movie = movie;
		this.seatNo = seatNo;
	}

}
