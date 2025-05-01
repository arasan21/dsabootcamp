package com.dsa.assignments.functions;

import java.util.Scanner;

public class PalindromeFunc {

	public static void main(String[] args) {
		System.out.println("Enter number to check for palindrome");
		Scanner in = new Scanner(System.in);
		int num= in.nextInt();
		if(isPliandrome(num)) {
			System.out.println(num +" is a palindrome number");
		}else {
			System.out.println(num +" is not a palindrome number");
		}
	}
	
	static boolean isPliandrome(int num) {
		int reverse=0;
		int temp = num;
		while(num > 0) {
			int rem = num%10;
			reverse = (reverse *10)+ rem;
			num /=10;
		}
		return reverse == temp;
	}

}
