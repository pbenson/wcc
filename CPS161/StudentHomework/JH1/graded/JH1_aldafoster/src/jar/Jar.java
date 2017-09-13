package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in the number of Quarters in the Jar: ");
		int Quarters = keyboard.nextInt();
		System.out.println("Enter in the number of Dimes in the Jar: ");
		int Dimes = keyboard.nextInt();
		System.out.println("Enter in the number of Nickels in the Jar: ");
		int Nickels = keyboard.nextInt();
		System.out.println("Enter in the number of Pennies in the Jar: ");
		int Pennies = keyboard.nextInt();
		int answer;
		// + *
		
		answer = Quarters*25 + Dimes*10 + Nickels*5 + Pennies;
		System.out.println("The jar contains " + answer + " cents.");
		
		

	}

}
