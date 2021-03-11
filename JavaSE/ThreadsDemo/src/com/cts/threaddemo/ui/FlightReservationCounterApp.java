package com.cts.threaddemo.ui;

import com.cts.threaddemo.model.Flight;
import com.cts.threaddemo.service.FlightReservationService;

public class FlightReservationCounterApp {

	public static void main(String[] args) {
		
		Flight f = new Flight(25);
		
		FlightReservationService frs1 = new FlightReservationService(f, 10);
		FlightReservationService frs2 = new FlightReservationService(f, 10);
		FlightReservationService frs3 = new FlightReservationService(f, 10);
		
		Thread t1 = new Thread(frs1, "Vamsy");
		Thread t2 = new Thread(frs2, "Varun");
		Thread t3 = new Thread(frs3, "Vinay");
		
		System.out.println("Reservation Started!");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}

		String[] seats=f.getSeats();
		for(int i=0;i<seats.length;i++) {
			System.out.println("S#"+i+"\t"+seats[i]);
		}
	}

}
