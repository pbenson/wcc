package Averager;

import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		int num1, num2, num3;
		double average1;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first integer number:");
		num1 = keyboard.nextInt();
		
		System.out.println("Enter second integer number:");
		num2 = keyboard.nextInt();
		
		System.out.println("Enter third integer number:");
		num3 = keyboard.nextInt();
		
		average1 = (num1 + num2 + num3) / 3.0;
				
		System.out.println("The input values are " + num1 + " , " + num2 + " , " + num3 + " , " + "The average of the three numbers is " + average1);
		
		
				

		
		


	}

}
