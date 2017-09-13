package make_change;
import util.Util;

import java.util.Scanner;

import jar.Coin;
import jar.Currency;

public class MakeChange
{
	/**
	 * Prompts the user for the price of the object and the amount paid for it, then displays their change.
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int price = (int) (Util.readDouble(scanner, "Price: $") * 100.0);
		int given = (int) (Util.readDouble(scanner, "Amount Recieved: $") * 100.0);
		int difference = given - price;
		if(difference == 0)
		{
			System.out.println("Thank you for giving exact change.");
		}
		else if(difference < 0)
		{
			System.out.println("That is not enough to pay for the item.");
		}
		else
		{
			System.out.println("Change returned:");
			
			for(Coin coin : Currency.US.getAll())
			{
				difference = handelChange(coin, difference);
			}
		}
		
		scanner.close();
	}
	
	public static int handelChange(Coin coin, int ammount)
	{
		int coins = ammount / coin.getValue();
		if(coins > 0)
		{
			System.out.print("    " + coins + " ");
			if(coins != 1)
			{
				System.out.println(coin.getPlural());
			}
			else
			{
				System.out.println(coin.getName());
			}
			ammount %= coin.getValue();
		}
		return ammount;
	}
}
