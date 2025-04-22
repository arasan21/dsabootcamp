package com.dsa.assignments;

import java.util.Scanner;

public class CalculateCommission {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount:");
		double amount = in.nextDouble();
		System.out.println("Enter the commission percentage:");
		double commission = in.nextDouble();
		double commissionAmount = amount * (commission/100);
		System.out.println("Commission Amount : "+commissionAmount);
	}

}
