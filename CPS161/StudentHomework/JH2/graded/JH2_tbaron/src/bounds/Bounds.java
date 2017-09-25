package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int starting_number;
		System.out.println("Entert Starting Number:");
		starting_number = keyboard.nextInt();
		
		int upper_bound;
		System.out.println("Enter Upper Bound:");
		upper_bound = keyboard.nextInt();
		
		int step_size;
		System.out.println("Enter a Step Size:");
		step_size = keyboard.nextInt();
		
		System.out.println("Starting Number = " + starting_number);
		System.out.println("Upper Bound = " + upper_bound);
		System.out.println("Step Size = " + step_size);
		
		int count = 0;
		int x;
		for (x = starting_number; starting_number < upper_bound; starting_number = starting_number + step_size)
		{
		System.out.print(starting_number + " ");
		count += 1;
		if((count % 10) == 0)
			System.out.println();
		}
		
	}

}
