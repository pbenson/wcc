package newton_sqrt;
import java.util.Scanner;

public class Newton_SquareRoot {
	
	static double applyNewtonMethod(double n) {
		
		double accuracy = 100;
		double last_guess = n;
		
		while (accuracy >= 0.000001) {
			double new_guess = ((n / last_guess) + last_guess) / 2;
			accuracy = Math.abs(new_guess - last_guess);
			
			last_guess = new_guess;
		}
		
		return last_guess;
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Number to square root: ");
		
		double n = keyboard.nextDouble();
		
		double result = applyNewtonMethod(n);
		
		System.out.printf("Using Newton method: " + result + "\nUsing Math.sqrt: " + Math.sqrt(n));
		
		keyboard.close();
	}
}
