	package com.dsa.array;

import java.util.Arrays;

public class FlipAndInvertImage {

	public static void main(String[] args) {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		
		image = flipAndInvertImage(image);
		for (int[] is : image) {
			System.out.println(Arrays.toString(is));
		}
	}
	
	static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i< image.length;i++){
        	//1,1,0
           image[i]= flip(image[i]);
           image[i]=invert(image[i]);
        }
        return image;
    }

	static int[] flip(int[] image) {
		for(int j =0; j< (image.length/2);j++){
		    int temp= image[j];
		    image[j]=image[image.length-1-j];
		    image[image.length-1-j]= temp;
		}
		return image;
	}

	static int[] invert(int[] arr){
		for(int j =0; j< arr.length;j++){
		    if(arr[j] == 1)
		    	arr[j]=0;
		    else
		    	arr[j]=1;
		}
		return arr;
    }

}
