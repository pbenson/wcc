package newton_sqrt;

import java.util.Scanner;

public class Newton_sqrt {

	public static void main(String[] args) {
		double last_guess;
		double new_guess;
		double n;
		double comparison;
		double x;
		double java_formula;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the value to calculate the square root ");
		 n = keyboard.nextDouble();
		 
		 last_guess = 1;
		 comparison = 1;
		 x = 0;
		 
		 while (comparison >= .000001)
		 {
			 new_guess = ((n/last_guess) + last_guess)/2;
			 
			 comparison = new_guess - last_guess;
			 if (comparison > 0)
			    comparison = comparison;
			 else 
				 comparison = -comparison; 
			
			 
			 last_guess = new_guess;
			 
			 if (x>1000)
				 break;
			 x = x + 1;
		 
		 }
		 
		 java_formula = Math.sqrt(n);
	
		 System.out.println(" The square root of " + n + " is " + last_guess + " . " );
		 
		 
		 System.out.println(" This was calculated in " + x + " interactions. ");
		 
		 System.out.println(" The Math Square root answer is " + java_formula);
		 
		
	

}
}