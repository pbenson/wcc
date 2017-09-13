package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		int cost = 0;
		int given = 0;
		int remainder;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter price dollars");
		cost += keyboard.nextInt() * 100;
		
		System.out.println("Enter price cents");
		cost += keyboard.nextInt();
		
		
		System.out.println("Enter given dollars");
		given += keyboard.nextInt() * 100;
		
		System.out.println("Enter given cents");
		given += keyboard.nextInt();
		
	    remainder = given - cost;
	    System.out.println("Dollars: " + remainder / 100);
	    remainder = remainder % 100;
	    
	    System.out.println("Quarters: " + remainder / 25);
	    remainder = remainder % 25
	    		;
	    System.out.println("Dimes: " + remainder / 10);
	    remainder = remainder % 10;
	    
	    System.out.println("Dimes: " + remainder / 5);
	    remainder = remainder % 5;
	    
	    System.out.println("Pennies: " + remainder);
	}

}
