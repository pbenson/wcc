package edu.wccnet.pbenson;

import java.util.Scanner;

public class PrimitiveVariables {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter first number");
		double num1 = keyboard.nextDouble();
		System.out.println("Enter second number");
		double num2 = keyboard.nextDouble();

		double answer = num1 * num2;
		System.out.println("first * second = " + answer);

		answer = num1 / num2;
		System.out.println("first / second = " + answer);

		answer = num1 % num2;
		System.out.println("first % second = "+ answer);
		keyboard.close();

	}

}
