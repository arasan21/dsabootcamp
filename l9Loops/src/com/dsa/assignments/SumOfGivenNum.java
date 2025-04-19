package com.dsa.assignments;

import java.util.Scanner;

public class SumOfGivenNum {

	public static void main(String[] args) {
		System.out.println("Enter the number to sum (press 0 to exit)");
		Scanner in = new Scanner(System.in);
		int num;
		int sum=0;
		do {
			num = in.nextInt();
			sum += num;
		}while(num !=0);
		System.out.println("Sum of entered numbers is : "+sum);
	}
}
