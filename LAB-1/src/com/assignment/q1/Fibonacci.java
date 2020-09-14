package com.assignment.q1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		double avg = 0;
		System.out.println("Enter Length: ");
		Scanner s= new Scanner(System.in);
		int len= s.nextInt();
		avg = fibonacci(len);
		System.out.println("");
		avg = avg / len;
		System.out.println("Average: " + avg);

	}

	protected static double fibonacci(int len) {
		double average;
		int f1 = 1;
		int f2 = 1;
		average = f1 + f2;
		System.out.print("List: "+f1 + " " + f2 + " ");
		for (int i = 0; i < len-2; i++) {
			System.out.print((f1 + f2) + " ");
			int temp = f2;
			f2 = f1 + f2;
			f1 = temp;
			average += f2;
		}
		return average;
	}

}
