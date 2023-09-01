package com.kodnest.practiceproblems;

import java.util.Scanner;

public class Main3 {
	public static void calculateFactorial(int n) {
		int sum=1;
		for( int a=1; a<=n; a++) {
			sum=sum*a;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		calculateFactorial(n);
	}

}
