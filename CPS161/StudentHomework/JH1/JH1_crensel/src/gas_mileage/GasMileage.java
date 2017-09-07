package gas_mileage;

import java.util.Scanner;

public class GasMileage {
	
	public static void main(String[] args) {
		// Local variable declarations
		double milesDriven;
		double gasConsumed;
		double mpg;
		
		// Accept input and assign to local variables
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of miles you have driven: ");
        milesDriven = keyboard.nextDouble();
        System.out.print("\nEnter how many gallons of gas your car has consumed: ");
        gasConsumed = keyboard.nextDouble();
        
        // Miles-per-gallon calculation
        mpg = milesDriven / gasConsumed;
        System.out.printf("\nYour car gets approximately: %.2f miles per gallon of gas consumed.", mpg);
	}
	
}
