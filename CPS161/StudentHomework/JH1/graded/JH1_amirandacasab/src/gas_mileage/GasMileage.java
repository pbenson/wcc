package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter distance traveled in miles:");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Enter gallons of gas consumed:");
		double num2 = keyboard.nextDouble();
		
		keyboard.close();
		
		double answer = num1 / num2;
		
		System.out.println("Your miles per gallon = " + answer);

	}

}
