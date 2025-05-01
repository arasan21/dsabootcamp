package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Sum of "+n+" numbers : "+n*(1+n)/2);
	}

}
