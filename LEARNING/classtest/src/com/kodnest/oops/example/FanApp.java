package com.kodnest.oops.example;

public class FanApp {

	public static void main(String[] args) {
		Fan f1= new Fan();
		f1.wingCount=3;
		f1.cost=4000;
		f1.color="Black";
		f1.brand="Bajaj";
		f1.canRotate();
		f1.canBlowAir();
		System.out.println(f1.wingCount+" "+f1.cost+" "+f1.color+" "+f1.brand);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		Fan f2= new Fan();
		f2.wingCount=4;
		f2.cost=6000;
		f2.color="White";
		f2.brand="Panasonic";
		f2.canRotate();
		f2.canBlowAir();
		System.out.println(f2.wingCount+" "+f2.cost+" "+f2.color+" "+f2.brand);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Fan f3= new Fan();
		f3.wingCount=5;
		f3.cost=8000;
		f3.color="Brown";
		f3.brand="Crompton";
		f3.canRotate();
		f3.canBlowAir();
		System.out.println(f3.wingCount+" "+f3.cost+" "+f3.color+" "+f3.brand);
	}

}
