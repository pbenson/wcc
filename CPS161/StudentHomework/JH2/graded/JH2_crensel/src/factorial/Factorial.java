package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Local variable declaration/initialization
		int nFactorial   = 0;
		String input     = "";
		Scanner keyboard = new Scanner(System.in);
		
		// Main outer while loop
		while (!input.equals("n")) {
			// Poll user input
			System.out.print("Enter in N: ");
			nFactorial = keyboard.nextInt();
			
			// Factorial for loop
			for (int i = nFactorial - 1; i >= 1; i--) {
				nFactorial *= i;
			}
			/* This can also be done with a while loop like so:
			int i = nFactorial - 1;
			while (i >= 1) {
				nFactorial *= i;
				i--;
			}
			*/
			// Print out factorial and poll for user input
			System.out.printf("Factorial = %d\n", nFactorial);
			System.out.print("Do you want to continue? (y/n): ");
			input = keyboard.next();
			System.out.println();
		}
		System.out.println("Have a good day");
		keyboard.close();
	}

}
