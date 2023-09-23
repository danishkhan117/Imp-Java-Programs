package org.ImpPrograms;

public class TestI3{

	public static void main(String[] args) {
		int num = 12345;
		// 54321
		int rem;
		int sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
