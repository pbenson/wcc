package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		int num_pennies;
		int num_nickels;
		int num_dimes;
		int num_quarters;
		int answer;
		
				
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of pennies in the jar:");
		num_pennies = keyboard.nextInt();
		
		System.out.println("Enter number of nickels in the jar:");
		num_nickels = keyboard.nextInt();
		
		System.out.println("Enter number of dimes in the jar:");
		num_dimes = keyboard.nextInt();
		
		System.out.println("Enter number of quarters in the jar");
		num_quarters = keyboard.nextInt();
		
		
		answer = (num_pennies * 1) + (num_nickels * 5) + (num_dimes * 10) + (num_quarters * 25);
				
		System.out.println("The jar contains: " + answer +" cents");
		
		// TODO Auto-generated method stub

	}

}
