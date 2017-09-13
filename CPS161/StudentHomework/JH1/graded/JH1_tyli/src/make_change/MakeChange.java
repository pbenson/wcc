package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int dollarC;
	int coinC;
	int totC;
	
	int dollarR;
	int coinR;
	int totR;
	
	int dollar;
	int dollarRem;
	
	int quart;
	int quartRem;
	
	int dime;
	int dimeRem;
	
	int nickel;
	int nickelRem;
	
	int penny;
	

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter the price of the product in dollars");
	dollarC = keyboard.nextInt();
	dollarC = dollarC * 100;
	
	System.out.println("Enter the price of the product in cents");
	coinC = keyboard.nextInt();
	
	//-------------------------------
	totC = dollarC + coinC;
	//-------------------------------
	
	
	System.out.println("Enter the money received in dollars");
	dollarR = keyboard.nextInt();
	dollarR = dollarR * 100;
	
	System.out.println("Enter the money received in cents");
	coinR = keyboard.nextInt();
	
	//-------------------------------
	totR = dollarR + coinR;
	//-------------------------------
	
	//HERE WE START DOING THE COIN PART :^)
	
	System.out.println("Change returned:");
	
	
	dollar = (totR - totC) / 100;
	System.out.println("Dollar(s): " + dollar);
	dollarRem = (totR - totC) % 100;
	
	quart = dollarRem / 25;
	System.out.println("Quarter(s): " + quart);
	quartRem = dollarRem % 25;
	
	dime = quartRem / 10;
	System.out.println("Dime(s): " + dime);
	dimeRem = quartRem % 10;
	
	nickel = dimeRem / 5;
	System.out.println("Nickel(s): " + nickel);
	nickelRem = dimeRem % 5;
	
	penny = nickelRem;
	System.out.println("Penny(ies): " + penny);
	
	
	
	keyboard.close();

	}

}
