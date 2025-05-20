package com.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {

	public static void main(String[] args) {
		int[][] matrix= {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		System.out.println(findMinInRow(matrix));
	}
	
	 static List<Integer> findMinInRow(int[][] matrix) {
         List<Integer> res= new ArrayList();
	        int minCol=0;
	        int max=0;
	        int min=0;
	        for(int row=0;row < matrix.length;row++){
	        	min = matrix[row][0];
	             for(int col=0; col < matrix[0].length;col++){
	                if(matrix[row][col] < min ){
	                    min = matrix[row][col];
	                	minCol = col;
	                }
	             }
	 	        max = maxCol(matrix, minCol);
		        if(min == max) {
			         res.add(max);
			         return res;
		        }
	        }
	        return res;
	    }

	private static int maxCol(int[][] matrix, int minCol) {
		int max=0;
		 for(int row=0;row < matrix.length;row++){
		    if( matrix[row][minCol] > max){
		    	max=matrix[row][minCol];
		    }
		 }
		return max;
	}

}
