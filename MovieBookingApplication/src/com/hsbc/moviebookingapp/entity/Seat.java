package com.hsbc.moviebookingapp.entity;

import com.hsbc.moviebookingapp.exception.SeatAlreadyExistsException;

public class Seat {
	private int seatId;
	private boolean seatAvailable;
	
	public Seat(int seatId, boolean seatAvailable) throws SeatAlreadyExistsException {
		if(seatAlreadyExists(seatId)) throw new SeatAlreadyExistsException();
		this.seatId = seatId;
		this.seatAvailable = seatAvailable;
	}

	private boolean seatAlreadyExists(int seatId) {
		// TODO Auto-generated method stub
		return true;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public boolean isSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(boolean seatAvailable) {
		this.seatAvailable = seatAvailable;
	}
	
	
	
}
