package com.kodnest.practiceproblems;

import java.util.Scanner;

public class Main1 {
	public static void printEvenNumbers(int n) {
		for(int a=2; a<=n; a+=2) {
			System.out.println(a+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		printEvenNumbers(n);
				
	}

}

//a starts from 2 and adding 2 in intervals 2+2=4 4+2=6.... //