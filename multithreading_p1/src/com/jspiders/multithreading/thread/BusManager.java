package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Booking;

public class BusManager extends Thread {
	Booking booking;

	public BusManager(Booking booking) {
		super();
		this.booking = booking;
	}
	
	@Override
	public void run() {
		booking.extraBus(50);
	}
	

}
