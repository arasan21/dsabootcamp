package com.dsa.assignments;

public class SubtractProductAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4421;
		int sum =0;
		int product=1;
		while(num>0) {
			int rem = num % 10;
			sum += rem;
			product *= rem;
			num /=10;
			System.out.println("product :"+product);
			System.out.println("sum :"+sum);
		}
		System.out.println(product-sum);
	}

}
