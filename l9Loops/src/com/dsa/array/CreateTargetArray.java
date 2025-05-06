package com.dsa.array;

import java.util.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
public class CreateTargetArray {

	public static void main(String[] args) {
		int[] nums= {0,1,2,3,4};
		int[] index= {0,1,2,4,1};
		System.out.println(Arrays.toString(createTargetArray1(nums, index)));
		//[0,4,1,3,2]
	}
	
	 static int[] createTargetArray(int[] nums, int[] index) {
	        int[] target = new int[nums.length];
	        for(int i=0; i<nums.length;i++){
	            target[index[i]] = nums[i];
	            System.out.println(Arrays.toString(target));
	        }
	        return target;
	    }

	 public static int[] createTargetArray1(int[] nums, int[] index) {
		    int[] target = new int[nums.length];
		    int size = 0;

		    for (int i = 0; i < nums.length; i++) {
		        // If inserting at the end, no shift needed
		    	System.out.println("i - "+i+" size -"+size);
		        if (index[i] == size) {
		            target[size] = nums[i];
		        } else {
		            // Shift elements to the right
		        	System.out.println("Before shift : "+Arrays.toString(target));
		            for (int j = size; j > index[i]; j--) {
		                target[j] = target[j - 1];
		                System.out.println("i - "+i+" - "+Arrays.toString(target));
		            }
		            target[index[i]] = nums[i];
		        }
		        size++;
		    }

		    return target;
		}

}
