package make_change;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		
		int priceDollars;
		int priceCents;
		int inDollars;
		int inCents;
		
		int dPrice;
		int dIn;
		int changeToReturn;	
		
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the price's dollars");
		priceDollars = keyboard.nextInt();
		
		System.out.println("Enter the price's cents");
		priceCents = keyboard.nextInt();
		
		System.out.println("Enter the money received in dollars");
		inDollars = keyboard.nextInt();
		
		System.out.println("Enter the money received in cents");
		inCents = keyboard.nextInt();
		
		dPrice = (priceDollars * 100) + priceCents; 
		dIn = (inDollars * 100) + inCents; 
		
		changeToReturn = dIn - dPrice;
		
		
		dollars = changeToReturn / 100;
		changeToReturn = changeToReturn % 100;
		
		quarters = changeToReturn / 25;
		changeToReturn = changeToReturn % 25;
		
		dimes = changeToReturn / 10;
		changeToReturn = changeToReturn % 10;
		
		nickels = changeToReturn / 5;
		changeToReturn = changeToReturn % 5;
		
		pennies = changeToReturn / 1;
		changeToReturn = changeToReturn % 1;
		
				
		System.out.println("");
		System.out.println("Change returned:");
		System.out.println(dollars + " dollar(s)");
		System.out.println(quarters + " quarter(s)");
		System.out.println(dimes + " dime(s)");
		System.out.println(nickels + " nickel(s)");
		System.out.println(pennies  + " penny(s)");
		
		keyboard.close();	
		
		
	}

}
