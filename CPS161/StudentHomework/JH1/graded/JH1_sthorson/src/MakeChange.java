import java.util.Scanner;
public class MakeChange {
	public static void main(String[] args) {
		int cost_cents; 
		int cost_dollars; 
		int tender_cents;
		int tender_dollars;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter price cents:");
		cost_cents = keyboard.nextInt();
		System.out.println("Enter price dollars:");
		cost_dollars = keyboard.nextInt();
		System.out.println("Enter cents tended:");
		tender_cents = keyboard.nextInt();
		System.out.println("Enter dollars tended:");
		tender_dollars = keyboard.nextInt();
		keyboard.close();
		int change_cents = ((tender_dollars * 100) + tender_cents)  - (cost_cents + (cost_dollars * 100));
		int change_dollars = change_cents / 100;
		int change_remaining = (change_cents % 100);
		int change_quarters = (change_remaining)/25;
		change_remaining = (change_remaining % 25);
		int change_dimes = (change_remaining)/10;
		change_remaining = (change_remaining % 10);
		int change_nickles = (change_remaining)/5;
		change_remaining = (change_remaining % 5);
		int change_pennies = change_remaining;
		System.out.println("The change in dollars is " + change_dollars);
		System.out.println("The change in quarters is " + change_quarters);
		System.out.println("The change in dimes is " + change_dimes);
		System.out.println("The change in nickles is " + change_nickles);
		System.out.println("The change in pennies is " + change_pennies);
	}
}