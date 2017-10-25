package learningEnrichment;

import java.util.Scanner;

public class LearningEnrichment {

	public static void main(String[] args) {
		
		//asking for the angle and converting it to radians
		
		System.out.println("Enter the angle for Sine Calculation");
		Scanner keyboard = new Scanner(System.in);
		double angleDegrees = keyboard.nextDouble();
		double angleRadians = angleDegrees * Math.PI / 180.0;
		
		//setting variables
		
		int n = 1; 
		int sign = 1;
		double nfactorial = 1;
		double xPower = angleRadians;
		double guess = angleRadians;
		double delta = 1000;
		
		// creating the loop
		
		while(delta >= .00000001) {
			n+=2; //increment the "power"
			xPower = xPower * angleRadians * angleRadians;
			nfactorial = nfactorial * n * (n-1);
			sign = -sign;
			double nextTerm = sign * xPower / nfactorial;
			
			double nextGuess = guess + nextTerm;
			delta = guess - nextGuess;
			if (delta < 0)
				delta = - delta;
			guess = nextGuess;
			
			System.out.println("N =" + n + " guess = " + guess + " delta = "
					+ delta);
			
		}
		
		keyboard.close();
		
	}

}
