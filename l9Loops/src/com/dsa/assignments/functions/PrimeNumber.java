package com.dsa.assignments.functions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(isPrimeNumber(num)) {
			System.out.println(num +" is a prime number");
		}else {
			System.out.println(num +" is not a prime number");
		}
	}
	
	static boolean isPrimeNumber(int num) {
		int c=2;
		while (c< num) {
			if(num % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
