package com.dsa.array;

public class OddCells {

	public static void main(String[] args) {
		int m = 2;
		int n = 3;
		int[][] indices = {{ 0,1},{1,1}};
		System.out.println(oddCells(m, n, indices));
	}
	
	public static int oddCells(int m, int n, int[][] indices) {
		//loop through the indices
		//--> 0,1
		//--> 0 - increment all element in arr[0][j]
		//--> 1 - increment all element in arr[j][1]
        int[][] arr = new int[m][n];
        for(int i=0;i<indices.length;i++){
            int rowIndex = indices[i][0];
            int colIndex = indices[i][1];
            for (int row = 0; row < arr.length; row++) {
            	for(int col=0; col < arr[row].length;col++) {
    				if(row==rowIndex) {
    					arr[rowIndex][col]=arr[rowIndex][col]+1;
    				}
    				if(col==colIndex) {
    					arr[row][colIndex]=arr[row][colIndex]+1;
    				}
            	}
			}
        }
        int count=0;
        for (int row = 0; row < arr.length; row++) {
        	for(int col=0; col < arr[row].length;col++) {
        		if(arr[row][col] % 2 != 0 ) {
        			count++;
        		}
        	}
		}
        return count;
    }
	
	

}
