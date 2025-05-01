package com.dsa.assignments.functions;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b= in.nextInt();
		System.out.println("Sum of "+a+" and "+b+" is " +sum(a,b));
	}
	
	static int sum(int a, int b) {
		return a+b;
	}

}
