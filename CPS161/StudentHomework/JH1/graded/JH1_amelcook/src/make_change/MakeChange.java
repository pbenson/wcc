package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
	int priceD;
	int priceC;
	int recD;
	int recC;
	
	int change;
	int answer;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter price in dollars: ");
	priceD = keyboard.nextInt();
	System.out.println("Enter price in cents: ");
	priceC = keyboard.nextInt();
	
	answer = (priceD * 100) + priceC;
	System.out.println("The cost in pennies is: " + answer);
	
	System.out.println("");
	
	System.out.println("Enter money received in dollars: ");
	recD = keyboard.nextInt();
	System.out.println("Enter money received in cents: ");
	recC = keyboard.nextInt();
	
	System.out.println("");
	
	answer = (recD * 100) + recC;
	System.out.println("The money received in pennies is: " + answer);
	
	answer = ((recD * 100) + recC) - ((priceD * 100) + priceC);
	System.out.println("The change to return in pennies is: " + answer);
	
	System.out.println("");
	
	answer = ( ((recD * 100) + recC) - ((priceD * 100) + priceC)) / 100;
	System.out.println("The change to return in dollars = " + answer);
	
	answer = ( ((recD * 100) + recC) - ((priceD * 100) + priceC)) % 100;
	System.out.println("The change to return in cents = " + answer);
	
	System.out.println("");
	
	answer = ( ((recD * 100) + recC) - ((priceD * 100) + priceC)) / 100;
	System.out.println("Dollars returned = " + answer);
	
	answer = (( ((recD * 100) + recC) - ((priceD * 100) + priceC)) % 100 ) / 25;
	System.out.println("Quarters returned = " + answer);
	
	answer = ((( ((recD * 100) + recC) - ((priceD * 100) + priceC)) % 100 ) % 25) / 10;
	System.out.println("Dimes returned = " + answer);
	
	answer = ((((( ((recD * 100) + recC) - ((priceD * 100) + priceC)) % 100 ) % 25) / 10) % 10) / 5;
	System.out.println("Nickels returned = " + answer);
	
	answer = (((( ((recD * 100) + recC) - ((priceD * 100) + priceC)) % 100 ) % 25) % 10) / 1;
	System.out.println("Pennies returned = " + answer);
	
	keyboard.close();
	

	}

}
