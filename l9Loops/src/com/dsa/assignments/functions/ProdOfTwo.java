package com.dsa.assignments.functions;

import java.util.Scanner;

public class ProdOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b= in.nextInt();
		System.out.println("product of "+a+" and "+b+" is " +prod(a,b));
	}
	
	static int prod(int a, int b) {
		return a*b;
	}

}
