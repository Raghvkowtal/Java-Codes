package com.kodnest.practiceprogrames.methodswithoperator;

import java.util.Scanner;

public class BiwSwapper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integers to be swapped");
		int a = scan.nextInt();
		System.out.println("Enter second integers to be swapped");
		int b = scan.nextInt();
		
		System.out.println("preswap a = "+ a+" b = "+ b );
		swapbitwise(a,b);
	}
	
	public static void swapbitwise(int a, int b) {
		
		a= a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("postswap a = "+ a +" b = "+ b );
	}

}
