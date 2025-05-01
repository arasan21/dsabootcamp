package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class LargestOfGivenNum {

	public static void main(String[] args) {
		System.out.println("Enter the number to sum (press 0 to exit)");
		Scanner in = new Scanner(System.in);
		int num;
		int largest=0;
		do {
			num = in.nextInt();
			if(num > largest)
				largest = num;
		}while(num !=0);
		System.out.println("largest of entered numbers is : "+largest);
	}

}
