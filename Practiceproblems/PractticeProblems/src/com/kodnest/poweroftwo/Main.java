package com.kodnest.poweroftwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no to be raised to exponent of 2");
		int n=scan.nextInt();
		Calculate c1=new Calculate();
		int res = c1.raiseToTwo(n);
		System.out.println(res);
	}

}
