package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		// Local variable declarations
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		int total;
		
		// Accept input and assign to local variables
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter in the number of Quarters in the Jar: ");
		quarters = keyboard.nextInt();
		System.out.print("\nEnter in the number of Dimes in the Jar: ");
		dimes = keyboard.nextInt();
		System.out.print("\nEnter in the number of Nickels in the Jar: ");
		nickels = keyboard.nextInt();
		System.out.print("\nEnter in the number of Pennies in the Jar: ");
		pennies = keyboard.nextInt();
		
		// Calculate total and print
		total = (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;
		System.out.println("\nThe Jar contains " + total + " cents.");
	}

}
