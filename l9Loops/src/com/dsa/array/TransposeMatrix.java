package com.dsa.array;

public class TransposeMatrix {

	public static void main(String[] args) {
//		int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][]  matrix = {{1,2,3},{4,5,6}};
		printMat(matrix);
		printMat(transpose(matrix));
	}
	
	public static int[][] transpose(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] tempMatrix = new int[n][m];
        for(int i=0; i< m;i++){
            for(int j=0; j< n;j++){
            	tempMatrix[j][i] = matrix[i][j] ; 
            }
        }
        return tempMatrix;
    }
	
	static void printMat(int[][] matrix) {
		System.out.print("[");
		for(int i=0; i< matrix.length;i++){
			System.out.print("[");
            for(int j=0; j< matrix[i].length;j++){
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("]");
		}
		System.out.print("]");
		System.out.println();
	}

}
