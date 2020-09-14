package com.assignment.q5;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Size of Pattern: ");
		int len = s.nextInt();
		printPattern(len);
		s.close();
	}

	protected static void printPattern(int len) {
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

}
