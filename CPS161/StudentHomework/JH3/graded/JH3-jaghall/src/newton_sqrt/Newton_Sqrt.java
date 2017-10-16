package newton_sqrt;

import java.util.Scanner;

public class Newton_Sqrt {

	public static void main(String[] args) {
		System.out.println("Enter in N for Newton:");
        Scanner keyboard = new Scanner(System.in);
        double N = keyboard.nextDouble();
        keyboard.close();
        
        double last_guess = N/2;
        double accuracy = 1; // could be anything over .000001
        double new_guess = 1; // could be anything
        
        while (accuracy > .000001) {
        		new_guess = makeGuess(N, last_guess);
        		accuracy = absoluteValue(new_guess - last_guess);
        		last_guess = new_guess;
        }
        
        printResult(N, new_guess);
	}
	
	public static double absoluteValue(double value) {
		if (value >= 0) {
			return value;
		}
		
		return -value;
	}
	
	public static double makeGuess(double N, double last_guess) {
		return ((N/last_guess) + last_guess)/2;
	}
	
	public static void printResult(double N, double final_guess) {
		System.out.println("Newton(" + N + ")=" + final_guess);
        System.out.println("Math.sqrt(" + N + ")=" + Math.sqrt(N));
	}
}
