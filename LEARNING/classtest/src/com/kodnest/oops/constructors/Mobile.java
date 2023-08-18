package com.kodnest.oops.constructors;

public class Mobile {
	String brand;
	String color;
	int cost;
	
	void allowToCall() {
		System.out.println("call done");
	}
	
	void allowToPlay() {
		System.out.println("playing BGMI");
	}
	
	public Mobile(String a, String b, int c) {
		brand=a;
		color=b;
		cost=c;
		

		

	}
}
