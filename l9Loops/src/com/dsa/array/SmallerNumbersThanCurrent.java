package com.dsa.array;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,1,2,2,3};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}
	
	//Brute force
	static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans= new int[nums.length];
        int sum ;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j]<nums[i]){
                    sum+=1;
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
	
}
