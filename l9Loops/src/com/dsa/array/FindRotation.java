package com.dsa.array;

public class FindRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] mat = {{0,1},{1,0}};
//		int[][] target = {{1,0},{0,1}};
		int[][]  mat = {
				{0,0,0},
				{0,1,0},
				{1,1,1}
		};
		int[][]  target = {
				{1,1,1},
				{0,1,0},
				{0,0,0}
		};
		System.out.println(findRotation(mat, target));
	}
	
	static  boolean findRotation(int[][] mat, int[][] target) {
		// check it matches without any rotation 0 degree and 360 degree
		if(isMatch(mat, target)) {
			return true;
		}
		
		// check it matches after rotation 90,180,270 degree
		int count =0;// we can rotate matrix by 90 deg for 3 times
		int[][] rotatedMat = mat;
		while(count < 3) {
			rotatedMat = rotateMatrix(rotatedMat);
			if(isMatch(rotatedMat, target)) {
				return true;
			}
			count++;	
		}
		return false;
    }
	
	static int[][] rotateMatrix(int[][] mat){
		int[][] temp= new int[mat.length][mat.length];
		for(int row=0; row<mat.length;row++) {
			for(int col=0;col<mat[row].length;col++) {
				temp[col][mat.length-1-row]=mat[row][col];
			}
		}
		return temp;
	}
	
	static boolean isMatch(int[][] mat, int[][] target) {
		for(int row =0 ;row < mat.length;row++) {
			for(int col=0; col < mat[row].length; col++) {
				if(mat[row][col] != target[row][col]) {
					return false;
				}
			}
		}
		return true;
	}

}
