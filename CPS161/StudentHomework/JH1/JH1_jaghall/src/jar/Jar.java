package jar;

import java.util.Scanner;

public class Jar {
	public static void main(String[] args) {
		int quarters;
	    int dimes;
	    int nickels;
	    int pennies;
	    int total = 0;

	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter in the number of quarters");
	    quarters = keyboard.nextInt();
	    total += quarters * 25;

	    System.out.println("Enter in the number of dimes");
	    dimes = keyboard.nextInt();
	    total += dimes * 10;

	    System.out.println("Enter in the number of nickels");
	    nickels = keyboard.nextInt();
	    total += nickels * 5;

	    System.out.println("Enter in the number of pennies");
	    pennies = keyboard.nextInt();
	    total += pennies;
	    
	    System.out.println("Total: " + total + " cents");
	}
}
