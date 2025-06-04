package com.dsa.array;

public class MinCostToMoveChips {

	public static void main(String[] args) {
		int[] nums= {2,2,2,3,3};
//		int[] nums= {1,2,3};
		System.out.println(minCostToMoveChips(nums));
	}
	
    static int minCostToMoveChips(int[] position) {
    	int evenPosCount=0;
    	int oddPosCount=0;
        for(int pos:position) {
        	if(pos%2==0) {
        		evenPosCount++;
        	}else {
        		oddPosCount++;
        	}
        }
        return Math.min(evenPosCount, oddPosCount);
    }

}
