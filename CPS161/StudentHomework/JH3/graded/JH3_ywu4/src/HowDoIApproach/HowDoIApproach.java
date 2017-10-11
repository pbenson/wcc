package HowDoIApproach;

import java.util.Scanner;

public class HowDoIApproach {

	public static void main(String[] args) {
		
		System.out.println ("Enter the angle for Sine calculation: ");
		Scanner keyboard= new Scanner (System.in);
		double angle_degrees=keyboard.nextDouble();
		//conversion
		double angle_radians= angle_degrees* Math.PI/180.0; 
		
		//first iteration of algorithm: n=1
		int n=1;
		int sign=1; //1=positive, -1 = negative
		double nfactorial=1; //1!=1
		double xPower= angle_radians; //x1=x
		double guess = angle_radians; //the current guess is simply x
		double delta=1000; //initial value doesn't matter
		
		while(delta >= 0.00000001) 
		{
			n+=2;
			xPower = xPower * angle_radians * angle_radians; 
			nfactorial= nfactorial*n*(n-1);
			sign=-sign;
			double next_term=sign*xPower /nfactorial; 
			
			double next_guess= guess+ next_term; 
			delta = guess - next_guess; 
			
			if (delta<0)
				delta = -delta; 
			
			guess = next_guess; 
			
		}
		System.out.println("N=" + n + " guess="+ guess + " delta="+ delta);
		System.out.println("***************Done****************");
	}
		


							}


