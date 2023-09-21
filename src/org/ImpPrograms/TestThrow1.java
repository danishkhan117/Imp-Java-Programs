package org.ImpPrograms;

//How to throw exception in java Program
public class TestThrow1 {

	public static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("Not eligible to vote.");
			
		else
			System.out.println("welcome to vote on !!!");
	}

	public static void main(String args[]) {
		validate(19);
		System.out.println("rest of the code...");
	}

}
