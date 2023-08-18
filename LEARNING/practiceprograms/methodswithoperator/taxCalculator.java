package com.kodnest.practiceprograms.methodswithoperator;

import java.util.Scanner;

public class taxCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase amount = ");
		double pruchaseamt= scan.nextDouble();
		System.out.println("Enter the tax rate(in decimal form)");
		double taxrates= scan.nextDouble();		
		double totalWithTax = calculateTotalWithTax(pruchaseamt,taxrates);
		System.out.println("Total cost including tax = " + totalWithTax);
	}
	
	public static double calculateTotalWithTax(double purchaseamt, double taxrates) {
		 double taxAmount = purchaseamt * taxrates;
		 return purchaseamt+ taxAmount;
	}

}
