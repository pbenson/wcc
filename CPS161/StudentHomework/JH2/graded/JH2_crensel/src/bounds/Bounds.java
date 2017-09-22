package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		// Local variable declaration/initialization
		int startNum     = 0;
		int upperBound   = 0;
		int stepSize     = 0;
		int numCounter   = 0;
		Scanner keyboard = new Scanner(System.in);
		
		// Poll user input
		System.out.print("Enter the starting number: ");
		startNum = keyboard.nextInt();
		System.out.print("\nEnter the upper bound: ");
		upperBound = keyboard.nextInt();
		System.out.print("\nEnter the step size: ");
		stepSize = keyboard.nextInt();
		System.out.println();
		
		// For loop through the given user parameters
		for (int i = startNum; i < upperBound; i += stepSize) {
			if (numCounter % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%d ", i);
			numCounter++;
		}
		
		keyboard.close();
	}

}
