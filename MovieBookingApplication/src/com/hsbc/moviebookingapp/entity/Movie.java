package com.hsbc.moviebookingapp.entity;

import java.util.List;

import com.hsbc.moviebookingapp.exception.MovieAlreadyExists;

public class Movie {
	
	private String movieName;
	private int ticketPrice;
	private List<Seat> seat;
	public Movie(String movieName, int ticketPrice) throws MovieAlreadyExists {
		if(checkIfMovieExists(movieName)) throw new MovieAlreadyExists();
		else {
			this.movieName = movieName;
			this.ticketPrice = ticketPrice;
		}
	}
	
	
	public Seat getSeat(int seatNo) {
		return seat.get(seatNo);
	}


	public void setSeat(Seat seat) {
		this.seat.add(seat);
	}


	private boolean checkIfMovieExists(String movieName) {
		// TODO Auto-generated method stub
		return false;
	}


	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
}
