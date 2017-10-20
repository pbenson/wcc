package newton_sqrt;
import java.util.Scanner;

public class Newton {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		double guess = number/2;
		double sqrt = Math.sqrt(number);
		double delta=1;
		
		while (Math.abs(delta)> .000001) {
			double new_guess = ((number/guess) + guess)/2;
			
			delta = guess - new_guess;
			guess = new_guess;
			
		
		}
		
		System.out.println("The Newton guess is " + guess);
		System.out.println("The calculated square root is " + sqrt);
		input.close();
		
		

	}

}
