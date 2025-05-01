package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class DepreciationValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount:");
		double amount = in.nextDouble();
		System.out.println("Enter the depreciation rate:");
		double  depreciationRate= in.nextDouble();
		System.out.println("Enter the time duration in years:");
		double  timeInYrs= in.nextDouble();
		double depreciationAmount = amount * Math.pow(1-(depreciationRate/100),timeInYrs);
		System.out.println("Depreciated Value : "+depreciationAmount);
	}

}
