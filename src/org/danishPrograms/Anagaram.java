package org.danishPrograms;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {

		String x = "elbow";
		String y = "below  ";
		
	
		y = y.replaceAll("\\s", "");
		

		char[] a = x.toCharArray();    //extract the data from first string and store in char[] a
		char[] b = y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result = Arrays.equals(a, b);

		if(result==true) {

			System.out.println("String are anagram");
		}else {

			System.out.println("String are not anagram");
		}



	}

}
