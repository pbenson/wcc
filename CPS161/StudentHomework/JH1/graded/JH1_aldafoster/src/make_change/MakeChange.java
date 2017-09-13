package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter price dollars: ");
		int dollars1 = keyboard.nextInt();
		System.out.println("Enter price cents: ");
		int cents1 = keyboard.nextInt();
		int totalprice = dollars1*100 + cents1;
		
		System.out.println("Enter money received in dollars: ");
		int dollars2 = keyboard.nextInt();
		System.out.println("Enter money received in cents: ");
		int cents2 = keyboard.nextInt();
		int moneygiven = dollars2*100 + cents2;
		int changetoreturn = moneygiven - totalprice;
		
		
		System.out.println("Change returned:");
		int dollars3 = changetoreturn / 100;
		System.out.println(dollars3 + " " + "dollar(s)");
		int cents3 = changetoreturn % 100;
		int quarters = cents3 / 25;
		System.out.println(quarters + " " + "quarter(s)");
		int cents4 = cents3 % 25;
		int dimes = cents4 / 10;
		System.out.println(dimes + " " + "dime(s)");
		int cents5 = cents4 % 10;
		int nickels = cents5 / 5;
		System.out.println(nickels + " " + "nickel(s)");
		int cents6 = cents5 % 5;
		int pennies = cents6 / 1;
		System.out.println(pennies + " " + "pennies");
				
		

	}

}
