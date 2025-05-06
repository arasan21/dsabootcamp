package com.dsa.array;

import java.util.HashSet;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfPangram {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
//		String sentence = "dsflkdjdj;ljsd";
		System.out.println(checkIfPangramOptimized(sentence));
	}
	
	//optimized
	static boolean checkIfPangramOptimized(String sentence) {
		if(sentence.length() < 26)
			return false;
		 
		 for(char c='a' ; c <='z'; c++) {
			 if(sentence.indexOf(c) < 0)
				 return false;
		 }
		 return true;    
	 }
	
	//brute force	
	 static boolean checkIfPangram(String sentence) {
		 HashSet<Character> charSet = new HashSet();
		 for(char c : sentence.toCharArray()) {
			 charSet.add(c);
		 }
		 if(charSet.size() >= 26) {
			 return true;
		 }
	  return false;      
	 }
}
