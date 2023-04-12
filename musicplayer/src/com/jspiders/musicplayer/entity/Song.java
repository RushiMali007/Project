package com.jspiders.musicplayer.entity;

public class Song {
	private int id;
	private String Song_name;
	private String Singer_name;
	private double Duration;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSong_name(String Song_name) {
		this.Song_name = Song_name;
	}
	public void setSinger_name(String Singer_name) {
		this.Singer_name= Singer_name;
	}
	public void setDuration(double Duration) {
		this.Duration= Duration;
	}
	
	public Song(int id, String Song_name, String Singer_name, double Duration){
		this.id = id;
		this.Song_name = Song_name;
		this.Singer_name= Singer_name;
		this.Duration=Duration;	
	}
	
	@Override
	public String toString () {
		System.out.println("=======================");
		return " id :"+id+ ",\n Song Name:"+Song_name+",  \n Singer Name:"
				+Singer_name+", \n Duration :"+Duration+" ";
	}
	
	
	
}
