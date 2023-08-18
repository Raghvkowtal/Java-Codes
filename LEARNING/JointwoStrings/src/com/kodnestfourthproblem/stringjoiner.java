package com.kodnestfourthproblem;

import java.util.Scanner;

public class stringjoiner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Name and Last Name");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		System.out.println("joining strings=> "+joinStrings(str1, str2));
	}
	
	public static String joinStrings(String str1, String str2) {
		return  str1 + str2;
	}
}
