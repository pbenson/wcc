package gas_mileage;

import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
		double milesTraveled;
		double gallonsOfGas;
		double milesPerGallon;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What was the distance being traveled? (Miles)");
		milesTraveled = keyboard.nextDouble();
		
		System.out.println("How much gas was there? (Gallons)");
		gallonsOfGas = keyboard.nextDouble();
		
		milesPerGallon = milesTraveled / gallonsOfGas;
		
		System.out.println("The car traveled " + milesPerGallon + " miles for every gallon of gas (MPG)");
		
		keyboard.close();	
	}

}
