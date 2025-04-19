package com.dsa.assignments;

import java.util.Scanner;

public class AverageOfNNaturalNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum =0;
		for(int i=1; i <=n ; i++) {
			sum +=i;
		}
		System.out.println("Average of "+n+" : "+(double)sum/n);
		// OR
		// sum of N natural numbers : n(n+1)/2
		System.out.println("Average of "+n+" : "+(double)(1+n)/2);
	}

}
