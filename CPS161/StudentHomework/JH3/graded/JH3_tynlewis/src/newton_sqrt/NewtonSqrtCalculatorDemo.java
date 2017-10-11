package newton_sqrt;

import java.util.Scanner;

public class NewtonSqrtCalculatorDemo {

	public static void main(String[] args) {

		//declare the class instances
		Scanner keyboard = new Scanner(System.in);
		NewtonSqrtCalculator sqrtCalculation = new NewtonSqrtCalculator();

		//set the initial instance variables
		System.out.print("Enter in N for Newton: ");
		sqrtCalculation.numberEntered = keyboard.nextDouble();

		keyboard.close();

		sqrtCalculation.executeCalculation();
	}
}
