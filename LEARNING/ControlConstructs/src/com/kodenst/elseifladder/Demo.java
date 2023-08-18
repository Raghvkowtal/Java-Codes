package com.kodenst.elseifladder;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of 6 subjects");
		System.out.println("English, Kannada, Samskrit, Science, Maths, Social");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		int f=scan.nextInt(); 
		int scor =a+b+c+d+e+f;
		System.out.println(scor);
		Scor s1 = new Scor();
		s1.score(scor);
		
	}

}


