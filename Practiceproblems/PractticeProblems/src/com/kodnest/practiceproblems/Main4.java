package com.kodnest.practiceproblems;

import java.util.Scanner;

public class Main4 {
	public static void printPrimes(int n) {
		int num=1;
		for(int a =1; a<=(n^2); a++) {
			if(num%n==0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		printPrimes(n);

	}

}
