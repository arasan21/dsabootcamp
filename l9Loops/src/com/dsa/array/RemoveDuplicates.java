package com.dsa.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicatesOpt(nums));
		
	}
	
	public static int removeDuplicates(int[] nums) {
        Set<Integer> res = new HashSet();
        for(int i=0 ; i< nums.length;i++){
            if(!res.contains(nums[i])){
            	res.add(nums[i]);
            	nums[res.size()-1]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return res.size();
    }
	
	public static int removeDuplicatesOpt(int[] nums) {
		if (nums.length == 0) return 0;
        int size=0;
        for(int i=1 ; i< nums.length;i++){
        	if(nums[i]!=nums[size]) {
        		size++;
        		nums[size]=nums[i];
        	}
        }
        return size+1;
    }

}
