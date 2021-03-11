package com.cts.threaddemo.model;

public class Flight {
	
	private String[] seats;
	private int lastAllotedSeat;
		
	public Flight(int seatsCount) {
		this.seats = new String[seatsCount];
		this.lastAllotedSeat=-1;
	}
	
	public void allocate(String name) {
		lastAllotedSeat++;
		if(isAvailable(lastAllotedSeat)) {
			this.seats[lastAllotedSeat]=name;
		}
	}
	
	public boolean isAvailable(int seatNumber) {
		boolean available=false;
		
		if(seatNumber<=seats.length-1 && seatNumber>=0) {
			available= seats[seatNumber]==null;
		}
		return available;
	}

	public String[] getSeats() {
		return seats;
	}	
	
	public boolean isFull() {
		return !isAvailable(seats.length-1);
	}
}
