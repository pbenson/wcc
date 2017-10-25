package newtonSquareRoot;

import java.util.Scanner;

public class NewtonSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ask for the number the user wants the square root of.
		
		System.out.println("Please enter the number you would like the square root of: ");
		Scanner keyboard = new Scanner(System.in);
		double startingNumber = keyboard.nextDouble();
		
		//setting variables
		
		double guess = 1;
		double accuracy = 10;
	
		
		while(accuracy >= .00001){
			
			double newGuess = ((startingNumber/guess) + guess)/2;
			accuracy = guess - newGuess;
			if (accuracy < 0)
				accuracy = -accuracy;
			guess = newGuess;
		}
		
		System.out.println("The square root of " + startingNumber + " is approximately " +
				guess + "\n");
				
		System.out.println("Using the Math class the square root is "+ Math.sqrt(startingNumber));
		keyboard.close();
		
	}

}
