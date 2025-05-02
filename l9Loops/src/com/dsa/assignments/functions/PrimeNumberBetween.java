package com.dsa.assignments.functions;

import java.util.Scanner;

public class PrimeNumberBetween {

	public static void main(String[] args) {
		System.out.println("Enter the range to get the prime number between them:");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		getAllPrimeNumbersBetween(num1, num2);
		
	}
	static void getAllPrimeNumbersBetween(int num1, int num2) {
		System.out.println("The prime numbers between "+num1+" and "+ num2 +" are :");
		int start = num1 < num2 ? num1:num2;
		int end = num1 > num2 ? num1:num2;
		
		for(int i = start; i <= end; i ++ ) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	static boolean isPrimeNumber(int num) {
		if (num <= 1)
            return false;
		int c= 2;
		while (c < num) {
			if(num%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}
	
}
