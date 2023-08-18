package com.kodnest.oopsjava;

public class Mobile {
	String brand;
	String color;
	int cost;
	
	public Mobile(String brand, String color, int cost) {
		brand=brand;
		cost=cost;
		color=color;
		
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	
	void allowToCall() {
		System.out.println("call done");
	}
	void alloeToPlay() {
		System.out.println("Play BGMI");
	}
}
