package com.kodnest.power3;

import java.util.Scanner;

public class Counting {
	int countDigits(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
					
		}
		return count;
	}

}
