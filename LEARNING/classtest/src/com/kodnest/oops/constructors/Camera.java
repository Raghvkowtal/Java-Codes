package com.kodnest.oops.constructors;

public class Camera {
	String brand;
	String color;
	int cost;
	
	void captureImage() {
		System.out.println("camera of color "+color+"and brand "+brand+"which costs "+cost);
	}
	void displayImage() {
		System.out.println("camera of color "+color+"and brand "+brand+"which costs "+cost);
	}
	
	public Camera(String x, String y, int z) {
		color=x;
		brand =y;
		cost =z;
	}
}
