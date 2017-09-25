package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		int number;
		int count = 1;
		String s1 = "y";
		
		Scanner keyboard = new Scanner(System.in);
		
	while(!s1.equals("n")) {
		System.out.println("Enter an N:");
		number = keyboard.nextInt();
		count = 1;
		factorial = 1;
		while(count <= number) {
			factorial = factorial * count;
			count = count + 1;
		}
		System.out.println("Factorial = "+factorial);
		System.out.println("Would you like to continue? (y/n)");
		s1 = keyboard.next();
	}
	keyboard.close();
	System.out.println("Have a nice day!");
	}
}
