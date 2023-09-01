package com.kodnest.Armstr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the number");
		int num= scan.nextInt();
		Armstrong a1=new Armstrong();
		boolean res= a1.isArmstrong(num);
		if (res==true) {
			System.out.println("Given is a Armstrong num");
		}
		else {
			System.out.println("Not an Armstrong num");
		}
	}
}		