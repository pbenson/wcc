package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String s1 = "y";
		String s2 = "n";
		int x = 0;
		int y = 0;
		
		do
		{
			System.out.println("Enter in N: ");
			int num = keyboard.nextInt();
		
			int factorial = 1, i =1;
			
			do 
			{
				factorial = factorial * i;
				i++;
			} while (i <= num);
				
			System.out.println("Factorial is " + factorial);
					
			System.out.println("Do you want to continue? (y/n): ");
			String s3 = keyboard.next();
			
			if (s3.equalsIgnoreCase(s1))
				x += 0;
			if (s3.equalsIgnoreCase(s2)) {
				x += 1;
				System.out.print("Have a good day!");
			}
		} while (x == y);
	keyboard.close();
	}
}
