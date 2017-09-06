package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {

	int miles;
	double gallons;
	double mpg;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("How many miles were traveled?");
	miles = keyboard.nextInt();
			
	System.out.println("How many gallons were consumed?");
	gallons = keyboard.nextDouble();
	
	mpg = miles / gallons;
	System.out.println("Miles per gallon is " + mpg);
	
	}

}
