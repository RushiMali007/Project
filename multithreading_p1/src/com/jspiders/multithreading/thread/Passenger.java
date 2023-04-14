package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Booking;

public class Passenger extends Thread {
	
	Booking booking;

	public Passenger(Booking booking) {
		super();
		this.booking = booking;
	}
	
	@Override
	public void run() {
		booking.bookTicket(15);
	}
	
	

}
