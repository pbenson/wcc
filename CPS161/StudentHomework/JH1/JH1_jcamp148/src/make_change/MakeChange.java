package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		int dollars1;
		int cents1;
		int dollars2;
		int cents2;
		int change;
		int dollars3;
		int quarters;
		int dimes;
		int nickles;
		int pennies;
		int oops;
		

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter price dollars:");
		dollars1 = keyboard.nextInt();
		System.out.println("Enter price cents:");
		cents1 = keyboard.nextInt();
		System.out.println("Enter money recieved dollars;");
		dollars2 = keyboard.nextInt();
		System.out.println("Enter money recieved cents:");
		cents2 = keyboard.nextInt();
		change = (dollars2 * 100 + cents2) - (dollars1 * 100 + cents1);
		
		System.out.println("Change returned:");
		
		dollars3 = change / 100;
		System.out.println(dollars3 + " dollar(s)");
		
		quarters = (change % 100) / 25;
		System.out.println(quarters + " quarter(s)");
		
		dimes = (dollars3 % 25) / 10;
		System.out.println(dimes + " dime(s)");
		
		nickles = (quarters % 10) / 5;
		System.out.println(nickles + " nickle(s)");
		
		pennies = dimes % 5;
		System.out.println(pennies + " pennies");
		
				
		keyboard.close();
				

	}

}
