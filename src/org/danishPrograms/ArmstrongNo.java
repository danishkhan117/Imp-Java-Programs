package org.danishPrograms;

public class ArmstrongNo {

	public static void main(String[] args) {

		int num =407;

		int sum=0 , rem=0 , temp=num;

		while(num>0) {

			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;

		}

		if(temp==sum) {

			System.out.println("no is armstrong");
		}else {
			System.out.println("no is not armstrong");

		}

	}

}
