import java.util.Scanner;
public class Bounds {
	public static void main(String[] args) {
		int starting_number; 
		int step_size; 
		int upper_bound; 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter starting number:");
		starting_number = keyboard.nextInt();
		System.out.println("Enter step size:");
		step_size = keyboard.nextInt();
		System.out.println("Enter upper bound:");
		upper_bound = keyboard.nextInt();
		keyboard.close();
		int output = (starting_number);

		int print = 0;
		while (output < upper_bound) {
			print++;
			if (print < 10) {
				System.out.print (output +" ");
			} else { 
				System.out.println (output);
				print =0;
			}
			output = (output + step_size);
		}

	}
}