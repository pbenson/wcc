package factorial;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		// Initialize boolean to control while loop iteration
		boolean runAgain = true;
		
		// Initialize counter to control iterative multiplication
		int counter = 0;
		
		// Create scanner 
		Scanner keyboard = new Scanner(System.in);
				
		while (runAgain){
			System.out.println("Please enter a number:");
	        int number = keyboard.nextInt();
	        counter = number-1;
	        while (counter>0){
	        	number = number*counter;
	        	counter=counter-1;
	        }
	        
	        System.out.println("Factorial: " + number);
	        System.out.println("");
	        
	        // Gather user input to determine whether program should be run again
	        System.out.println("Would you like to enter another number? Please enter 'y' for yes or 'n' for no.");
	        String continueProgram = (keyboard.next());
	        System.out.println("");
	        while (!continueProgram.equals("y") && !continueProgram.equals("n")){
	        	System.out.println("Invalid entry! Would you like to enter another number? Please enter 'y' for yes or 'n' for no.");
	        	continueProgram = keyboard.next();
	        }
	        if (continueProgram.equals("n")){
	        	runAgain=false;
	        	System.out.println("Have a nice day!");
	        }
		}
		keyboard.close();
	}
}

