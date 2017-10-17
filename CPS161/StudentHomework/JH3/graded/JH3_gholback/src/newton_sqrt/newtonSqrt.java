package newton_sqrt;

import java.util.Scanner;

public class newtonSqrt {
	public static void main (String[] args) {

		absoluteValue Abv = new absoluteValue();

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 'N' for Newton");

		double N = keyboard.nextDouble();
				
		double accuracy = 1;
		double lastGuess = N/2;
		double newGuess = 1;

		while (accuracy >= 0.000001) {
			newGuess = ((N/lastGuess) + lastGuess)/2;
			accuracy = Abv.Abv(newGuess - lastGuess);
			lastGuess = newGuess;
		}
		
		System.out.println("Newton ("+ N + ") = " + newGuess);
		System.out.println("Math.sqrt = " + Math.sqrt(N));
		
		keyboard.close();
	}
}
