package make_change;

import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		// Local variable declarations
		int amount;
		int amountReceived;
		int changeToReturn;
		int dollars, quarters, dimes, nickels, pennies;
		
		// Accept input and assign to local variables
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter price dollars: ");
		amount = keyboard.nextInt() * 100;
		System.out.print("\nEnter price cents: ");
		amount += keyboard.nextInt();
		
		System.out.print("\nEnter money received dollars: ");
		amountReceived = keyboard.nextInt() * 100;
		System.out.print("\nEnter money received cents: ");
		amountReceived += keyboard.nextInt();
		
		// Calculate change needed to be returned and print
		changeToReturn = amountReceived - amount;
		System.out.println("\nChange returned:");
		
		// We use changeToReturn to keep track of the remainder and simply calculate the next biggest coin
		dollars = changeToReturn / 100;
		changeToReturn -= dollars * 100;
		System.out.println(dollars + " dollar(s)");
		
		quarters = changeToReturn / 25;
		changeToReturn -= quarters * 25;
		System.out.println(quarters + " quarter(s)");
		
		dimes = changeToReturn / 10;
		changeToReturn -= dimes * 10;
		System.out.println(dimes + " dime(s)");
		
		nickels = changeToReturn / 5;
		changeToReturn -= nickels * 5;
		System.out.println(nickels + " nickel(s)");
		
		pennies = changeToReturn;
		changeToReturn -= pennies;
		System.out.println(pennies + " pennies");
	}

}
