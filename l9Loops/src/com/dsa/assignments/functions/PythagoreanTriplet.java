package com.dsa.assignments.functions;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers:");
		Scanner in = new Scanner(System.in);
		int num1= in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		if(isPythagoreanTriplet(num1, num2, num3)) {
			System.out.println("("+num1+" , "+num2+" , "+num3+" ) are Pythagorean Triplet");
		}else {
			System.out.println("("+num1+" , "+num2+" , "+num3+" ) are not Pythagorean Triplet");
		}
		
	}
	
	static boolean isPythagoreanTriplet( int a, int b, int c) {
		//123
		// sq a + sq b = sq c
		//sq a + sq c = sq b
		//sq b + sq c = sq a
		
		if(((a*a) + (b*b)) == (c*c)) {
			return true;
		}
		
		if(((a*a) + (c*c)) == (b*b)) {
			return true;
		}
		
		if(((c*c) + (b*b)) == (a*a)) {
			return true;
		}
		
		return false;
	}

}
