package com.qa.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		String student[] = {"shahadat","Zidan","Zabir"};
		
		List<String> studentList = Arrays.asList(student);
		
		Iterator<String> it = studentList.iterator();
		
		while(it.hasNext()){
		System.out.println(it.next());
		}

	}

}
