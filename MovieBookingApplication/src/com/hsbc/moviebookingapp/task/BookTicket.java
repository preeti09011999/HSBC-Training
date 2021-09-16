package com.hsbc.moviebookingapp.task;

import com.hsbc.moviebookingapp.entity.Movie;
import com.hsbc.moviebookingapp.entity.Ticket;
import com.hsbc.moviebookingapp.entity.User;
import com.hsbc.moviebookingapp.exception.SeatNotAvailableException;

public class BookTicket {
	
	public Ticket bookMovieTicket(Movie movie, int seatNo, User user) throws SeatNotAvailableException {
		if(movie.getSeat(seatNo).isSeatAvailable()) {
//			add payment method
			movie.getSeat(seatNo).setSeatAvailable(false);
			return new Ticket(user, movie, seatNo);
		}
		else throw new SeatNotAvailableException();
	}
	
}
