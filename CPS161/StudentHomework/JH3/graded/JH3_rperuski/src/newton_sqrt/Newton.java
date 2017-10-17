package newton_sqrt;
import java.util.Scanner;

public class Newton {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();
		
		double guess = number/2;
		double sqrt = Math.sqrt(number);
		double delta = guess - sqrt;
		
		while (delta> .000001) {
			double new_guess = ((number/guess) + guess)/2;
			
			guess = new_guess;
			delta = guess-sqrt;
		
		}
		
		System.out.println("The Newton guess is " + guess);
		System.out.println("The calculated square root is " + sqrt);
		input.close();
		
		

	}

}
