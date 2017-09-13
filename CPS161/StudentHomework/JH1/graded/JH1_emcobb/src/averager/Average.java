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
		System.out.println("Please enter in the first number: ");
		num1 = keyboard.nextInt();
		
		System.out.println("Please enter in the second number: ");
		num2 = keyboard.nextInt();
		
		System.out.println("Please enter in the third number: ");
		num3 = keyboard.nextInt();
		
		System.out.println("The three numbers you entered were: " + num1 + ", " + num2 + ", and " + num3);
		System.out.println("The average of those three numbers is: " + (num1 + num2 + num3)/3 );
		
	}

}
