package avrager;

import java.util.Scanner;

public class Avrage {

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double num1 = keyboard.nextDouble();
		System.out.println("Enter 2nd number");
		double num2 = keyboard.nextDouble();
		System.out.println("Enter 3rd number");		
		double num3 = keyboard.nextDouble();

		double total = (num1+num2+num3)/3;
		System.out.println("your average is " + total);
		
	}
	
	
}
