package com.dsa.array;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		System.out.println(Arrays.toString(shuffle(nums, n)));
	}
	
	static int[] shuffle(int[] nums, int n) {
        // create new array "shuffled" of nums.length
        //loop through nums array till nums.length
        //shuffled[i] = nums[i];shuffled[i+1]=nums[n+i]
        //i=i+2

        int[] shuffled = new int[nums.length];
        for(int i=0,j=0;i<n;i++,j=j+2){
            shuffled[j] = nums[i];
            shuffled[j+1]=nums[n+i];
        }
        return shuffled;
    }

}
