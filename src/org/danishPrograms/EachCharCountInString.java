package org.danishPrograms;

public class EachCharCountInString {

	public static void main(String[] args) {

		
		String str = "Learn java today";
		int count = 0;

		for(int i =0 ; i<str.length() ; i++) {

			if(str.charAt(i)!=' ') {
				count++;	
			}
		}
		System.out.println("Total charachter in a string are : "+ count);
	
	}

}
