package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		int dollars;
		int cents;
		int quarter, dime, nickel, penny, priceDollars, priceCents;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the item price dollars: ");
		priceDollars = keyboard.nextInt()*100;
		
		System.out.println("Enter the item price cents: ");
		priceCents = keyboard.nextInt();
		
		System.out.println("Please enter the number of dollars given: ");
		dollars = keyboard.nextInt() * 100;
		
		System.out.println("Please enter the number of cents given: ");
		cents = keyboard.nextInt();
		
		int value = priceDollars + priceCents;
		int total = (dollars + cents)-value;
		int returnDollars =total/100;
		int returncents = total%100;
		System.out.println("The return change is " + total);
		

		System.out.println("Dollars: " + returnDollars);
		quarter = returncents/25;
		System.out.println("Quarters: " + quarter);
		dime = (returncents -quarter*25)/10;
		System.out.println("Dimes: " + dime);
		nickel = (returncents-quarter*25-dime*10)/5;
		System.out.println("Nickels: " + nickel);
		penny = returncents-quarter*25-dime*10-nickel*5;
		System.out.println("Pennies: " + penny);
		keyboard.close();
	
		

	}

}
