package com.dsa.array;

import java.util.Arrays;

//	https://leetcode.com/problems/build-array-from-permutation/description/
/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length
 *  where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 *  A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 **/
public class BuildArrayPermutation {

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(nums)));
	}

	static int[] buildArray(int[]	 nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i < nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
