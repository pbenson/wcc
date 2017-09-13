package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter in the number of Quarters in the Jar:");
		quarters = keyboard.nextInt();
		
		System.out.println("Enter in the number of Dimes in the Jar:");
		dimes = keyboard.nextInt();
		
		System.out.println("Enter in the number of Nickels in the Jar:");
		nickels = keyboard.nextInt();
		
		System.out.println("Enter in the number of Pennies in the Jar:");
		pennies = keyboard.nextInt();
		
		total = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);
		
		System.out.println("The jar contains: $"+total);
	}

}
