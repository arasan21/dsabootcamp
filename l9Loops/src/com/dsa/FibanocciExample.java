package com.dsa;

import java.util.Scanner;

public class FibanocciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the Nth position for the fibonacci number");
		int n = in.nextInt();
		//num|sum
		//0 | 1
		//1|1
		//1|2
		//2|3
		//3|5
		//5|8
		//8|13
		// 0 1 1 2 3 5 8 13 21 34
		int firstNum = 0;
		int secNum=1;
		System.out.println("Fib series : ");
		System.out.print(firstNum);
		System.out.print(" ");
		System.out.print(secNum);
		System.out.print(" ");
		for(int i=2;i<n;i++) {
			int temp =secNum;
			secNum = firstNum+secNum;
//			firstNum=secNum;
			firstNum=temp;
			System.out.print(secNum);
			System.out.print(" ");
		}
//		System.out.println("nth Fib : "+secNum);
	}

}
