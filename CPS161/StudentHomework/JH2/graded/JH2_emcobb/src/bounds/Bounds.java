package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		
		//prompting user for three numbers
		
		System.out.println("Please enter a starting number:");
		Scanner keyboard = new Scanner(System.in);
		int startingNumber = keyboard.nextInt();
		
		System.out.println("Please enter an upper bound number:");
		int upperBoundNumber = keyboard.nextInt();
		
		System.out.println("Please enter a step size:" );
		int stepSize = keyboard.nextInt();
		
		System.out.println("The numbers you gave were- Starting Number: "
				+ startingNumber + ", Upper Bound Number: " + upperBoundNumber
				+ ", and Step Size: " + stepSize);
		
		// printing the numbers plus new lines.
		
		int counter = 1;
		
		while (startingNumber < upperBoundNumber) {
			
			System.out.print(startingNumber + " ");
			startingNumber += stepSize;
			
			if (counter % 9 == 0)
				System.out.println(startingNumber);
			
			++counter;
			
		}
		
		keyboard.close();
		
	}
}