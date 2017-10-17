package newton_sqrt;

import java.util.Scanner;

public class NewtonSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean keepCalculation = true;
		Scanner keyboard = new Scanner(System.in);
		// =================================================
		while(keepCalculation){
			
			double N;
			System.out.print("Enter in N for Newtons: ");
			N = keyboard.nextDouble();
			
			if (N < 0.0)
			{
				break;
			}
			
			double Guess = N/2;
			double NewGuess = 0.0;
			double accuracy;
			double sqrt;
			int count = 0;

			accuracy = Math.abs(NewGuess - Guess);
			
			//================================================
			while (accuracy >= .000001 && count <= 2000 ){

				NewGuess = ((N/Guess) + Guess)/2;
				accuracy = Math.abs(NewGuess - Guess);
				Guess = NewGuess;
				count++;
				
			}
			
			if(count > 2000)
			{
				System.out.println("Error: The calculation exceeds 2000 iteration. The calculated value may be wrong.");
			}
			//================================================
			System.out.println("Newton(" + N + ") = " + NewGuess);
			
			sqrt = Math.sqrt(N);
			System.out.println("Math.sqrt = " + sqrt);
			System.out.println("");
		}
		keyboard.close();


	}

}
