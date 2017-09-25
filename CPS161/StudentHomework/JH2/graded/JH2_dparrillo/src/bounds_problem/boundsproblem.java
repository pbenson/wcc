package bounds_problem;

import java.util.Scanner;

public class boundsproblem {

	public static void main(String[] args) {
		int starting_number;
		int step_size;
		int upper_bound;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Starting Number:");
		starting_number = keyboard.nextInt();
		
		System.out.println("Upper Bound:");
		upper_bound = keyboard.nextInt();
		
		System.out.println("Step Size:");
		step_size = keyboard.nextInt();
		
		System.out.println(starting_number);
		
		while (starting_number < upper_bound - step_size) {
			System.out.println(starting_number + step_size);
			starting_number = starting_number + step_size;
		}
	keyboard.close();
	}
}