package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= in.nextInt();
		int sum =0;
		int temp = number;
		while(temp > 0) {
			int rem =  temp%10;
			sum += rem*rem*rem;
			temp /=10;
		}
		if(sum == number) {
			System.out.println(number+" is an Armstrong number");
		}else {
			System.out.println(number+" is an not an Armstrong number");
		}
	}

}
