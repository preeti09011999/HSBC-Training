package com.hsbc.moviebookingapp.service.impl;
import java.util.Date;
/*
 * This class is a part of Service Layer
 */
import java.util.Map;
import java.util.Set;

import com.hsbc.moviebookingapp.entity.Movie;
import com.hsbc.moviebookingapp.entity.Seat;
import com.hsbc.moviebookingapp.entity.User;

public class TicketCounter {
	Map<Movie, Set<Seat>> ticketbooking;
	
	public TicketCounter(Map<Movie, Set<Seat>> ticketbooking){
		this.ticketbooking = ticketbooking;
	}
	// buisness logic
	synchronized public boolean bookTicket(Movie movie, Seat toBeBooked, User user) {
		// start transaction
		// check if movie exists
		// check if seat is available
		// complete payment
		// if payment complete, then book => commit transaction
		// else housefull exception => rollback transaction
		return false;
	}
	
	synchronized public boolean cancelTicket(Movie movie, Seat toBeBooked, User user) {
		// check if movie exists
		// check if seat is booked for this movie
		// do the refund of the payment
		// if refunded successfully, then make the seat available
		return false;

	}
	
	// This method tells about the total business done by the movie
	public void businessPerformance(Movie movie) {
		
	}
	// This method tells about the total business done by the movie on this particular date
	public void businessPerformance(Movie movie, Date date) {
		
	}
}
