package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		double N;
		double answer;
		char y;
		char n;
		class input;
		
		
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("The factorial Function is:" 
		+ " Factorial(N)= N * (N-1) * (N-2) * 1");
		
		System.out.println("Input a number for N");
		N = keyboard.nextDouble();
		answer = (N*(N-1)*(N-2)*1);
		System.out.println("Factorial = " + answer);
		
		System.out.println("Do you want to continue? (y/n)");
		
		if ( char = y) {
			System.out.println("Input a number for N");
			N = keyboard.nextDouble();
			answer = (N*(N-1)*(N-2)*1);
			System.out.println("Factorial = " + answer);
			
			System.out.println("Do you want to continue? (y/n)");
			
		}
		else (char = n); {
			System.out.println("Have a good day.");
		}
		
	
		keyboard.close();
	}

}
