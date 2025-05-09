package com.dsa.array;

public class FindNumbersEvenDigits {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}
	
	public static int findNumbers(int[] nums) {
        int count =0;
        for(int i : nums){
            if(isEvenDigits(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isEvenDigits(int num){
        int count = countDigits(num);
        return count % 2 == 0;
    }

    public static int countDigits(int num){
        int count=0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

}
