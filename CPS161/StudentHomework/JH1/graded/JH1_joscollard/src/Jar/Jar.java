package Jar;
import java.util.Scanner;

public class Jar {
	
	public static void main(String[] args) {
		int pennies;
		int nickels;
		int dimes;
		int quarters;
		int answer;
		
		Scanner keyboard = new Scanner(System.in);
			
		System.out.println("Enter pennies: ");
		pennies = keyboard.nextInt();
		
		System.out.println("Enter nickels: ");
		nickels = keyboard.nextInt() * 5;
		
		System.out.println("Enter dimes: ");
		dimes = keyboard.nextInt() * 10 ;
		
		System.out.println("Enter quarters: ");
		quarters = keyboard.nextInt() * 25;
		
		answer = pennies + nickels + dimes + quarters;
		
		System.out.println("There is " + answer + " cents in the jar.");
		
		
	}

}
