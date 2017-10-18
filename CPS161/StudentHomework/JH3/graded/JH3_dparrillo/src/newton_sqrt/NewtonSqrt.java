package newton_sqrt;

import java.util.Scanner;

public class NewtonSqrt {

	public static void main(String[] args) {
		System.out.println("Enter in N for Newton:");
		Scanner keyboard = new Scanner(System.in);
		double number = keyboard.nextDouble();
		double accuracy = 1;
		double new_guess = number / 2;
		double last_guess = new_guess;
		
		while(accuracy > .000001) {
			new_guess = (number / last_guess + last_guess) / 2;
			accuracy = new_guess - last_guess;
			accuracy = Math.abs(accuracy);
			last_guess = new_guess;
		}
		keyboard.close();
		System.out.println("Newton("+ number +")= "+ new_guess);
		System.out.println("Math.sqrt ="+Math.sqrt(number));
}
}
