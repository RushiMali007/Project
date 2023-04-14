package com.jspiders.multithreading.resource;

public class Booking {
	int availableTicket;
	
	public Booking(int availableTicket) {
		super();
		this.availableTicket = availableTicket;
	}

	public synchronized void bookTicket(int noOfTicket) {
		System.out.println("Trying to Booking "+ noOfTicket+ " Ticket.");
		if (noOfTicket > availableTicket) {
			System.out.println(noOfTicket+ " Tickets not available..!");
			System.out.println("Please wait ...!!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		availableTicket-= noOfTicket;
		System.out.println(noOfTicket+" Tickets Purchased");
		System.out.println("Now available Tickets :"+ availableTicket);
	}
	
	public synchronized void extraBus(int noOfTicket) {
		System.out.println("New Bus Assingning " + noOfTicket + " seats are Empty");
		availableTicket += noOfTicket;
		System.out.println("Now available Ticket :"+ availableTicket);
		this.notify();
	}

}
