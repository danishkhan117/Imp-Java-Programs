package com.qa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayOrder {

	public static void main(String[] args) {
		// 1st approach
		Integer arr[] = { 12, 0, 133, -4, 43, 3, 10 };
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
		// arrList.add(12);

		System.out.println(arrList);

		Collections.sort(arrList);
		System.out.println(arrList);

		Collections.reverse(arrList);
		System.out.println(arrList);
		System.out.println("----------------------------");

		// Ascending order
		int arr1[] = { 12, 0, 133, -4, 43, 3, 10 };
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		// sorts array[] in descending order
		Integer arr2[] = { 12, 0, 133, -4, 43, 3, 10 };
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " + Arrays.toString(arr2));
	}

}
