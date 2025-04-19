package com.dsa.assignments;

import java.util.Scanner;

public class FactorsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Factors are :");
		for(int i=1;i*i <= num;i++) {
			if(num % i==0) {
				System.out.print("("+i+","+num/i+")");
			}
		}
	}

}
