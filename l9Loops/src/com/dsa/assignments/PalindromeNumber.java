package com.dsa.assignments;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to check for palindrome:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int temp = num;
		int sum =0;
		while( temp > 0) {
			int rem= temp % 10;
			sum = sum* 10 + rem;
			temp /=10;
		}
		if(sum == num) {
			System.out.println(num + " is a palindrome");
		}else {
			System.out.println(num + " is not a palindrome");
		}
	}

}
