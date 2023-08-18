package com.kodnest.methods.methodoverloading;

import java.util.Scanner;

public class DisneyChain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name ");
		String a = scanner.nextLine();
		System.out.println("Enter your birth year");
		int b = scanner.nextInt();
		greetperson(a);
		System.out.println("your are of age "+(2023-b)+ " years" );
		birth(b);
	}
	public static void greetperson(String name) {
		System.out.println("hello "+ name + " its been a long time...!!!");
	}
	public static int birth(int b) {
		return b;
	}

}
