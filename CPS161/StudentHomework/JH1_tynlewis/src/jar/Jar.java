package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		
	int pennies;
	int nickels;
	int dimes;
	int quarters;
	double value;

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("How many pennies are in the jar?");
	pennies = keyboard.nextInt();
	
	System.out.println("How many nickles are in the jar?");
	nickels = keyboard.nextInt();
	
	System.out.println("How many dimes are in the jar?");
	dimes = keyboard.nextInt();
	
	System.out.println("How many quarters are in the jar?");
	quarters = keyboard.nextInt();
	
	value = (pennies * .01) + (nickels * .05) + (dimes * .1) + (quarters * .25);
	
	System.out.println("There is $" + value + " in the jar.");
			
	}

}
