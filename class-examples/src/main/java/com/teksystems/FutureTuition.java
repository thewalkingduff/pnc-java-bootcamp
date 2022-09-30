package com.teksystems;

import java.text.NumberFormat;
import java.util.Locale;

public class FutureTuition {

	public static final double INCREASE_PERCENTAGE = 1.07;
	
	public static void main(String[] args) {
		int tuition = 400000;
		double futureTuition = tuition;
		int year = 0;
		
		System.out.println("Year\tTuition");
		while (futureTuition <= tuition * 2) {
			futureTuition = INCREASE_PERCENTAGE * futureTuition;
			year = year + 1;
			NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);		
			
			//System.out.printf("%d\t%s\n", year, nf.format(futureTuition) );			
			System.out.println(year + "\t" + nf.format(futureTuition));
		}
	}
	
}
