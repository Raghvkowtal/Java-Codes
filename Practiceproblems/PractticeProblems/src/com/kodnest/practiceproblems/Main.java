package com.kodnest.practiceproblems;

import java.util.Scanner;

public class Main {
	public static void printTable(int num) {
		for(int a=1; a<=10; a++) {
			int result= num *a;
			System.out.println(num +" x " +a +" =  " + result);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printTable(num);
	}

}
