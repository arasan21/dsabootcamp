package com.dsa.array;
//https://leetcode.com/problems/number-of-good-pairs/
public class GoodPairs {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(nums));
	}
	
	 static int numIdenticalPairs(int[] nums) {
	        int result =0;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i; j < nums.length; j++){
	                if(nums[i] == nums[j] && i < j ){
	                    result++;
	                }
	            }
	            
	        }
	        return result;
	    }

}
