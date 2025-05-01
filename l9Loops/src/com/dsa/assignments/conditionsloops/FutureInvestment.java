package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class FutureInvestment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double pv = in.nextDouble();
		System.out.println("Enter the interest rate:");
		double r = in.nextDouble();
		System.out.println("Enter number of peroid:");
		int n = in.nextInt();
		System.out.println("Future Value : ");
		for(int i=1;i<=n;i++) {
			 System.out.printf("%d\t%.2f%n", i, futureValue(pv, r, i));
		}
	}
	
	static double futureValue(double pv, double r,int n) {
		return pv * Math.pow((1+r/100), n);
	}

}
