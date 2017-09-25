package factorial;

import java.util.Scanner;

public class Factorial4 {

	public static void main(String[] args) {
		
		int N;
		boolean runFactorial = true;
		
		while(runFactorial = true)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter in N:");
			N = keyboard.nextInt();
			
			int n;
			int Calculate;
			int Factorial = 1;
			for (n = 1; n <= N; n++)
			{
				Factorial *= n;
			}
		
			Calculate = Factorial;
			System.out.println("Factorial = " + Factorial);
			
			
			String Answer;
			System.out.println("Do you want to continue?: y/n: ");
			Scanner Continue = new Scanner(System.in);
			Answer = Continue.next();
		
				if (Answer.equals("y"))	
				{
					runFactorial = true;
				}
				else
				{
					System.out.println("Have a good day!");
					break;
				}
		}	
		 
	}
}