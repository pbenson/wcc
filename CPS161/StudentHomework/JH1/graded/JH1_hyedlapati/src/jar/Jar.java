package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		int total;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of quarters in the jar: ");
		quarters = keyboard.nextInt();
		
		System.out.println("Enter the number of dimes in the jar: ");
		dimes = keyboard.nextInt();
		
		System.out.println("Enter the number of nickels in the jar: ");
		nickels = keyboard.nextInt();
		
		System.out.println("Enter the number of pennies in the jar: ");
		pennies = keyboard.nextInt();
		
		total = quarters*25 + dimes*10 + nickels*5 + pennies;
		System.out.println("Number of cents in jar: " + total);
	}

}
