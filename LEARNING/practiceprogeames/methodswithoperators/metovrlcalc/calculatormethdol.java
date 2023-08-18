package com.kodnest.practiceprogeames.methodswithoperators.metovrlcalc;

import java.util.Scanner;

public class calculatormethdol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Enter the operator (+, -, *, /)");
		char operator = scan.next().charAt(0);	
		
		double result=0;
		switch(operator) {
		case '+' :
			result = calculator.add(num1, num2);
			break;
		case '-' :
			result = calculator.sub(num1, num2);
			break;
		case '*' :
			result = calculator.mul(num1, num2);
			break;
		case '/' :
			result = calculator.div(num1, num2);
			break;
		default:
			System.out.println("PLEASE ENTER THE VALID OPERATOR");
			return;
		}
		
		if(!Double.isNaN(result)) {
			System.out.println("result " + result);
		} else {
			System.out.println("error");
		}
	}

}
