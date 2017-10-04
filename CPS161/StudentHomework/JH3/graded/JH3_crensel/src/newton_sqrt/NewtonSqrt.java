package newton_sqrt;

import java.util.Scanner;

public class NewtonSqrt {

	public static void main(String[] args) {
		// Initialization of local variables
		Scanner keyboard  = new Scanner(System.in);
		double n          = 0;
		double lastGuess  = 0;
		double accuracy   = 1000; // Arbitrary starting value
		
		// Poll user input
		System.out.print("Enter in N for Newton: ");
		n = keyboard.nextDouble();
		
		// First guess
		lastGuess = n / 2;
		
		// Newton Square Root Loop
		while (accuracy > .000001) {
			double newGuess = ((n / lastGuess) + lastGuess) / 2;
			accuracy = Math.abs(newGuess - lastGuess);
			lastGuess = newGuess;
		}
		
		// Print results
		System.out.println("Newton(" + n + ")=" + lastGuess);
		System.out.println("Math.sqrt=" + Math.sqrt(n));
		keyboard.close();
	}

}
