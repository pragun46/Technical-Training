package com.assignment.q3;

import java.util.Scanner;


public class GradesAverage {

	public static void main(String[] args) {
		int len;
		Scanner s = new Scanner(System.in);
		System.out.print("Number of students: ");
		len = s.nextInt();
		double average = 0;
		for (int i = 0; i < len; i++) {
			System.out.print("Grade " + (i + 1) + ": ");
			int grade = s.nextInt();
			if (checkValid(grade)) {
				System.out.println("Invalid grade, try again;");
				i--;
			} else {
				average += grade;
			}
		}
		s.close();
		average = average/ (double) len;
		System.out.println("The average is: " + average);

	}

	protected static boolean checkValid(int grade) {
		return grade <= 0 || grade >= 100;
	}

}
