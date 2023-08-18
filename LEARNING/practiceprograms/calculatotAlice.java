package com.kodnest.practiceprograms;

import java.util.Scanner;

public class calculatotAlice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the operation using sign");
		char opp=scanner.next().charAt(0);		
		System.out.println("Enter num1 and num2");
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();

		
		double result= perOperation(num1,num2,opp);
		System.out.println("result is = "+result);
		}
	
	public static double perOperation(double num1, double num2, char opp) {
		double result=0.0;
		
		switch(opp) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			if(num2!=0) {
				result=num1/num2;
			} else {
				System.out.println("error ada paa ");
			}
			break;
		default:
			System.out.println("aagudilla paa");
			break;
		}
		return result;
	}
	}