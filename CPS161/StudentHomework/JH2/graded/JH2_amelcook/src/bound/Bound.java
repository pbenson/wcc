package bound;

import java.util.Scanner;

public class Bound {

	public static void main(String[] args) {
	
		int starting_number = 0;
		int step_size = 0;
		int upper_bound = 0; 
		int answer = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a whole number as your starting # ");
		starting_number = keyboard.nextInt();
		
		System.out.println("Enter a whole number as your step size ");
		step_size = keyboard.nextInt();
		
		System.out.println("Enter a whole number as your upper bound value: ");
		upper_bound = keyboard.nextInt();

		System.out.println("Starting #: " + starting_number + 
				" Step Size: " + step_size + " Upper Bound: " + upper_bound);
		
		
		/* If answer <= upper_bound, then value is true; 
		 * If answer > upper_bound, then value is false.
		 * Or,
		 * while answer <= upper_bound,  */
		if (answer <= upper_bound)
		{
	
		System.out.println("");
		
		answer = (starting_number + step_size);
		System.out.print(" " + answer);
		answer = (starting_number+2 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+3 * step_size);
		System.out.print(" " + answer); 
		answer = (starting_number+4 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+5 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+6 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+7 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+8 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+9 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+10 * step_size);
		System.out.print(" " + answer);
		
		System.out.println("");
		
		answer = (starting_number+11 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+12 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+13 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+14 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+15 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+16 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+17 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+18 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+19 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+20 * step_size);
		System.out.print(" " + answer);
		
		
		System.out.println();
		
		answer = (starting_number+21 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+22 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+23 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+24 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+25 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+26 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+27 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+28 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+29 * step_size);
		System.out.print(" " + answer);
		answer = (starting_number+30 * step_size);
		System.out.print(" " + answer); 
		}
		else if (answer > upper_bound){

			System.err.println("Stop.");
		
		keyboard.close(); 
		}
	}
}




	


