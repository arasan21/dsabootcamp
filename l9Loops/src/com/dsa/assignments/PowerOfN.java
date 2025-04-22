package com.dsa.assignments;

import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = in.nextInt();
		System.out.println("Enter the Power value :");
		int power = in.nextInt();
		int value =1;
		for(int i=0;i<power;i++) {
			value *=number;
		}
		System.out.println(number+ " Power of  "+power+" is "+value);
	}

}
