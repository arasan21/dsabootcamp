package com.dsa.assignments.functions;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if(isEligibleToVote(age)) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote");
		}
	}
	
	static boolean isEligibleToVote(int age) {
		return age >= 18;
	}

}
