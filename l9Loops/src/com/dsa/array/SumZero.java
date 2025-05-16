package com.dsa.array;

import java.util.Arrays;

public class SumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		System.out.println(Arrays.toString(sumZero(n)));
	}
	
	static int[] sumZero(int n) {
        int[] ans= new int[n];
        int sum=0;
        if(n==1) {
        	return new int[] {0};
        }
        if(n==2) {
        	return new int[] {-1,1};
        }
        for(int i=1;i<n-1;i++){
            ans[i]=i;
            sum +=i;
        }
        ans[n-1]=-sum;
        return ans;
    }

}
