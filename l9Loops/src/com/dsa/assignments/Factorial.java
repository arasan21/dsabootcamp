package com.dsa.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number for factorial : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int fact=1;
		for(int i=num;i>0;i--) {
			fact *= i;
		}
		System.out.println("factorial of "+num+" : "+ fact);
	}

}
