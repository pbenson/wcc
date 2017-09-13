package gas_mileage;

import java.util.Scanner;

public class MilesAndGas {

	public static void main(String[] args) {
	
	Float miles;
	Float gas;
	Float answer;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Here is a mile per gallon calculator");
	System.out.println("");
	System.out.println("Please enter an amount of miles");
	miles = keyboard.nextFloat();
	
	System.out.println("Please enter how many gallons are required for that mileage");
	gas = keyboard.nextFloat();
	
	answer = miles / gas;
	System.out.println("The approximate miles per gallon of your vehicle is " + answer);
	
	
	keyboard.close();
	
	}

}
