package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double quart;
		Double dime;
		Double nickel;
		Double penny;
		Double ans;
		
		
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Start
		System.out.println("how many quarters are in the jar?");
		quart = keyboard.nextDouble();
		
		System.out.println("how many dimes are in the jar?");
		dime = keyboard.nextDouble();
		
		System.out.println("how many nickels are in the jar?");
		nickel = keyboard.nextDouble();
		
		System.out.println("Lastly, how many pennies are in the jar?");
		penny = keyboard.nextDouble();
		
		quart = .25 * quart;
		dime = .1 * dime;
		nickel = .05 * nickel;
		penny = .01 * penny;
		ans = quart + dime + nickel + penny;
		System.out.println("");
		
		//RESPONSE
		System.out.println("The amount of money in the jar is $" + ans);
		
		keyboard.close();
		
	}

}
