package com.dsa.array;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums=  {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		  int max = Integer.MIN_VALUE;
	        int sum=0;
	        for(int i=0;i< nums.length;i++){
	        	System.out.println("num = "+nums[i]+" sum = "+sum);
	            sum +=nums[i];
	            System.out.println("sum = "+sum+" > max = "+max);
	            if(sum > max){
	                max=sum;
	            }
	            if(sum < 0){
	            	sum=0;
	            }
	        }
        return max;
    }
}
