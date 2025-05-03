package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Sum of "+n+" numbers : "+n*(1+n)/2);
		//Sum of first n natural numbers = (n * (n+1)) / 2
		
		// n natural numbers that avoids overflow if result is going to be within limits.
		
		// Returns sum of first n natural
	    // numbers
//	        if (n % 2 == 0)
//	            return (n / 2) * (n + 1);
//
//	        // If n is odd, (n+1) must be even
//	        else
//	            return ((n + 1) / 2) * n;

	}

}
