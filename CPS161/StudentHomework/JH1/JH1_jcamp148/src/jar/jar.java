package jar;

import java.util.Scanner;

public class jar {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int num4;
		int answer;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in the number of Quarters in the Jar:");
		num1 = keyboard.nextInt();
		System.out.println("Enter in the number of Dimes in the Jar:");
		num2 = keyboard.nextInt();
		System.out.println("Enter in the number of Nickels in the Jar:");
		num3 = keyboard.nextInt();
		System.out.println("Enter in the number of Pennies in the Jar:");
		num4 = keyboard.nextInt();

		answer = (num1 * 25) + (num2 * 10) + (num3 * 5) + num4;
		System.out.println("The jar contains " + answer + " cents.");
		
		keyboard.close();
		
	}

}
