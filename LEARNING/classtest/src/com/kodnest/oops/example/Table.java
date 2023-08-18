package com.kodnest.oops.example;

public class Table {
	int seatingCount;
	int cost;
	String color;
	String brand;
	
	void allowToSit() {
		System.out.println("user can sit on the table which is of cost "+cost);
	}
	void allowToWrite() {
		System.out.println("user is allowed to write in a book keeping on a table of color ");
	}
}
