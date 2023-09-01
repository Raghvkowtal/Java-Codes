package com.kodnest.practiceproblems;

import java.util.Scanner;

public class Main2 {
	public static void calculateSum(int n) {
		int sum=0;
		for(int a=0; a<=n; a++) {
			sum=sum+=a;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		calculateSum(n);

	}

}

//as sum starts from 0 it works o+1=1 1+2=3 3+3=6 6+4=10 10+5=15//
