package com.kodnest.secondproblem;

public class checkPalindrome {

	public static boolean checkPalindrome(int n) {
		int originaldigit = n;
		int nextdigit = 0;
		
		while(n>0) {
			int num = n%10;
			nextdigit = nextdigit*10+num;
			n/=10;
		}
		 return originaldigit==nextdigit;
	}

}
