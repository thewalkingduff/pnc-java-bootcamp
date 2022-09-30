package com.teksystems;

import java.text.NumberFormat;
import java.util.Locale;

public class FutureTuition {

	public static final double INCREASE_PERCENTAGE = 1.07;
	
	public FutureTuition() {
		// where any initilization can be done
	}
	
	public void futureTution() {
		int tuition = 400000;
		double futureTuition = tuition;
		int year = 0;
		
		System.out.println("Year\tTuition");
		while (futureTuition <= tuition * 2) {
			futureTuition = calculateTuition(futureTuition);
			year = year + 1;
			NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);		
			
			//System.out.printf("%d\t%s\n", year, nf.format(futureTuition) );			
			System.out.println(year + "\t" + nf.format(futureTuition));
		}
	}
	
	private double calculateTuition( double tuituin ) {
		double futureTuition = INCREASE_PERCENTAGE * tuituin;
		return futureTuition;
	}
	
	public static void main(String[] args) {
		FutureTuition ft = new FutureTuition();
		ft.futureTution();
	}
	
}
