package com.dsa.assignments;

import java.util.Scanner;

public class CombinationAndPermutation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total number of things or items:");
		int n = in.nextInt();
		System.out.println("Enter number of things to be chosen :");
		int r = in.nextInt();
		long combination = getFactorial(n) / (getFactorial(r)*getFactorial(n-r));
		long permutation = getFactorial(n) / getFactorial(n-r);
		System.out.println("Number of combination : "+combination);
		System.out.println("Number of permutation : "+permutation);
	}
	static long getFactorial(long num) {
		long sum =1;
		for(long i=num;i > 0;i--) {
			sum *= i;
		}
		return sum;
	}

}
