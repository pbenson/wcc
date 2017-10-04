package sine_calculator;

import java.util.Scanner;

public class SineCalculator {

	public static void main(String[] args) {
		// Initialization of local variables
		Scanner keyboard  = new Scanner(System.in);
		double angleDegrees;
		double angleRadians;
		int n             = 1;    // First iteration of n
		int sign          = 1;    // Flip sign back and forth to create Taylor series
		double nFactorial = 1;    // 1! = 1
		double xPower     = 0;
		double guess      = 0;
		double delta      = 1000; // Difference between guesses each iteration
		
		// Poll user input
		System.out.println("Enter the angle for Sine Calculator: ");
		angleDegrees = keyboard.nextDouble();
		angleRadians = angleDegrees * Math.PI / 180.0;
		
		// Setup first iteration
		xPower = angleRadians; // x^1 = x
		guess = angleRadians; // First guess
		
		// Taylor series loop
		while (delta >= .00000001) {
			n += 2;
			xPower = xPower * angleRadians * angleRadians;
			nFactorial = nFactorial * n * (n - 1);
			sign = -sign;
			double nextTerm = sign * xPower / nFactorial;
			
			double nextGuess = guess + nextTerm;
			delta = guess - nextGuess;
			if (delta < 0) {
				delta = -delta;
			}
			guess = nextGuess;
			System.out.println("N=" + n + " Guess=" + guess + " Delta=" + delta);
		}
		
		// Print result
		System.out.println("---------- Done ----------");
		System.out.println("My guess = " + guess + " Math.sin(angle)= " + Math.sin(angleRadians));
		keyboard.close();
	}

}
