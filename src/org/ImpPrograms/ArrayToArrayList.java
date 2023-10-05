package org.ImpPrograms;

//Java program to illustrate conversion
//of an array to an ArrayList

import java.util.Arrays;
import java.util.ArrayList;

class ArrayToArrayList {
	public static void func2(Integer arr[]) {
		// Using Arrays.asList() method
		ArrayList<Integer> array_list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.print(array_list);
	}

	public static void main(String[] args) {

		// Integer objects are used instead
		// of primitives for conversion to list
		Integer array[] = { new Integer(1), new Integer(2), 
				new Integer(3), new Integer(4), new Integer(5) };
		func2(array);
	}
}
