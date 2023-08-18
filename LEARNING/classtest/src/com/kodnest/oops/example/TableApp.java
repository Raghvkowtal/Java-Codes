package com.kodnest.oops.example;

public class TableApp {

	public static void main(String[] args) {
		Table t1 = new Table();
		Table t2 = new Table();
		
		t1.seatingCount=6;
		t1.cost=4500;
		t1.color="black";
		t1.brand="Greenply";
		t1.allowToSit();
		t1.allowToWrite();
		System.out.println("  ");
		System.out.println(t1.brand+" "+t1.color+" "+t1.cost+" "+t1.seatingCount);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		t2.seatingCount=8;
		t2.cost=6500;
		t2.color="Brown";
		t2.brand="Greenply";
		t2.allowToSit();
		t2.allowToWrite();
		System.out.println("  ");
		System.out.println(t2.brand+" "+t2.color+" "+t2.cost+" "+t2.seatingCount);
	}

}
