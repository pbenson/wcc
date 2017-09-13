package gas_mileage;

import java.util.Scanner;

public class Gas {

	public static void main(String[] args) {
		float gas_consumed;
		float distance;
		float miles_per_gallon;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of gallons consumed:");
		gas_consumed = keyboard.nextFloat();
		
		System.out.println("Enter distance travled:");
		distance = keyboard.nextFloat();
		
		miles_per_gallon = distance / gas_consumed; 
				
	
		System.out.println("The asnwer is "+ miles_per_gallon);


	}

}
