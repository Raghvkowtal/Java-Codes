package com.kodnest.classgcd;

import java.util.Scanner;

public class Main {
	public static int findGCD(int a, int b){
		if(b==0) {
			return a;
		}
		return findGCD(b, a%b);
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two nos ");
		int a = scan.nextInt();
		int b= scan.nextInt();
		findGCD(a,b);
		}

}
