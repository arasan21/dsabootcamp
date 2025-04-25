package com.dsa.assignments;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum =0;
		while(num > 0) {
			int digit = num % 10;
			sum +=digit;
			num /= 10;
		}
		System.out.println("Sum of digits of number: "+sum);
	}

}
