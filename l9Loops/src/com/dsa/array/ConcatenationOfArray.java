package com.dsa.array;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/description/
/**
 *Given an integer array nums of length n, you want to create an array ans of length 2n 
 *where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *Specifically, ans is the concatenation of two nums arrays.
 *Return the array ans. 
 */
public class ConcatenationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
	
	 static int[] getConcatenation(int[] nums) {
	        int[] ans = new int[nums.length*2];
	        for(int i=0;i< nums.length;i++){
	            ans[i]=nums[i];
	            ans[i+nums.length]=nums[i];
	        }
	        return ans;
	    }

}
