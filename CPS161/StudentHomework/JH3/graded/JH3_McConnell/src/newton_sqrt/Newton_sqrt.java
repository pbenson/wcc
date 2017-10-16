package newton_sqrt;
import java.util.Scanner;

public class Newton_sqrt {

	double accuracy(double n, double guess){
		double guess_squared = guess* guess;
		double accuracy = guess_squared - n;
		if (accuracy <= 0)
			accuracy = -accuracy;
		return accuracy;}
	double find_square (double n){
		double guess = n/2;

		while (accuracy(n, guess) > .00000001){ 

			guess = ((n/guess) + guess)/2;	
		}

		return guess;}
	public static void main(String[] args)
	{
		System.out.print("Enter in N for Newton:");
		Scanner keyboard = new Scanner(System.in);	
		double n = keyboard.nextDouble();
		Newton_sqrt  x = new Newton_sqrt();
		double final_newton = x.find_square(n);
		System.out.println("Newton ("+ n +"): "+ final_newton);
		System.out.println("Math.sqr: " + Math.sqrt(n));
		keyboard.close();
	}
}


