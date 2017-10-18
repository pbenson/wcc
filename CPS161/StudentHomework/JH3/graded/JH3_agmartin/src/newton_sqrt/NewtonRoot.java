package newton_sqrt;
import java.util.Scanner;

import util.Util;

public class NewtonRoot
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double number = Util.readDouble(scanner, "Enter a number to square root: ");
		System.out.println("NewtonRoot(" + number + ") = " + root(number));
		System.out.println("Math.sqrt(" + number + ")  = " + Math.sqrt(number) + "\n");
	}
	
	/**
	 * Calculates the square root of a number using Newton's method.
	 * 
	 * @param number The number to take the root of.
	 * @return The square root of n.
	 */
	public static double root(double number)
	{
		double accuracy = number;
		double lastGuess = number/2;
		double newGuess = lastGuess;
		while(accuracy >= .000001)
		{
			newGuess = (number/lastGuess + lastGuess)/2;
			accuracy = Math.abs(newGuess - lastGuess);
			lastGuess = newGuess;
		}
		return newGuess;
	}
}
