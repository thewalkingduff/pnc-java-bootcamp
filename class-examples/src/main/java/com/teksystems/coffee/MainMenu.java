package com.teksystems.coffee;

import java.util.Arrays;
import java.util.Scanner;

public class MainMenu {

	// hook this up to use a scanner to take user input
	// each of 1 to 4 should be implmented in its own sub function
	// should use a while loop to keep displaying the menu until the user selects
	// exit
	// print a menu 
	// 1) order item 2) list order 3) fulfillOrder 4) List menu 5) print total 6) list drinks 7) list food 8) exit
	// 
	// -- 1 function that displays the menu, collects the user input, and returns an integer for selection
	//  if the user type 1 and hits enter this function will return 1
	
	// using a while loop ... an if or case statement
	
	// for example a user enters 1 .. create a function that will ask the user to enter the item name and call
	// the addOrder on the coffee house and return to the main menu
	// then if a user select 4 print to total and go back to the main menu
	// 
	// BONUS dont forget some error checking ... if a user enters a letter instead of a number gracefully handle that
	// BONUS remove an item from the order.
	
	private Scanner scanner = new Scanner(System.in);
	private CoffeeShop shop = new CoffeeShop();
	
	public static void main(String[] args) {
		MainMenu m = new MainMenu();
		m.start();
	}
	
	// TODO change this method to reduce complexity in the while loop condition
	public void start() {
		int input = showMenuAndCaptureUserInput();
		while( input != 4 ) {
			switch ( input ) {
			case 1 :
				// order item
				orderMenuItem();
				break;
			case 2 :
				// list order
				listOrderDetails();
				break;
			case 3 : 
				// fulfill order
				break;
			case 4 :
				// exit program
				System.exit(0);
			default :
				// this is the catch all and is an error state
				// for example the user enters a non valid menu selection
				System.out.println("Invalid menu selection");
			}
			
			input = showMenuAndCaptureUserInput();
		}
	}
	
	// TODO fix this function to display a different message if there are no items ordered
	// TODO use the formatter to make the amount due print nicely with a $
	private void listOrderDetails() {
		String[] orderItems = shop.listOrders();
		
		System.out.println("========================");
		System.out.println("Your current order contains:");
		
		for ( String item : orderItems ) {
			System.out.println(item);
		}
		
		System.out.println("\nTotal Amount Due: " + shop.dueAmount());
	}
	
	private void orderMenuItem() {
		System.out.print("Enter item to order ");
		// remember that if you are capturing spaces from the user input to use nextLine
		String itemName = scanner.nextLine();
		
		String success = shop.addOrder(itemName);
		System.out.println("\n" + success + "\n");
	}
	
	private int showMenuAndCaptureUserInput() {
		System.out.println("========================");
		System.out.println("1) Order Item");
		System.out.println("2) List Order");
		System.out.println("3) Fulfill Order");
		System.out.println("4) Exit");
		
		System.out.print("Enter menu option ");
		
		int input = scanner.nextInt();
		scanner.nextLine();
		return input;
	}


	public void startBasic() {
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
