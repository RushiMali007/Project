package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Booking;
import com.jspiders.multithreading.thread.Passenger;
import com.jspiders.multithreading.thread.BusManager;

public class BusMain {
	public static void main(String[] args) {
		Booking booking= new Booking(5);
		
		Passenger passenger = new Passenger(booking);
		BusManager busManager = new BusManager(booking);
		
		passenger.start();
		busManager.start();
	}

}
