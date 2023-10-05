package com.qa.practice;

import java.util.*;

class ReverseString {
	public static void main(String args[]) {
		// 1st approach
		/*
		 * String original, reverse = ""; Scanner in = new Scanner(System.in);
		 * System.out.println("Enter a string to reverse"); original = in.nextLine();
		 * int length = original.length(); for (int i = length - 1; i >= 0; i--) reverse
		 * = reverse + original.charAt(i);
		 * System.out.println("Reverse of entered string is: " + reverse);
		 */
		// 2n approach
		String blogName = "java2blog";
		String reverseStr = "";
		for (int i = blogName.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + blogName.charAt(i);
		}
		System.out.println("Reverse of java2blog is:" + reverseStr);
	}
}
//3rd approach Using Internal java Method
/*
 *  StringBuffer a = new StringBuffer("Java programming is fun");
 * System.out.println(a.reverse()); }
 */
