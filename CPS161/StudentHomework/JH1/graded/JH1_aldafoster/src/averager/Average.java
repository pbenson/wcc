package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int num1 = keyboard.nextInt();
		System.out.println("Enter second integer: ");
		int num2 = keyboard.nextInt();
		System.out.println("Enter third integer: " );
		int num3 = keyboard.nextInt();
		int total = 3;
		int average;
		// +
		
		System.out.println("Your integers are: " + num1 + " " + num2 + " " + num3);
		
		average = (num1 + num2 + num3) / total;
		System.out.println("The average value of your three integers is: " + average);
		
				

	}

}
