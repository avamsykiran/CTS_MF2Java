package com.cts.threaddemo.service;

import com.cts.threaddemo.exception.NoMoreSeatsException;
import com.cts.threaddemo.model.Flight;

public class FlightReservationService implements Runnable{

	private Flight flight;	
	private int seatsNeeded;	
	
	public FlightReservationService(Flight flight, int seatsNeeded) {
		this.flight = flight;
		this.seatsNeeded = seatsNeeded;		
	}
	
	public void reserve() throws NoMoreSeatsException {
		String name = Thread.currentThread().getName();
		
		if(flight.isFull()) {
			throw new NoMoreSeatsException("All Seats Are Filled!");			
		}
		
		int i=1;
		synchronized (flight){			
			try {
				for(;i<=seatsNeeded;i++) {
					if(flight.isFull()) {
						throw new NoMoreSeatsException("All Seats Are Filled!");			
					}
					flight.allocate(name);
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
				
		if(i-1==seatsNeeded) {
			System.out.println(name + " reservation successful");
		}else {
			System.out.println(name + " reservation aborted");
		}		
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		try {
			reserve();
		} catch (NoMoreSeatsException e) {
			System.out.println(name + ">>" + e.getMessage());
		}
	}
}
