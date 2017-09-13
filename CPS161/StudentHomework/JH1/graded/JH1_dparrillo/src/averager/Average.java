package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1 = keyboard.nextInt();
		

		System.out.println("Enter second number:");
		num2 = keyboard.nextInt();
		

		System.out.println("Enter third number:");
		num3 = keyboard.nextInt();
		
		average = (num1 + num2 + num3)/3;
		
		System.out.println("You entered the numbers: "+num1+", "+num2+", and "+num3+". These numbers when averaged together equal to: "+average);
	}

}
