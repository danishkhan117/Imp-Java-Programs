package org.danishPrograms;

public class CountNumOfVowlesInString {

	public static void main(String[] args) {

		String str = "Java Knowledge";

		str = str.toLowerCase();
		
		int vowleCount=0;

		for(int i = 0 ; i<str.length() ; i++) {

			char ch = str.charAt(i);

//			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
//				vowleCount++;
//			}

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowleCount++;
				break;
			default:
				break;      	

			}
		}
		
		System.out.println("vowleCount : "+vowleCount);
	
	}

}
