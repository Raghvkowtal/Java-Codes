package com.kodnest.power3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		Counting c1= new Counting();
		int digit=c1.countDigits(num);
		System.out.println("number of digits in "+num+" is "+digit);
		
	}

}
