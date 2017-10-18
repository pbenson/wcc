package newton_sqrt;

import java.util.Scanner;

public class NewtonSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in N for Newtons: ");
		double n = keyboard.nextDouble();
		
		double last_guess = n/2;
		double new_guess=last_guess;
		double accuracy=1;
		boolean continueLooping = true;

		
		while (continueLooping)
		{
			new_guess = ((n/last_guess)+last_guess)/2;

		//	if (last_guess >= 0)
			//	 absolute = last_guess;
				//else
				 //absolute = -last_guess;
			accuracy =  Math.abs(new_guess - last_guess);

			continueLooping = accuracy > .000001;
			last_guess = new_guess;
			
			
		}
		double root = Math.sqrt(n);
		System.out.println("Newton" + "("+n+")" + "=" + new_guess);

		System.out.println("Square root of " + n + "= " + root);
		keyboard.close();
}
}
