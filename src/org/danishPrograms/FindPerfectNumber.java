package org.danishPrograms;

public class FindPerfectNumber {

	public static void main(String[] args) {

		int num = 8, sum=0;  //1,2,3,4,5
		
		for(int i=1 ;i<num ;i++) {
			
			if(num%i==0) {
			
			sum=sum+i;
		}
		}
		if(num==sum) {
			
			System.out.println("num is perfect");
			
		}else{
			System.out.println("num is not perfect");
			
		}
		
	}

}
