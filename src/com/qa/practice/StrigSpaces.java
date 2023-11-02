package com.qa.practice;

public class StrigSpaces {
	public static void main(String[] args) {
		String s = " I m Indian";
		int c = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '\s') {
				c++;
			}
		}
		System.out.println(c);
	}
}