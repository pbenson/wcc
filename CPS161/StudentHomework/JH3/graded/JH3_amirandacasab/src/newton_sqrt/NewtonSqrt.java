package newton_sqrt;

import java.util.Scanner;

public class NewtonSqrt {

	public static void main(String[] args) {
		System.out.println("Enter a number for Square Root Calculation:");
		Scanner keyboard = new Scanner(System.in);
		double N = keyboard.nextDouble();
		
		keyboard.close();
		
		double delta = 42;
		double guess = N / 2;
		
		while(delta >= 0.000001)
		{
			double new_guess = ((N/guess) + guess) / 2;
			
			delta = guess - new_guess;
			if (delta < 0)
				delta = -delta;
			guess = new_guess;
			
			System.out.println("Guess = " + guess + " Delta = " + delta);
		}
		System.out.println("My guess = " + guess + " vs. Math.sqrt(N) = " + Math.sqrt(N));
	}
}
