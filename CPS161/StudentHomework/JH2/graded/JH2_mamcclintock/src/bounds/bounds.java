package bounds;

import java.util.Scanner;


public class bounds {
	
public static void main(String[] args) {
        
	// Create scanner and read in starting number, upper bound, and step size values
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the starting number:");
        int startNum;
        startNum = keyboard.nextInt();
        
        System.out.println("Please enter the upper bound:");
        int upperBound;
        upperBound = keyboard.nextInt();
        
        System.out.println("Please enter the step size:");
        int stepSize;
        stepSize = keyboard.nextInt();
        
        keyboard.close();
        
        // Print out numbers entered by user
        System.out.println("");
        System.out.println("You entered:");
        System.out.println("Starting Number: " + startNum);
        System.out.println("Step Size: " + stepSize);
        System.out.println("Upper Bound: " + upperBound);
        System.out.println("");
        
    // Using loop, print out sequence of numbers starting from startNum and increasing by stepSize until upperBound is reached
        int currentNumber = startNum;
        // Counter for how many numbers printed in each line
        int numPerLine = 0;
        while (currentNumber<upperBound){
        	System.out.print(currentNumber + " ");
        	numPerLine = numPerLine+1;
        	currentNumber=currentNumber+stepSize;
        	if (numPerLine>9){
        		System.out.print("\n");
        		numPerLine = 0;
        		}
        	}
        }
}
        
