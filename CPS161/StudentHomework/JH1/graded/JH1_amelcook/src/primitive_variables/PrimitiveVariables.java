package primitive_variables;

import java.util.Scanner;

public class PrimitiveVariables {

	public static void main(String[] args) {
		double num1;	// variable to hold our first input
		double num2;	// variable to hold our second input
		double answer; // variable to hold our answer
		
		// Open up the keyboard for user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter value a:");
		num1 = keyboard.nextDouble();
		System.out.println("Enter value b:");
		num2 = keyboard.nextDouble();
		// + - * /   %
		
		answer = num1 + num2;	// simple variable arithmetic 
		System.out.println("The answer for addition = " + answer);
		
		answer = num1 * num2; 
		System.out.println("The answer for multiply = " + answer);
		
		answer = num1 / num2;
		System.out.println("The answer for divide = " + answer);
		
		answer = num1 % num2;
		System.out.println("The answer for remainder (%) = " +  answer);

		keyboard.close();
	}

}
