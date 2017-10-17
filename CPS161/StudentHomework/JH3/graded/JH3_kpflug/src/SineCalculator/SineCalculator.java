package SineCalculator;

import java.util.Scanner;

public class SineCalculator {

	public static void main (String[] args) {
	System.out.println("Enter the angle for Sine Calculation:");
	Scanner keyboard = new Scanner (System.in);
	double angle_degrees = keyboard.nextDouble();
	double angle_radians = angle_degrees * Math.PI/180.0; 
	
	int n = 1;
	int sign = 1; 
	double nfactorial = 1; 
	double xPower = angle_radians; 
	double guess = angle_radians; 
	
	double delta = 1000; 
			
			while (delta >= .0000001) 
			{
				n += 2; 
				xPower = xPower * angle_radians * angle_radians; 
				nfactorial = nfactorial * n * (n-1); 
				sign = -sign; 
				double next_term = sign*xPower /nfactorial; 
				
				double next_guess = guess + next_term; 
				delta = guess-next_guess; 
				if (delta <0) 
					delta = - delta; 
					guess = next_guess;
					System.out.println(" N= " + n + " guess= " +guess + " delta= " + delta);
			}
			System.out.println("***** Done *****"); 
			System.out.println ("My guess = " + guess + " Math.sin(angle) =" + Math.sin(angle_radians));
	
} 
	
	
}

	
