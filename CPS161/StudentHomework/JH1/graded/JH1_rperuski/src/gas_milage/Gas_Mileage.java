package gas_milage;

import java.util.Scanner;

public class Gas_Mileage {
	
	
	
	public static void main(String[] args) {
		float miles;
		float gasAmount;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount of miles traveled: ");
		miles = keyboard.nextFloat();
		System.out.println("Enter gallons of gas used: ");
		gasAmount = keyboard.nextFloat();
		double mpg = miles/gasAmount;
		System.out.printf("Your average mpg is %.2f", mpg);
		

	}

}
