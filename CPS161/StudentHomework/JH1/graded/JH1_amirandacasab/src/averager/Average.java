package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Enter second number:");
		double num2 = keyboard.nextDouble();
		
		System.out.println("Enter third number:");
		double num3 = keyboard.nextDouble();
		
		keyboard.close();
		
		double answer = (num1 + num2 + num3)/3;
		
		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " = " + answer);
	}

}
