package com.kodnest.oops.example;

public class Calculator {
	int num1;
	int num2;
	
	void add() {
		int res1;
		res1= num1+num2;
		System.out.println("Additn result is "+res1);
	}
	void sub() {
		int res2;
		res2= num2-num1;
		System.out.println("Additn result is "+res2);
	}
	void mul() {
		int res3;
		res3= num1*num2;
		System.out.println("Additn result is "+res3);
	}
	void div() {
		int res4;
		res4= num2/num1;
		System.out.println("Additn result is "+res4);
	}
}
