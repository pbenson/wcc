package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		int quarter, dime, nickel, penny;
		int totalDollarsInJar;
		int totalCentsInJar;
		int totalInJar;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please give the number of quarters in jar: ");
		quarter = keyboard.nextInt();
		
		System.out.print("Please give the number of dimes in jar: ");
		dime = keyboard.nextInt();
		
		System.out.print("Please give the number of nickels in jar: ");
		nickel = keyboard.nextInt();
		
		System.out.print("Please give the number of pennies in jar: ");
		penny = keyboard.nextInt();
		
		totalInJar = (quarter * 25) + (dime * 10) + (nickel * 5) + (penny * 1);
		totalDollarsInJar = totalInJar/100;
		totalCentsInJar = totalInJar % 100;

		System.out.println("The total amount of money in the jar is: " + totalDollarsInJar + " dollar(s) and " 
							+ totalCentsInJar + " cents.");
	}

}
