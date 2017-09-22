package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the starting integer?");
		int startingNumber = keyboard.nextInt();

		System.out.println("What is the upper bound integer?");
		int upperBound = keyboard.nextInt();
		
		System.out.println("What is the step size integer?");
		int stepSize = keyboard.nextInt();

		keyboard.close();
		
		int currentNumber = startingNumber;
		
		System.out.println("The sequence of integers with a starting number of " + startingNumber + 
							", an upper bound of " + upperBound + " and a step size of " + stepSize + " is:");
		
		int lineNumberCount = 1;
		
		while(currentNumber < upperBound) {
			
			if(lineNumberCount < 10) {
				System.out.print(currentNumber + " ");
				lineNumberCount++;
			}
			
			else {
					System.out.println(currentNumber + " ");
					lineNumberCount = 1;
			}
			
			currentNumber += stepSize;
				
		}			
		
	}

}
