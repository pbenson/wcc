package edu.wccnet.pbenson;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("First number?");
		int num1 = keyboard.nextInt();

		System.out.println("Second number?");
		int num2 = keyboard.nextInt();

		System.out.println("Third number?");
		int num3 = keyboard.nextInt();

		int answer = (num1 + num2 + num3) / 3;

		System.out.println("The average of {" + num1 + ", " + num2 + ", " + num3 + "} = " + answer + ".");
		keyboard.close();
	}

}
