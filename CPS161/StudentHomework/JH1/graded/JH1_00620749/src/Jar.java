/**Programmer: Trevor Bean 
 * Program: Basic Gas Mileage
 * Teacher: Peter Benson**/
import java.util.Scanner;

public class Jar 
{
	public static void main(String[] args)
	{
		int dol = 0, cent, q , d, n , p ;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many of each coin are in your jar?.");
		System.out.println("How many Quarters?.");
		q = keyboard.nextInt();
		q = q * 25;
		System.out.println("How many Dimes?.");
		d = keyboard.nextInt();
		d = d * 10;
		System.out.println("How many Nickles?.");
		n = keyboard.nextInt();
		n = n* 5;
		System.out.println("How many Pennies?.");
		p = keyboard.nextInt();
		p = p * 1;
		cent = q + d + n + p;//added to account for multiply by zero problem
		while(cent >= 100)
		{	
			dol += 1;
			cent -= 100;
		}
		keyboard.close();
		System.out.print("Your combination of change amounts to " + dol + " Dollars and " + cent + " Cents. Have a nice day!!");
	}
}
