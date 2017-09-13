package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double gasConsumed ;
	double distance ;
	double mpg ;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter number of gallons of gas consumed by the car: ");
	gasConsumed = keyboard.nextDouble();
	
	System.out.println("Enter the distance traveled: ");
	distance = keyboard.nextDouble();
	
	mpg = distance / gasConsumed ;
	
	System.out.println("The miles per gallon is: " + mpg);
	}

}
