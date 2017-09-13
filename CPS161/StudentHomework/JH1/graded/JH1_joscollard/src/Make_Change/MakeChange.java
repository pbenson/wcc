package Make_Change;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int price;
		int paid;
		int change;
		
		System.out.println("Paid: ");
		paid = (int) Math.round(keyboard.nextDouble() * 100);
		
		System.out.println("Amount paid: ");
		price = (int) Math.round(keyboard.nextDouble() * 100);
		
		System.out.println("The change is: ");
		
		change = paid - price;
		
		int dollars = change / 100;
		if (dollars > 0) {
			change = change % 100;
		}
		System.out.println(dollars + " dollars.");
			
		int quarters = change / 25;
		if (quarters > 0) {
			change = change % 25;
		}
		System.out.println(quarters + " quarters.");
		
		int dimes = change / 10;
		if (dimes > 0) {
			change = change % 10;
		}
		System.out.println(dimes + " dimes.");
		
		int nickels = change / 5;
		if (nickels > 0) {
			change = change % 5;
		}
		System.out.println(nickels + " nickels.");
		
		int pennies = change / 1;
		System.out.println(pennies + " pennies.");
		
	}
}
