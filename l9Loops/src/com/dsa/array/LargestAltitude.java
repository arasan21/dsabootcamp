package com.dsa.array;

public class LargestAltitude {

	public static void main(String[] args) {
		int[] arr = {-5,1,5,0,-7};
		System.out.println(largestAltitude(arr));
	}
	
	static  int largestAltitude(int[] gain) {
        //loop through each 
        // sum through each element 
        // check if sum > max -> max = sum
        // return max - highest altitude
        int sum =0; int max=0;
        for(int i : gain){
            sum +=i;
            if(sum > max ){
                max=sum;
            }
        }
        return max;
    }

}
