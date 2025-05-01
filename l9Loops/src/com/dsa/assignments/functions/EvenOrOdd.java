package com.dsa.assignments.functions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(isEven(num)) {
			System.out.println(num +" is an even number");
		}else {
			System.out.println(num +" is a odd number");
		}
	}
	
	static boolean isEven(int n) {
		return n %2 == 0;
	}

}
