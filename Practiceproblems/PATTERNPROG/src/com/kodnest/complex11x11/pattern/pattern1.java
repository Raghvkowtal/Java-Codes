package com.kodnest.complex11x11.pattern;

public class pattern1 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(i==0||j==0) {
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	}