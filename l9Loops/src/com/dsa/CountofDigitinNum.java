package com.dsa;

public class CountofDigitinNum {

	public static void main(String[] args) {
		int i = 455685;
		int count= 0;
		for(;i>0;i=i/10) {
			int rem =  i % 10;
			if(rem == 5)
				count++;
		}
		
		System.out.println("count of 5 : "+count);
	}
}
