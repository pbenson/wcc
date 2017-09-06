package edu.wccnet.pbenson;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How many pennies are in the jar?");
		int pennies = keyboard.nextInt();

		System.out.println("How many nickels are in the jar?");
		int nickels = keyboard.nextInt();

		System.out.println("How many dimes are in the jar?");
		int dimes = keyboard.nextInt();

		System.out.println("How many quarters are in the jar?");
		int quarters = keyboard.nextInt();

		double value = (pennies * .01) + (nickels * .05) + (dimes * .1) + (quarters * .25);

		System.out.println("There is $" + value + " in the jar.");
		keyboard.close();
	}

}
