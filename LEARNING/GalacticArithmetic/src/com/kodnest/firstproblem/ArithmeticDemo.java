package com.kodnest.firstproblem;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		long num1 = scan.nextInt();
		long num2 = scan.nextInt();
		System.out.println(galacticAddition( num1,  num2));
		
	}
	
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}
}

