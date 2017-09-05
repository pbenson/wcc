package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		int priceDollars;
		int priceCents;
		int receiptDollars;
		int receiptCents;
		int pennies;
		int nickels;
		int dimes;
		int quarters;
		int changeCents;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the dollar portion of the price?");
		priceDollars = keyboard.nextInt();
		
		System.out.println("What is the cents portion of the price?");
		priceCents = keyboard.nextInt();

		System.out.println("What is the dollar portion of the amount received?");
		receiptDollars = keyboard.nextInt();
		
		System.out.println("What is the cents portion of the amount received?");
		receiptCents = keyboard.nextInt();
		
		changeCents = ((receiptDollars * 100) + receiptCents) - ((priceDollars * 100) + priceCents);
		
		System.out.println("Change owed:");
		System.out.println(changeCents / 100 + " dollar(s)");
		
		changeCents = changeCents % 100;
		System.out.println(changeCents / 25 + " quarter(s)");

		changeCents = changeCents % 25;
		System.out.println(changeCents / 10 + " dime(s)");
		
		changeCents = changeCents % 10;
		System.out.println(changeCents / 5 + " nickels(s)");
		
		changeCents = changeCents % 5;
		System.out.println(changeCents + " pennies(s)");
		
	}

}
