package com.kodnest.oopsjava;

public class MobileApp {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Sansung", "Black", 150000);
		System.out.println(mobile.brand+" "+mobile.color+" "+mobile.cost);
		
		Mobile mobile1 = new Mobile("Apple", "White", 250000);
		System.out.println(mobile1.brand+" "+mobile1.color+" "+mobile1.cost);
	}

}
