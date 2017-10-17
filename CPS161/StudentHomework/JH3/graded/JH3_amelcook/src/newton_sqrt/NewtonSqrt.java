package newton_sqrt;

import java.util.Scanner;

public class NewtonSqrt {

	public static void main(String[] args) {
		
		/* Computing a Square Root
		 * 1) Initial guess N/2
		 * 2) Compute better guess based on formula
		 * newGuess = ((N/lastGuess) + lastGuess)/2
		 * 3) Use while loop, continue execution 
		 * until the accuracy is <.000001
		 * 4) Accuracy of new guess shown as:
		 * accuracy = absoluteValue of (newGuess - lastGuess)
		 * 5) double x, absoluteValueOfX;
		 * ..... x gets a value somehow
		 * if (x >=0)
		 * 		absoluteValueOfX = x;
		 * 	else
		 * 		absoluteValueOfX = -x;
		 * 6) Print NewtonSqrt answer at the end of while loop
		 * 7) Compare it with the Java Math function Math.sqrt(N);
		 */
		
		//Sample output
		// Enter in N for Newton: 200
		// Newton(200.0) = 14.14....
		// Math.sqrt = 14.14...
		
		System.out.println("Enter in N for Newton: ");
		Scanner keyboard = new Scanner(System.in);
		double n = keyboard.nextDouble();
		double lastGuess = n/2;
		
		double newGuess = ((n/lastGuess) + lastGuess)/2;
		double accuracy = Math.abs(newGuess - lastGuess);
		System.out.println("Newton("+ n + ") = " + newGuess);
		System.out.println("Accuracy = " + accuracy);
		System.out.println("Math.sqrt = " + Math.sqrt(n));
		
		while(accuracy > .000001)
			newGuess = ((n/lastGuess) + lastGuess)/2;
			accuracy = Math.abs(newGuess - lastGuess);
			if(n >=0)		
				n = Math.abs(n);
			else 
				lastGuess = newGuess;
			
		System.out.println("Newton("+ n + ") = " + newGuess);
		System.out.println("Math.sqrt = " + Math.sqrt(n));
		
		keyboard.close();
	}
		
}
