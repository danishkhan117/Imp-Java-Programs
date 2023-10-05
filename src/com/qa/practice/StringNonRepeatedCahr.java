package com.qa.practice;

public class StringNonRepeatedCahr {
	// Find first non repeated character in a String
	public static void main(String[] args) {
		String s = "char";

		for (int i = 0; i < s.length(); i++) {

			boolean unique = true;

			for (int j = 0; j < s.length(); j++) {

				if (i != j && s.charAt(i) == s.charAt(j)) {
					unique = false;
					break;
				}
			}

			if (unique == true) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}