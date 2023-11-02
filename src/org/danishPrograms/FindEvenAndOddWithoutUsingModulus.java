package org.danishPrograms;

import java.util.Scanner;

public class FindEvenAndOddWithoutUsingModulus {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		int result =(num/2)*2;
		
		if(result==num) {
			
			System.out.println("no is even");
		}else {
			
			System.out.println("no is odd");
		}
		
		
		
	}

}
