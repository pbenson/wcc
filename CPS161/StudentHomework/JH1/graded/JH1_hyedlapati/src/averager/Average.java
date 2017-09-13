package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num1;
			int num2;
			int num3;
			int average;
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter integer #1: ");
			num1 = keyboard.nextInt();
			
			System.out.println("Enter integer #2: ");
			num2 = keyboard.nextInt();
			
			System.out.println("Enter integer #3: ");
			num3 = keyboard.nextInt();
			
			average = (num1 + num2 + num3)/3;
			
			System.out.println("The three numbers are: "+ num1 + num2 + num3);
			System.out.println("The average is: " + average);
	}

}
