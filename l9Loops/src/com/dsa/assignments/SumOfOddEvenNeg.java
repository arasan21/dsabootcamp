package com.dsa.assignments;

import java.util.Scanner;

public class SumOfOddEvenNeg {

	public static void main(String[] args) {
		System.out.println("Enter the number to sum (press 0 to exit)");
		Scanner in = new Scanner(System.in);
		int num;
		int sumOfPos=0;
		int sumOfOdd=0;
		int negSum=0;
		do {
			num = in.nextInt();
			if(num < 0) {
				negSum +=num;
			}else {
				if(num%2==0) {
					sumOfPos +=num;
				}else {
					sumOfOdd +=num;
				}
			}
		}while(num !=0);
		System.out.println("sum of negative numbers : "+negSum);
		System.out.println("sum of positive even numbers : "+sumOfPos);
		System.out.println("sum of positive odd numbers : "+sumOfOdd);
	}

}
