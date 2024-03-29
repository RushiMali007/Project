package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Resource;

public class Onkar extends Thread {
	
	Resource resource ;

	public Onkar(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		synchronized (resource.bike) {
			System.out.println(this.getName()+" Has "+ resource.bike + "and waiting for Key");
			synchronized (resource.key) {
				System.out.println(this.getName()+" Has "+ resource.key + " and waiting for Bike");	
			}
			System.out.println(this.getName()+" Give "+ resource.key);
			
		}
		System.out.println(this.getName()+" Give "+ resource.bike);
	}

}
