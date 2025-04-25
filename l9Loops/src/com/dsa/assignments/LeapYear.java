package com.dsa.assignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if(year % 4 == 0) {
			if(year % 100 ==0) {
				if(year % 400 == 0) {
					System.out.println(year +" is a leap year");
				}else {
					System.out.println(year +" is not leap year");
				}
			}else {
				System.out.println(year +" is a leap year");
			}
		}else {
			System.out.println(year +" is not leap year");
		}
	}

}
