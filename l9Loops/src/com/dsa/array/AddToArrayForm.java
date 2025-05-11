package com.dsa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddToArrayForm {

	public static void main(String[] args) {
		int[] num = {1,2,0,0};
		int k = 34;
//		int[] num= {9,9,9,9,9,9,9,9,9,9};
//		int k =1;
//		int[] num= {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
//		int k=516;
		System.out.println(addToArrayForm3(num, k));
		
//		  addToArrayForm1(num, k);
	}

	 public static List<Integer> addToArrayForm(int[] num, int k) {
		 long num1 = arrayToInt(num);
		 return intToList(num1+k,num.length-1);
	 }
	 
	 
	 // brute force with long and int --> didnt work for range > long
	 
	 public static long arrayToInt(int[] num) {
		 long sum=0;
		 for(int i=0; i <num.length ;i++) {
			sum= sum + num[i]*(long)Math.pow(10, num.length-1-i); 
		 }
		 return sum;
	 }
	 
	 public static List<Integer> intToList(long num,int len){
		 List<Integer> res = new ArrayList<>(len+1);
		 while(num > 0) {
			 long temp = num % 10;
			 num /=10;
			 res.add(0,(int) temp); // prepend digit
		 }
		 return res;
	 }
	 //Expensive solution
	 public static List<Integer> addToArrayForm1(int[] num, int carry) {
		 List<Integer> res=new ArrayList<>();
		 for(int i=num.length-1;i>=0 || carry> 0;i--) {
			 if(i>= 0) {
				 System.out.println("carry :"+carry+" num :"+num[i]+" i - "+i);
				 carry += num[i];
			 }
			 res.addFirst(carry%10);
			 carry/=10;
			 System.out.println("carry :"+carry);
		 }
		 return res;
	 }
	 
	 //best optimized
	 public static List<Integer> addToArrayForm3(int[] num, int carry) {
		 List<Integer> res=new ArrayList<>();
		 for(int i=num.length-1;i>=0;i--) {
			 if(i>= 0) {
				 System.out.println("carry :"+carry+" num :"+num[i]+" i - "+i);
				 carry += num[i];
			 }	
			 res.add(carry%10);
//			 res.addFirst(carry%10);
			 carry/=10;
			 System.out.println("carry :"+carry);
		 }
		 Collections.reverse(res);
		 return res;
	 }
}
