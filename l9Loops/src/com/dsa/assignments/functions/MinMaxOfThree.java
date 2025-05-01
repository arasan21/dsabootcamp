package com.dsa.assignments.functions;

import java.util.Scanner;

public class MinMaxOfThree {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers to find min and max:");
		Scanner in = new Scanner(System.in);
		int[] nums = new int[3];
		for(int i =0 ; i < 3 ;i++) {
			nums[i]=in.nextInt();
		}
		System.out.println("Maximum number is "+max(nums));
		System.out.println("Minimum number is "+min(nums));
	}
	
	static int min(int[] nums) {
		int min = nums[0];
		for(int n : nums) {
			min =  n < min ? n:min;
		}
		return min;
	}
	
	static int max(int[] nums) {
		int max=nums[0];
		for(int n : nums) {
			max = n > max ? n : max;
		}
		return max;
	}

}
