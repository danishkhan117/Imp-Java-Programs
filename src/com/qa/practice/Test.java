package com.qa.practice;

public class Test {
	public static void main(String[] args) {
		String s = "hahadat";

		for (int i = 0; i < s.length(); i++) {

			boolean isUnique = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					isUnique = false;
					break;
				}
			}
				if(isUnique == true) {
					System.out.println(s.charAt(i));
					break;
				}
			}

		}

	}
