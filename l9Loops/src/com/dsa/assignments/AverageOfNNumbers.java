package com.dsa.assignments;

import java.util.Scanner;

public class AverageOfNNumbers {

	public static void main(String[] args) {
		System.out.println("Enter how many numbers : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum =0;
		System.out.println("Enter "+n+" numbers : ");
		for(int i=1; i <=n ; i++) {
			double val=in.nextDouble();
			sum +=val;
		}
		System.out.println("Average : "+(double)sum/n);
	}

}
