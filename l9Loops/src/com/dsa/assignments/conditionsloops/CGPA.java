package com.dsa.assignments.conditionsloops;

import java.util.Iterator;
import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of subjects:");
		int subCount = in.nextInt();
		System.out.println("Enter the marks:");
		int[] marks= new int[subCount];
		for (int i = 0; i < subCount; i++) {
			marks[i]=in.nextInt();
		}
		
		float totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark/10;
		}
		float cgpa = totalMarks/subCount;
		System.out.println("CGPA :"+cgpa);
		float cgpPercentage = (float) (cgpa * 9.5);
		System.out.println("CGPA % :"+cgpPercentage);
	}

}
