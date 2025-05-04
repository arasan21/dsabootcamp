package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies= {2,3,5,1,3};
		int extraCandies=3;
		System.out.println(kidsWithCandies(candies, extraCandies));

	}
	
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies=0;
        for(int candy : candies){
            if(candy > maxCandies )
                maxCandies = candy;
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies) >=maxCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

}
