package com.kodnest.power2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int n=scan.nextInt();
		Power2 p2 = new Power2();
		int res=p2.raiseToPowerN(n, num);
		System.out.println(res);
	}

}