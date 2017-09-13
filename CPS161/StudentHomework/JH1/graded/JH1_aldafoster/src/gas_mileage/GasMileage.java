package gas_mileage;

import java.util.Scanner;

public class GasMileage {
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter gallons used: ");
		double gallons = keyboard.nextDouble();
		System.out.println("Enter miles traveled: ");
		double miles = keyboard.nextDouble();
		double answer;
		//
		
		answer = miles / gallons;
		System.out.println("Your miles per gallon is " + answer);
		
		
		
	}

}
