package factorial;

import java.util.Scanner;

public class Factorial {

	public static double getFactorial(double number)
	{
		double  var = 0;
		var = number;
		for(double x = number-1; x > 0;x--){
			var *= x;
		}
		return var;
	}
	
	public static void main(String[] args) {

		double N;
		double answer;
		char y;
	
			
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("The factorial Function is:" + " Factorial(N)= N * (N-1) * (N-2)... * 1");		
		
		System.out.println("Input a number for N");
		N = keyboard.nextDouble();
		answer = getFactorial(N);
		System.out.println("Factorial = " + answer);
		
		System.out.println("Do you want to continue? (y/n)");
		y = keyboard.next().charAt(0);
		
		while (y == 'y') {
			System.out.println("Input a number for N");
			N = keyboard.nextDouble();
			answer = getFactorial(N);
			System.out.println("Factorial = " + answer);
			
			System.out.println("Do you want to continue? (y/n)");
			y = keyboard.next().charAt(0);
		
			}
		
	
		keyboard.close();
		System.out.println("Have a good day.");
		
	}

}


