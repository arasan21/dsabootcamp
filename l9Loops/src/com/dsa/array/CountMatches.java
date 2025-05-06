package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/
public class CountMatches {

	public static void main(String[] args) {

		List<List<String>> items = new ArrayList();
		items.add(new ArrayList<>(Arrays.asList("phone","blue","pixel")));
		items.add(new ArrayList<>(Arrays.asList("computer","silver","phone")));
		items.add(new ArrayList<>(Arrays.asList("phone","gold","iphone")));
		 String ruleKey="type";
		 String ruleValue = "phone";
		System.out.println(countMatches(items, ruleKey, ruleValue));
	}
	
	 static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        int positionToCheck=0;
	        switch(ruleKey){
	            case "type":
	                    positionToCheck=0;
	                break;
	            case "color":
	                positionToCheck= 1;
	                break;
	            case "name":
	                positionToCheck=2;
	                break;
	        }
	        int count=0;
	        for(List<String> a:  items) {
	                if(a.get(positionToCheck).equals(ruleValue))
	                    count++;
	        }
	        return count;
	    }

}
