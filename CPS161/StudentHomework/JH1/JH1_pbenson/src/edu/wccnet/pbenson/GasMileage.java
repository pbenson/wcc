package edu.wccnet.pbenson;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How many miles were traveled?");
		int miles = keyboard.nextInt();

		System.out.println("How many gallons were consumed?");
		double gallons = keyboard.nextDouble();

		double mpg = miles / gallons;
		System.out.println("Miles per gallon is " + mpg);
		keyboard.close();
	}

}
