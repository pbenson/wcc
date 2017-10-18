package sine_calculator;

import java.util.Scanner;

public class SineCalculator {
	public static void main (String[] args) {

		System.out.println("Enter the angle for Sine Calculation");
		Scanner keyboard = new Scanner(System.in);

		double angleDeg = keyboard.nextDouble();
		double angleRad = angleDeg * Math.PI/ 180;

		int n = 1;
		int sign = 1;
		double nfactorial = 1;
		double xPower = angleRad;
		double guess = angleRad;
		double delta = 1000;

		while (delta >= .00000001) {

			n += 2;
			xPower = xPower * angleRad * angleRad;
			nfactorial = nfactorial * n * (n-1);
			sign = -sign;
			double next_term = sign * xPower / nfactorial ;

			double next_guess = guess + next_term;
			delta = guess - next_guess;
			if (delta < 0) 
				delta = -delta;
				guess = next_guess;
				System.out.println("N=" + n + " guess=" + guess + " delta=" + delta);
		} 
		System.out.println("***** DONE *****");
		System.out.println("My guess=" + guess + " Math.sin(angle)=" + Math.sin(angleRad));
		keyboard.close();
	}
	
}
