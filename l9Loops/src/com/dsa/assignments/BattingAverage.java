package com.dsa.assignments;

import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Runs scored:");
		int runs = in.nextInt();
		System.out.println("Enter the total no of matches:");
		int matchCount = in.nextInt();
		System.out.println("Enter the total no of Not Outs:");
		int notOutCount = in.nextInt();
		if(matchCount==notOutCount) {
			System.out.println("Batting Average : NA");
		}else {
			double battingAvg = runs/(matchCount-notOutCount);
			System.out.println("Batting Average : "+battingAvg);
		}
	}

}
