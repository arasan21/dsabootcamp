package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
//		int[] digits = {4,3,2,1};
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(Arrays.toString(plusOneOptimized(digits)));
	}
	//didnt work for higher number
	public static int[] plusOne(int[] digits) {
        int sum =0;
       List<Integer> res= new ArrayList();
        for(int i=0;i < digits.length ;i++){
            sum = sum + (int)( digits[i] * Math.pow(10,(digits.length -1 -i)));
        }
        sum +=1;
        System.out.println(sum);
        while(sum > 0) {
        	int temp = sum%10;
        	sum /=10;
        			res.add(temp);
        }
        Collections.reverse(res);
        return res.stream().mapToInt(i->i).toArray();
    }
	
	public static int[] plusOneOptimized(int[] digits) {
		int n =digits.length;
        for(int i=n-1;i >=0;i--){
        		if(digits[i] < 9) {
        			digits[i]++;
        			return digits;
        		}
        		digits[i]=0;
        }
        int[] result = new int[digits.length + 1]; 
        result[0] = 1;                              
        return result;
    }

}
