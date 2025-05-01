package com.dsa.assignments.functions;

import java.util.Scanner;

public class YourGrade {

	public static void main(String[] args) {
		System.out.println("Enter your marks");
		Scanner in = new Scanner(System.in);
		int mark ;
		do {
			mark = in.nextInt();
			System.out.println("Your grade is : "+getGrade(mark));
		}while(mark !=-1);
	}
	
	static String getGrade(int mark) {
		String grade = "";
		if(mark >=91) {
			grade="AA";
		}else if(mark >=81 && mark <91) {
			grade="AB";
		}else if(mark >=71 && mark <81) {
			grade="BB";
		}else if(mark >=61 && mark <71) {
			grade="BC";
		}else if(mark >=51 && mark <61) {
			grade="CD";
		}else if(mark >=41 && mark <51) {
			grade="DD";
		}else {
			grade="Fail";
		}
		return grade;
	}

}
