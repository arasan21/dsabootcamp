package com.dsa.array;

import java.util.Arrays;

public class MatrixReshape {

	public static void main(String[] args) {
		int[][] mat = {{1,2},{3,4}};
		int r = 4;
		int  c = 1;
		System.out.println(Arrays.deepToString(matrixReshapeOptimized(mat, r, c)));
	}
	
	static int[][] matrixReshape(int[][] mat, int r, int c) {
		  int m =mat.length;
	        if(m <= 0){
	            return mat;
	        }
	        int n = mat[0].length;
	        if(r*c != m*n){
	            return mat;
	        }

	        int[][] res = new int[r][c];
	        for(int i =0; i< m*n ;i++ ){
	           res[i/c][i%c]=mat[i/n][i%n];
	        }
	        return res;
    }
	
	static int[][] matrixReshapeOptimized(int[][] mat, int r, int c) {
		int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        // Traverse original matrix row by row
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return result;
  }

}
