package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Resource;
import com.jspiders.multithreading.thread.Onkar;
import com.jspiders.multithreading.thread.Prasad;

public class BikeMain {
	
	public static void main(String[] args) {
		Resource resource = new Resource();
		
		Onkar onkar =new Onkar(resource);
		onkar.setName("Onkar");
		
		Prasad prasad = new Prasad(resource);
		prasad.setName("Prasad");
		
		onkar.start();
		prasad.start();
		
	}

}
