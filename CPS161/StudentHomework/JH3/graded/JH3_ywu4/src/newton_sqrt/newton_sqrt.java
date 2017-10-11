package newton_sqrt;

import java.util.Scanner;

public class newton_sqrt {

	public static void main(String[] args) {
		System.out.println ("Enter in N for Newton: ");
		Scanner keyboard= new Scanner (System.in);
		double N=keyboard.nextDouble();
		double lastGuess= N/2.0, newGuess=0;
		double accuracy=1000; 
		double actualSqrt=Math.sqrt(N); 
		
		double absoluteAccuracy=1000;
		
		while (absoluteAccuracy >=0.000001)
		{  
			newGuess=((N/lastGuess)+lastGuess)/2.0;
			accuracy=newGuess - lastGuess;  
			
			if (accuracy>=0)
				absoluteAccuracy= accuracy; 
			else 
				absoluteAccuracy= -accuracy; 

			lastGuess=newGuess;
			
		}
		System.out.println("Newton("+ N +") =" + newGuess );
			System.out.println("Math.sqrt="+ actualSqrt);
	}

}
