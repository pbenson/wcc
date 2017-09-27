package bounds;
import java.util.Scanner;
public class Bounds {

	public static void main(String[] args) {
		
		int starting_number;
		int upper_bound;
		int step_size;
		int count=0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		starting_number = keyboard.nextInt();
		System.out.println("Enter the upper bound: ");
		upper_bound = keyboard.nextInt();
		System.out.println("Enter the step size: ");
		step_size = keyboard.nextInt();
		
		System.out.println("The values inputted are:");
		System.out.print(starting_number + ", " + upper_bound + ", and " + step_size);
		System.out.println();
		System.out.println();
	
		
		while (starting_number <= upper_bound)
		{	
			System.out.print((starting_number += step_size) + " ");
			count ++;
			if ((count%10) == 0)
				System.out.println();
	
		}		
			
	}

}
