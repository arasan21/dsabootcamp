package com.dsa.array;

public class MaximumPopulation {

	public static void main(String[] args) {
		int[][] logs = {{1993,1999},{2000,2010}};
		System.out.println(maximumPopulation(logs));
	}
	
	public static int maximumPopulation(int[][] logs) {
       int[] population= new int[101];
       for(int[] year:logs){
        population[year[0]-1950]++;// birth
        population[year[1]-1950]--;// death
       }
       int currentPop=0;
       int maxPop=0;
       int minYear=0;
       for(int i =0; i < population.length; i++ ){
            currentPop += population[i];
            if(maxPop <  currentPop){
                maxPop = currentPop;
                minYear=i+1950;
            }
       }
       return minYear;
    }

}
