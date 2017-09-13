package jar;

import java.util.Scanner;

public class jar {

	public static void main(String[] args) {
		int Quarters, Dimes, Nickels, Pennies, All;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of quarters in the Jar");
	       Quarters= keyboard.nextInt();
	    
	    System.out.println("Enter the number of dimes in the Jar");
	       Dimes= keyboard.nextInt();
	    
	    System.out.println("Enter the number of nickels in the Jar");
	       Nickels= keyboard.nextInt();
	    
	    System.out.println("Enter the number of pennies in the Jar");
	       Pennies= keyboard.nextInt();
		
	    All= 25*Quarters + 10*Dimes + 5*Nickels + Pennies;
	    
	    System.out.println("The jar contains " + All + " cents.");		

	}
	
}

