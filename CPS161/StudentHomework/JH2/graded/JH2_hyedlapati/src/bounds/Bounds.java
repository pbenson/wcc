package bounds;

import java.util.Scanner;

public class Bounds {



	public static void main(String[] args) 
	{
		int startingNumber;
		int upperBound;
		int stepSize;
		int count= 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		startingNumber = keyboard.nextInt();
		
		System.out.println("Enter the upper bound:");
		upperBound = keyboard.nextInt();
		
		System.out.println("Enter the step size:");
		stepSize = keyboard.nextInt();
		
		
						
		while ( startingNumber < upperBound)
 {
        System.out.print(startingNumber + " ");

		count++;
	
		if ((count%10) == 0) {
        System.out.println();
	}
		startingNumber += stepSize; 
	}

			keyboard.close();
	}
}
