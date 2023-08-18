package com.kodnest.oops.example;

public class Mobile {
	String brand;
	String color;
	int cost;
	
	public Mobile(String a, String b, int c) {
		brand=a;
		color=b;
		cost=c;
	}
	public Mobile() {
		brand="Apple";
		color="Black";
		cost=125000;
	}
	
	public Mobile(String x)
	{
		brand=x;
		cost=40000;
	}
	public Mobile(int c) {
		cost=c;
		brand="GIONEE";
		color="Silver";
	}
	void allowToCall() {
		System.out.println("call done");
	}                                                                                                                                              
	
	void allowToPlay() {
		System.out.println("playing BGMI");
	}
}
