package com.kodnest.pracprogfourth;

import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "PO1":
			System.out.println("");
			break;
		case "PO2":
			System.out.println("pepsi");
			break;
		case "PO3":
			System.out.println("Fanta");
			break;
		case "PO4":
			System.out.println("JalJeera");
			break;
		case "PO5":
			System.out.println("MountainDew");
			break;
		case "PO6":
			System.out.println("BoarGauva");
			break;
		default:
			System.out.println("Panaka");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String productCode = scan.next();
		getProduct(productCode);
		
	}

}