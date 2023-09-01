package com.kodnest.practiceproblems;

import java.util.Scanner;

public class Main7{

	public static void printFibonacciSeries(int n){	
		int fib1=0;
		int fib2=1;
		if(n==1) {
			System.out.println("0");
		}
		else if(n==2) {
			System.out.println("0 1");
		}
		else {
			for(int i=0; i<=n;i++) {
				int nextfib=fib1+fib2;
				fib1=fib2;
				fib2=nextfib;
				System.out.println(nextfib);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt()
;		printFibonacciSeries(n);

	}
}
