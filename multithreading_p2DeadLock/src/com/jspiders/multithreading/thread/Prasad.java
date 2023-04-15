package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Resource;

public class Prasad extends Thread {
	
	Resource resource ;

	public Prasad(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		synchronized (resource.key) {
			System.out.println(this.getName()
					+" Has "+ resource.key + "and Waiting for Bike");
			synchronized (resource.bike) {
				System.out.println(this.getName()
						+" Has "+ resource.bike+ "and waiting for Key");	
			}
			System.out.println(this.getName()+" Give "+ resource.bike);
			
		}
		System.out.println(this.getName()+" Give "+ resource.key);
	}

}
