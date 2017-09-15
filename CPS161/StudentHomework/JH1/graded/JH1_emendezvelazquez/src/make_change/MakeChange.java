package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		float cost;
		float received;
		float change;
		int dollars, quarters, dimes, nickels, pennies;
		int remaining_cents;
		
		
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.println("Enter how much it cost: ");
		 cost = keyboard.nextFloat();
		 
		 System.out.println("Enter how much you paid: ");
		 received = keyboard.nextFloat();
		
		 
		 change = (received - cost) * 100;
		 
		 dollars = (int) (change / 100);
		 remaining_cents= (int) (change % 100);
		 quarters = remaining_cents / 25;
		 remaining_cents = remaining_cents - (quarters * 25);
		 dimes= (remaining_cents / 10);
		remaining_cents = remaining_cents - (dimes * 10);
		 nickels = remaining_cents / 5;
		 pennies = remaining_cents - (nickels * 5);
		 
		 System.out.println("Your change will be: " + change + " cents" );
		 System.out.println("Your change will be: " + dollars + " Dollar(s), " + quarters + " Quarters, " + dimes + " Dimes, " + nickels + " Nickels, and " + pennies + " Pennies ");
		 
		 
		
		 
				 
				 
				 
				 
		 
		 
				 
			 
				 


	}

}
