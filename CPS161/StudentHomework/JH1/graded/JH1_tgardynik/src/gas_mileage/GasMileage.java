package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter gallons of gas used:");
		num1 = keyboard.nextDouble();
		
		System.out.println("Enter miles traveled:");
		num2 = keyboard.nextDouble();
		
		answer = num2 / num1;
		
		System.out.println("Your mileage in miles per gallon = "+ answer);
		
		
		// TODO Auto-generated method stub

	}

}
