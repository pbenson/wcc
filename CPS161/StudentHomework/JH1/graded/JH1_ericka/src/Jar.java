package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		 int Quarters, Dimes, Nickels, Pennies;
		 float total;
		 
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.println("Enter the number of Quarters in the Jar:");
			Quarters = keyboard.nextInt();
			
	     System.out.println("Enter the number of Dimes in the Jar:");
			Dimes = keyboard.nextInt();
			
		System.out.println("Enter the number of Nickels in the Jar:");
			Nickels = keyboard.nextInt();

		System.out.println("Enter the number of Pennies in the Jar:");
			Pennies = keyboard.nextInt();
			
		total = (Quarters * 25) + (Dimes *10) + (Nickels * 5) + Pennies;
					
		System.out.println("The Jar contains "+ total + " cents.");
		
		
	}

}
