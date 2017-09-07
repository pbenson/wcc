package averager;

import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		// Local variable declarations
		int num1;
		int num2;
		int num3;
		int average;

		// Accept input and assign to local variables
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1 = keyboard.nextInt();
		System.out.print("\nEnter the second number: ");
		num2 = keyboard.nextInt();
		System.out.print("\nEnter the third number: ");
		num3 = keyboard.nextInt();

		// Print values and calculate average
		average = (num1 + num2 + num3) / 3;
		System.out.println("\nThe value of num1 is: " + num1);
		System.out.println("The value of num2 is: " + num2);
		System.out.println("The value of num3 is: " + num3);
		System.out.println("The average of these three numbers is: " + average);
	}

}
