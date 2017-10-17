package SineCalculator;

import java.util.Scanner;

public class sineCalculator {

	public static void main(String[] args) {

		System.out.println("Enter the angle for Sine Calculation: ");
		Scanner keyboard = new Scanner(System.in);
		double angleDegrees = keyboard.nextDouble();
		double angleRadians = angleDegrees * Math.PI/ 180.0;
		
		//first iteration of algorithm: n=1
		int n = 1;
		int sign = 1;					//1 = positive, -1 = negative
		double nFactorial = 1;			//1! = 1
		double xPower = angleRadians;	//x^1 = x
		double guess = angleRadians;	//the current guess is simply x
		double delta = 1000;			//initial value doesn't matter
		
		while(delta >= .00000001) {
			n += 2;
			xPower = xPower * angleRadians * angleRadians;
			nFactorial = nFactorial * n * (n-1);
			sign = -sign;
			double nextTerm = sign * xPower / nFactorial;
			
			double nextGuess = guess + nextTerm;
			delta = guess - nextGuess;
			if (delta < 0)
				delta = - delta;
			guess = nextGuess;
			System.out.println("N= " + n + " guess= " + guess
					+ " delta = " + delta);
		}
		System.out.println("****** Done ******");
		System.out.println("My guess = " + guess + " Math.sin(angle)= "
				+ Math.sin(angleRadians));
		keyboard.close();
	}
	
}
		
		
		
		/* Steps
		 * 1.) Get Angle from User
		 * 2.) Convert angles from degrees to radians
		 * 3.) Track the current sign (+ or -) & switch it each time
		 * 4.) Calculate exponents infinitely
		 * 5.) Skip even numbes in both factorial and exponents
		 * 6.) Calculate factorials (n! = n*(n-1)*(n-2)...*1
		 * 7.) Determine when result is accurate enough
		 */
		
		/*
		double angelInDegrees = 0;
		double pi = 3.14;
		double sinAnswer1 = 0;
		double x = 0;
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Enter value in Degrees: ");
		for(double angleInRadians = (angelInDegrees*pi)/(180);
		{
				 angelInDegrees = keyboard.nextDouble();
 				System.out.println("The angle in Radians = " 
						 			+ angleInRadians);
				 sinAnswer1 = 
				 
				}
		keyboard.close();
	}
}
*/