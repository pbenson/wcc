/**Programmer: Trevor Bean 
 * Program: Basic Gas Mileage
 * Teacher: Peter Benson**/
import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args)
	{
		int recd, recc, prid, pric, chad, chac;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome, please enter teh price, and the amount of mone you are using for the transaction \n In Dollar , cent format");
		prid = keyboard.nextInt();
		System.out.println("Your Entry for Price in dollars comes to " + prid);
		pric = keyboard.nextInt();
		System.out.println("Your Entry for Price in cents comes to " + pric);
		recd = keyboard.nextInt();
		System.out.println("Your Entry for currency given in dollars comes to " + recd);
		recc = keyboard.nextInt();
		System.out.println("Your Entry for currency given in cents comes to " + recc);
		chad = recd - prid;
		chac = recc - pric;
		if (chac < 0)
		{
			chad -= 1;
			chac = chac + 100;
		}
		
		System.out.println("Your change comes to " + chad + "Dollars and " + chac + " Cents!");
	}
	

}
