package com.dsa.array;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * nums = [1,2,3,4]
 * Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningSum {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(nums)));
	}
	
	static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }

}
