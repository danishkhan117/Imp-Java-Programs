package org.danishPrograms;


public class AnyLatterCapitalAndSmallInString {

	public static void main(String[] args) {
		

		System.out.println(StringFormat.CapitalizeWord("my naMe IS KhAN"));

	}
	
	class StringFormat{
		
		public static String CapitalizeWord(String str ) {
			
			String[]words=str.split(" ");
				
			String CapitalizeWord = "";
			
			for(String s:words) {
				
				String FirstLatter =s.substring(0,1);
				String remeningLatters = s.substring(1);
				
				CapitalizeWord+=FirstLatter.toLowerCase()+remeningLatters.toUpperCase()+" ";
			}
			
			return CapitalizeWord.trim();
		}
	}

}
