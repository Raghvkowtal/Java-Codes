package com.kodenst.pattern.progg;

import java.util.Scanner;

public class ranval {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min value");
		double min= scan.nextDouble();
		System.out.println("Enter the max value");
		double max= scan.nextDouble();
		
		double randomValue= min+(Math.random()*(max-min));
        System.out.println("Random value between " + min + " and " + max + "is: " + randomValue);

	}

}
