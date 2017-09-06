package edu.wccnet.pbenson;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the dollar portion of the price?");
		int priceDollars = keyboard.nextInt();
		
		System.out.println("What is the cents portion of the price?");
		int priceCents = keyboard.nextInt();

		System.out.println("What is the dollar portion of the amount received?");
		int receiptDollars = keyboard.nextInt();
		
		System.out.println("What is the cents portion of the amount received?");
		int receiptCents = keyboard.nextInt();
		
		int changeCents = ((receiptDollars * 100) + receiptCents) - ((priceDollars * 100) + priceCents);
		
		System.out.println("Change owed:");
		System.out.println(changeCents / 100 + " dollar(s)");
		
		changeCents %= 100;
		System.out.println(changeCents / 25 + " quarter(s)");

		changeCents %= 25;
		System.out.println(changeCents / 10 + " dime(s)");
		
		changeCents %= 10;
		System.out.println(changeCents / 5 + " nickel(s)");
		
		changeCents %= 5;
		System.out.println(changeCents + " penny(ies)");
		keyboard.close();
	}

}
