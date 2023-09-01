package com.kodnest.secondproblem;

import java.util.Scanner;

public class ArmstrongNumber {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    // Function to calculate the number of digits in a number
	    static int countDigits(int num) {
	        int count = 0;
	        while (num > 0) {
	            num /= 10;
	            count++;
	        }
	        return count;
	    }

	    // Function to check if a number is an Armstrong number
	    static boolean isArmstrong(int num) {
	        int originalNum = num;
	        int numDigits = countDigits(num);
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numDigits);
	            num /= 10;
	        }

	        return sum == originalNum;
	    }
	}

