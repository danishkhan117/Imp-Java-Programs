package com.qa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Common {

	public static void main(String[] args) {
		// 1. How to compare two array list?
		// Via Collection.sort(); and equal

		ArrayList<Integer> arrList1 = new ArrayList<>(Arrays.asList(12, 11, 2, 3));
		ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(2, 12, 11));
		// without below steps - it will not give correct result
		Collections.sort(arrList1);
		Collections.sort(arrList2);
		boolean status = arrList1.equals(arrList2);
		System.out.println(status);

		// 2. How to find additional element in list while comparing 2 List?
		// If we have 2 list l1 & l2 , first we remove all element of l2
		// L1.removeAll(l2):
		// Sysout(L1) – you will get additional element.
		arrList1.removeAll(arrList2);
		System.out.println("Additional element" + arrList1);

		// 3. How to find common element in list while comparing 2 List?
		// L1.retainAll(L2);
		// Sysout(L1) – you will get common element.
		ArrayList<Integer> arrList3 = new ArrayList<>(Arrays.asList(12, 1, 2, 3));
		ArrayList<Integer> arrList4 = new ArrayList<>(Arrays.asList(2, 12, 101));

		arrList3.retainAll(arrList4); // returns common elements
		System.out.println("common element" + arrList3);

		// 4. How will you print length of string without using length method.
		String str = "shahadat";
		System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));

	}

}
