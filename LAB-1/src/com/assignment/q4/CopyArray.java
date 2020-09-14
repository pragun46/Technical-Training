package com.assignment.q4;

import java.util.Arrays;

public class CopyArray {
	public static int[] copyOf(int[] array) {
		int[] copyArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copyArray[i] = array[i];
		}
		return copyArray;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3,4,5 };
		int[] copyArray = array;
		array = null;
		System.out.println(Arrays.toString(copyArray));

	}

}
