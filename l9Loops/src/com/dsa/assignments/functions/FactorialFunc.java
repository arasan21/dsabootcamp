package com.dsa.assignments.functions;

import java.util.Scanner;

public class FactorialFunc {

	public static void main(String[] args) {
		System.out.println("Enter the number to find the factorial: ");
		Scanner in = new Scanner(System.in);
		int num = in .nextInt();
		System.out.println("Factorial of "+num+" is "+ factorial(num));
	}
	
	static long factorial(int num) {
		long ans= 1;
		for(int i=num; i> 0; i--) {
			ans *=i;
		}
		
		return ans;
	}

}
