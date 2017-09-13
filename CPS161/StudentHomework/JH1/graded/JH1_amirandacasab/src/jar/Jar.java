package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of quarters in the jar:");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Enter the number of dimes in the jar:");
		double num2 = keyboard.nextDouble();
		
		System.out.println("Enter the number of nickles in the jar:");
		double num3 = keyboard.nextDouble();
		
		System.out.println("Enter the number of pennies in the jar:");
		double num4 = keyboard.nextDouble();
		
		keyboard.close();
		
		double value = (num1 * 25) + (num2 * 10) + (num3 * 5) + num4;
				
		double answer = value / 100;
		
		System.out.println("The total value of coins in the jar is " + "$" + answer);
	}

}
