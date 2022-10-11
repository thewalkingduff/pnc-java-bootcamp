package com.teksystems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExamples {

	public static void main(String[] args) {
				
		try {
			
			readFile();		
			
			String[] st = { "A", "B", "C", "D", "E" };
			st[11] = "X";

			String s = null;
			int l = s.length();
			
			throw new Exception("exception message 1234");

		} catch (NullPointerException npe) {
			
			System.out.println(npe.getMessage());
			// e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("index position is not exsist --> " + e.getMessage());
			// e.printStackTrace();

		} catch (Exception e1) {

			System.out.println(e1.getMessage());
			e1.printStackTrace();
			// e.printStackTrace();

		} finally {
			System.out.println("This is the finally block");
		}
	}

	public static void readFile() throws FileNotFoundException {
		File f = new File("./notexist.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
	}
	

}
