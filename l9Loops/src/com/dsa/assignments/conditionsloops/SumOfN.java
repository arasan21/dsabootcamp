package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(num !=0) {
			int sum =0;
			for(int i=0;i<=num;i++) {
				sum +=i;
			}
			System.out.println(sum);
			System.out.println("Enter a number");
			num = in.nextInt();
		}
		System.out.println("Exit");
	}

}
