package primitive_variables;

import java.util.Scanner;

public class PrimitiveVariables {

	public static void main(String[] args) {
		// Goal - change the int to doubles
		Double num1;
		Double num2;
		Double answer;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a first number");
		num1 = keyboard.nextDouble();
		System.out.println("Enter another number");
		num2 = keyboard.nextDouble();
		
		
		answer =  num1 * num2;
		System.out.println("The answer for multiply is " + answer);
		answer = num1 / num2;
		System.out.println("The answer for divide is " + answer);
		answer = num1 % num2;
		System.out.println("The answer for % is "+ answer);
		
		keyboard.close();
	}
}
