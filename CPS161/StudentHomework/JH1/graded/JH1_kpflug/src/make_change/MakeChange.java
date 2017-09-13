package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		int numquarters; 
		int numdimes; 
		int numnickels; 
		int numpennies; 
		int costdollars; //cost in dollars;
		int costcents; //cost in cents;
		int costtotalcents; //total cost in cents
		int givendollars; //dollars given
		int givencents; //cents given
		int giventotalcents; //total given in cents
		int change; //this is the change to be returned
		
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter cost in dollars");
		costdollars = keyboard.nextInt(); 
		
		System.out.println("Enter cost in cents");
		costcents = keyboard.nextInt(); 
		 
		System.out.println("Enter money received dollars");
		givendollars = keyboard.nextInt();
		
		System.out.println("Enter money received cents");
		givencents = keyboard.nextInt();

		costtotalcents = costdollars * 100 + costcents;
		giventotalcents = givendollars * 100 + givencents;
		change = giventotalcents - costtotalcents;
		
		//System.out.println("Change in cents is " + change);
		
		dollars = change / 100;
		change = change - dollars * 100; //change after subtracting dollars
		quarters = change / 25;
		change = change - quarters * 25; // change after subtracting quarters
		dimes = change / 10;
		change = change - dimes * 10; // change after subtracting dimes
		nickels = change / 5;
		change = change - nickels * 5; // change after - nickels
		pennies = change;
		
		System.out.println("Change returned:");
		System.out.println(dollars + " dollar(s)");
		System.out.println(quarters + " quarter(s)");
		System.out.println(dimes + " dime(s)");
		System.out.println(nickels + " nickel(s)");
		System.out.println(pennies + " pennies");
		
		
		
		
		
	}

}
