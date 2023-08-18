package com.kodnest.oops.example;

public class Fan {
	//DataMembers//
	int wingCount;
	int cost;
	String color;
	String brand;
	
	//Functionalities//
	void canRotate() {
		System.out.println("The rotating fan is of "+color+" and its brand is "+brand);
	}
	void canBlowAir() {
		System.out.println("The fan blowing air has "+wingCount+" wings" +" and it costs "+cost+"Rs");
	}
}
