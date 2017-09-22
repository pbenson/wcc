package factoral;

import java.util.Scanner;

public class Factoral {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String continueAnswer = "y";

		while(continueAnswer.equals("y")) {
			
			System.out.print("Enter a positive integer N: ");
			int currentNumber = keyboard.nextInt();
			int factoralTotal = 1;
			
			while(currentNumber > 1) {
				factoralTotal *= currentNumber;
				currentNumber--;
			}

			if (currentNumber <0) {
				System.out.println("The number must be a positive integer.");
				System.out.print("Do you want to continue? (y/n): ");
				continueAnswer = keyboard.next();
				System.out.println();
			}
			
			else {		
				System.out.println("Factoral = " + factoralTotal);
				System.out.print("Do you want to continue? (y/n): ");
				continueAnswer = keyboard.next();
				System.out.println();
			}
		}		
	
		System.out.print("Have a good day.");
		keyboard.close();

	}

}

