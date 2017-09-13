package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		int priceOfItemDollars;
		int priceOfItemCents;
		int dollarsReceived;
		int centsReceived;
		
		//receiving the information
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter in the item's dollar price: ");
		priceOfItemDollars = keyboard.nextInt();
		
		System.out.print("Please enter in the item's cents price: ");
		priceOfItemCents = keyboard.nextInt();
		
		System.out.print("Please enter in the dollars given: ");
		dollarsReceived = keyboard.nextInt();
		
		System.out.print("Please enter in the cents given: ");
		centsReceived = keyboard.nextInt();
		
		//calculations; think of the total as pennies.
		
		int totalPriceOfItem;
		int totalMoneyReceived;
		
		totalPriceOfItem = priceOfItemDollars * 100 + priceOfItemCents; //prices of items in pennies
		totalMoneyReceived = dollarsReceived * 100 + centsReceived;
		
		int changeGivenBack; //calculating the change.
		
		changeGivenBack = totalMoneyReceived - totalPriceOfItem;
		
		int dollarsGivenBack;
		int quartersGivenBack;
		int dimesGivenBack;
		int nickelsGivenBack;
		int penniesGivenBack;
		int remainingChange;
		
		dollarsGivenBack = changeGivenBack / 100;
		remainingChange = changeGivenBack % 100;
		
		quartersGivenBack = remainingChange /25;
		remainingChange = remainingChange - quartersGivenBack * 25;
		
		dimesGivenBack = remainingChange /10;
		remainingChange = remainingChange - dimesGivenBack * 10;
		
		nickelsGivenBack = remainingChange /5;
		remainingChange = remainingChange - nickelsGivenBack * 5;
		
		penniesGivenBack = remainingChange /1;
		remainingChange = remainingChange - penniesGivenBack * 1;
		
		//Printing the Results
		
		System.out.println("\nChange returned:");
		System.out.println("Dollar(s): " + dollarsGivenBack);
		System.out.println("Quarter(s): " + quartersGivenBack);
		System.out.println("Dimes(s): " + dimesGivenBack);
		System.out.println("Nickel(s): " + nickelsGivenBack);
		System.out.println("Pennies: " + penniesGivenBack);
		

	}

}
