package com.hsbc.moviebookingapp.task;

import com.hsbc.moviebookingapp.entity.Movie;
import com.hsbc.moviebookingapp.entity.Ticket;
import com.hsbc.moviebookingapp.entity.User;

public class CancelTicket {
//	make the seat available
	public Ticket cancelMovieTicket(Movie movie, int seatNo, User user) {
		movie.getSeat(seatNo).setSeatAvailable(true);
		return new Ticket(null, movie, seatNo);
	}
}
