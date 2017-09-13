package jar;

import java.util.Scanner;

public class Jar {
	public static void main(String[] args) {
	
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		double dQuarters;
		double dDimes;
		double dNickels;
		double dPennies;		
		
		double total;
		
		int dollars;
		int cents;
	
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("How many quarters are in the jar?");
		quarters = keyboard.nextInt();

		System.out.println("How many dimes are in the jar?");
		dimes = keyboard.nextInt();
	
		System.out.println("How many nickels are in the jar?");
		nickels = keyboard.nextInt();
	
		System.out.println("How many pennies are in the jar?");
		pennies = keyboard.nextInt();
		
		dQuarters = quarters * 0.25;
		dDimes = dimes * 0.10;
		dNickels = nickels * 0.05;
		dPennies = pennies * 0.01;
		
		total = dQuarters + dDimes + dNickels + dPennies;
		
		dollars = (int) (total / 1);
		cents = (int) ((total % 1) * 100);
		
		
		System.out.println("");
		System.out.println("The jar contains " + dollars + " dollar(s) and " + cents + " cent(s)!");
		
		keyboard.close();	
	
	}	
}
