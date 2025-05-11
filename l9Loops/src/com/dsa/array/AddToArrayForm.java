package com.dsa.array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddToArrayForm {

	public static void main(String[] args) {
		int[] num = {1,2,0,0};
		int k = 34;
		System.out.println(addToArrayForm(num, k));
	}
	
	 public static List<Integer> addToArrayForm(int[] num, int k) {
		 int num1 = arrayToInt(num);
		 return intToList(num1+k,num.length-1);
	 }
	 
	 public static int arrayToInt(int[] num) {
		 int sum=0;
		 for(int i=0; i <num.length ;i++) {
			sum= sum + num[i]*(int)Math.pow(10, num.length-1-i); 
		 }
		 return sum;
	 }
	 
	 public static List<Integer> intToList(int num,int len){
		 List<Integer> res = new ArrayList<>(len+1);
		 while(num > 0) {
			 int temp = num % 10;
			 num /=10;
			 res.add(0,temp); // prepend digit
		 }
		 return res;
	 }
}
