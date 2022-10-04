package com.teksystems.coffee;

import java.util.Arrays;

public class MainMenu {

	// hook this up to use a scanner to take user input
	// each of 1 to 4 should be implmented in its own sub function
	// should use a while loop to keep displaying the menu until the user selects
	// exit
	// print a menu 
	// 1) order item 2) fulfillOrder 3) List menu 4) print total 5) list drinks 6) list food 7) exit
	
	// -- 1 function that displays the menu, collects the user input, and returns an integer for selection
	//  if the user type 1 and hits enter this function will return 1
	
	// using a while loop ... an if or case statement
	
	// for example a user enters 1 .. create a function that will ask the user to enter the item name and call
	// the addOrder on the coffee house and return to the main menu
	// then if a user select 4 print to total and go back to the main menu
	// 
	// BONUS dont forget some error checking ... if a user enters a letter instead of a number gracefully handle that
	
	

	public static void main(String[] args) {
		MainMenu m = new MainMenu();
		m.start();
	}


	public void start() {
		// while loop
		
		
		CoffeeShop tcs = new CoffeeShop();

		// put a scanner to allow a person to enter a menu item

		System.out.println(tcs.addOrder("hot cocoa"));
		System.out.println(tcs.addOrder("iced tea"));
		System.out.println(tcs.addOrder("cinnamon roll"));
		System.out.println(tcs.addOrder("iced coffee"));
		System.out.println(Arrays.toString(tcs.listOrders()));
		System.out.println(tcs.dueAmount());

		// we know that we have 2 items ordered
		// so by fulfilling 3 times the 3rd time shuold be all orders fullfilled
		System.out.println(tcs.fulfillOrder());
		System.out.println(tcs.fulfillOrder());
		System.out.println(tcs.fulfillOrder());

		// now we sould get an empty array because we filled all orders
		System.out.println(Arrays.toString(tcs.listOrders()));
		System.out.println(tcs.dueAmount());

		System.out.println(tcs.cheapestItem());
		System.out.println(Arrays.toString(tcs.drinksOnly()));
		System.out.println(Arrays.toString(tcs.foodOnly()));
	}

}
