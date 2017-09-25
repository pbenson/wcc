package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int factorial;
		char answer = 'y';
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter number: ");
		n = keyboard.nextInt();

	if (answer == 'y') {
		while (n == 1 ) {
		
			factorial = 1;
		
		System.out.println(factorial);
		
		System.out.println("Would you like to continue y/n? ");
		}
		while (n > 1) {
			factorial = n * (n-1);
			System.out.println(factorial);
		}
				
		System.out.println("Would you like to continue y/n? ");

	if (answer == 'n') {
		System.out.println("Have a Nice Day");
	}
}
}
}


