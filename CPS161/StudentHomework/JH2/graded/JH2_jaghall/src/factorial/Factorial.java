package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int output;
		int input;
		String answer;
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter in N:");
			input = keyboard.nextInt();
			output = compute(input);
			System.out.println("Factorial = " + output);
			
			System.out.println("Do you want to continue? (y/n):");
			answer = keyboard.next();
			
			switch (answer) {
			case "n":
				System.out.println("Have a good day");
				return;
				
			case "y":
				System.out.println("\n");
				break;

			default:
				throw new Error("Expected y or n");
			}
		}
	}
	
	private static int compute(int input) {
		int i = input - 1;
		int output = input;
		
		while (i > 0) {
			output = output * i;
			i--;
		}
		
		return output;
	}
}
