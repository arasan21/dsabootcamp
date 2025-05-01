package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class DiscountOfProduct {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter product price :");
		double productPrice = in.nextDouble();
		System.out.println("Enter discount percentage :");
		double discount = in.nextDouble();
		if(discount > 100) {
			System.out.println("Discount cannot be greater than 100");
			System.exit(0);
		}
		double discountAmount = (productPrice*(discount/100));
		double finalPrice = productPrice - discountAmount;
		System.out.println("Saved amount : "+discountAmount);
		System.out.println("Price after discount: "+finalPrice);
	}

}
