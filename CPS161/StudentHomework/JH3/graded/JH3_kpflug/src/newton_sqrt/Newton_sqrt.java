package newton_sqrt;

import java.util.Scanner;

public class Newton_sqrt {
	
	
	public static void main (String[] args) {
		System.out.println("Enter in N for Newton:");
		Scanner keyboard = new Scanner(System.in);
		
		double N_Newton = keyboard.nextDouble(); 
		
		double new_guess; 
		double last_guess= N_Newton/2; //first guess
		double accuracy = 1000;
		
		
		while (accuracy >= .000001)
			{ 
			new_guess = ((N_Newton/last_guess) + last_guess)/2;
			
			accuracy = Math.abs(new_guess - last_guess); 
			
			last_guess = new_guess; 
			
		System.out.println( "Newton (" + N_Newton + ") = " + last_guess );
	}
		
		System.out.println(("Math.sqrt = " + Math.sqrt(N_Newton)));
		
	}
}

