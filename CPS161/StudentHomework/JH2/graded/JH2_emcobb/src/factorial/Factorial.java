package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("Enter a N: ");
			int nFactorial = keyboard.nextInt();
			int total = nFactorial;
			
			while (nFactorial > 1) {
				total *= (nFactorial - 1);
				--nFactorial;
				 
			}
			
			System.out.println("Factorial: " + total);
			System.out.print("Would you like to continue? (y/n) ");
			char exit = keyboard.next().charAt(0);
				
				if (exit == 'n') {
					System.out.println();
					break;
				}
				else
					System.out.println();
					continue;
		}
		
		System.out.println("Thank you for your input!");
		
		keyboard.close();

	}

}
