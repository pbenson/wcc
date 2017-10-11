package sine_calculator;

import java.util.Scanner;

public class SineCalculatorDemo {

	public static void main(String[] args) {

		// declare the class instances 
		Scanner keyboard = new Scanner(System.in);
		SineCalculator currentCalculation = new SineCalculator(); //declaring variable 'guess' of type 'SineCalcuator' and initializing it

		//set the initial instance variables		
		System.out.println("Enter the angle for the Sine Calculation: ");
		currentCalculation.degreesEntered = keyboard.nextDouble(); // passing a number to the variable 'degreesEntered' in the 'guess instance of class"SineCalculator'

		keyboard.close();

		//execute the calculation	
		currentCalculation.processCalcuation();
	}
}
