package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		int priceDollars;
		int priceCents;
		int totalPrice;
		int receieveDollars;
		int receivedCents;
		int totalReceive;
		int changeToReturn;
		int remainingChange;
		int changeDollars;
		int changeQuarters;
		int changeDimes;
		int changeNickels;
		int changePennies;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter price dollars:");
		priceDollars = keyboard.nextInt();
		
		System.out.println("Enter price cents:");
		priceCents = keyboard.nextInt();
		
		System.out.println("Enter Enter money received dollars:");
		receieveDollars = keyboard.nextInt();
		
		System.out.println("Enter money received cents:");
		receivedCents = keyboard.nextInt();
		
		totalPrice = (priceDollars*100) + priceCents;
		totalReceive = (receieveDollars * 100) + receivedCents;
		changeToReturn = totalReceive - totalPrice;
		changeDollars = changeToReturn / 100;
		remainingChange = changeToReturn % 100;
		changeQuarters = remainingChange / 25;
		remainingChange = remainingChange % 25;
		changeDimes = remainingChange / 10;
		remainingChange = remainingChange % 10;
		changeNickels = remainingChange / 5;
		remainingChange = remainingChange % 5;
		changePennies = remainingChange;
		
		System.out.println("Change returned:");
		System.out.println(changeDollars+" dollar(s)");
		System.out.println(changeQuarters+" quarter(s)");
		System.out.println(changeDimes+" dime(s)");
		System.out.println(changeNickels+" nickel(s)");
		System.out.println(changePennies+" pennies");
	}

}
