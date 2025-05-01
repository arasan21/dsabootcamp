package com.dsa.assignments.conditionsloops;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		System.out.println("Enter an alphabet");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		switch(str.charAt(0)) {
		case 'a','e','i','o','u':
				System.out.println(str.charAt(0)+" is a Vowel");
			break;
			default:
				System.out.println(str.charAt(0)+" is a Consonant");
		}
	}

}
