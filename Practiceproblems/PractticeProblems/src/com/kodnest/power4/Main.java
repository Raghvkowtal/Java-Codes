package com.kodnest.power4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int n= scan.nextInt();
		Power4 p4=new Power4();
		int digit = p4.countdigits(num);
		int res=Power4.raiseToPower(num,digit,n);
		System.out.println("when " +  num+ " raised to power "+ digit+" is:--> "+res);
	}

}