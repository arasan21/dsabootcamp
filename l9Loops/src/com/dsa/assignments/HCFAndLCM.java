package com.dsa.assignments;

import java.util.Scanner;

public class HCFAndLCM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1 = in.nextInt();
		System.out.println("Enter 2nd number:");
		int num2 = in.nextInt();
		System.out.println(":::::::::::::Brute Force Approach:::::::::::::");
		int gcd =1;
		for(int i = 1 ; i <= Math.min(num2, num1);i++) {
			if(num1%i == 0 && num2%i ==0) {
				gcd =i;
			}
		}
		int lcm = (num1*num2)/gcd;
		System.out.printf("GCD of %d and %d is %d%n",num1,num2,gcd);
		System.out.printf("LCM of %d and %d is %d%n",num1,num2,lcm);
		System.out.println(":::::::::::::Euclidean’s Approach:::::::::::::");
		// 48 18
		int temp1= num1;
		int temp2= num2;
		while (temp2!=0) {
			int temp = temp2;
			temp2 %= temp1;
			temp1= temp;
		}
		lcm = (num1*num2)/gcd;
		System.out.printf("GCD of %d and %d is %d%n",num1,num2,gcd);
		System.out.printf("LCM of %d and %d is %d%n",num1,num2,lcm);
	}

}
