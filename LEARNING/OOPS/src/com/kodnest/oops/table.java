package com.kodnest.oops;

  class table {
	  int seatingCapecity;
	  int cost;
	  String color;
	  String brand;
	  
	  void allowToSit() {
		  System.out.println("user can sit on the table which is of "+color);
	  }
	  void allowToWrite() {
		  System.out.println("user is allowed to write ina book keeping on a table that costs "+cost);
	  }
}
