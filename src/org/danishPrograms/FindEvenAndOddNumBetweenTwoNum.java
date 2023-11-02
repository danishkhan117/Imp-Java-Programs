package org.danishPrograms;

public class FindEvenAndOddNumBetweenTwoNum {

	public static void main(String[] args) {

		int n1=10 , n2=70;

		for(int i=n1 ;i<=n2 ;i++) {

			for(int j=2 ;j<=i ;j++) {

				if(i%j==0) {

					break;

				}

				if(i==j) {

					System.out.println(j);



				}
			}
	}
}
}