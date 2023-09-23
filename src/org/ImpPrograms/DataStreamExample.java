package org.ImpPrograms;

import java.io.FileInputStream;

   //. How to read data from text file using java program

public class DataStreamExample { 
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("D:\\Technolamror.txt");
			int i=fin.read();
			System.out.print((char)i);

			fin.close();
		}catch(Exception e){System.out.println(e);}
	}
}
