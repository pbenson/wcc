package newton_sqrt;

import java.util.Scanner;

public class NewtonMethod {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Find the Square Root using Newton's Method");
		System.out.println("Enter in N for Newton: ");
		double N = keyboard.nextDouble();
		double delta = 1;
		int x = 2; 
				
		
		while (delta < .000001); {
			double initial_guess = ((N/x) + x)/2;
			double new_guess = ((N/initial_guess) + initial_guess)/2;
			delta = new_guess - initial_guess;
			if (delta < 0)
				delta = -delta;
			
			System.out.println("Newton(" + N + ")=" + new_guess);
		}
		System.out.println("Math.sqrt =" + Math.sqrt(N));
	}
}
