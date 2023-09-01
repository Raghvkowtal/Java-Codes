package com.kodnest.practiceproblems;

import java.util.Scanner;

public class Main5 {
	public static void identifyCharacter(char ch) {
		if(Character.isLowerCase(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("Lower-case vowel");
			} else {
				System.out.println("Lower-case consonent");
			}
		} else if (Character.isLowerCase(ch)) {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("Upper-case Vowel");
			} else {
				System.out.println("Upper-case Consonent");
			}
		} else if (Character.isDigit(ch)) {
			System.out.println("digit");
		} else {
			System.out.println("Special-Character");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}

}
