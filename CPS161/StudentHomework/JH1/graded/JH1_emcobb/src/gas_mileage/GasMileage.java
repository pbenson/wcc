package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		
		double distanceTraveled;
		double gallonsUsed;
		double gasMileage;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter in your distance traveled (in miles): ");
		distanceTraveled = keyboard.nextDouble();
		
		System.out.println("Please enter in the gallons consumed by your vehicle: ");
		gallonsUsed = keyboard.nextDouble();
		
		System.out.println("Your mpg is " + (distanceTraveled / gallonsUsed));
		
		

	}

}
