package com.dsa.array;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15}; 
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	//brute force
    static int[] twoSum(int[] nums, int target) {
          for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target)
                    return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }
    
    //optimized
    public int[] twoSum1(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
          for(int j=i;j<nums.length;j++){
              if (nums[j] + nums[j - i] == target) {
                  return new int[]{j - i, j}; 
              }
          }
      }
      return new int[] {-1,-1};
  }

}
