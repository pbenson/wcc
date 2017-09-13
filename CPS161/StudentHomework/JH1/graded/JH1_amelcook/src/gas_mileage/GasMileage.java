package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
	
		double miles;
		double gal;
		double answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your mileage driven: ");
		miles = keyboard.nextDouble();
		System.out.println("Enter your gallons used: ");
		gal = keyboard.nextDouble();
		
		answer = miles / gal;
		System.out.println("Your car averages " + answer + " MPG.");
		
		keyboard.close(); 
	}

}
