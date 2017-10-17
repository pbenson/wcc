package newton_sqrt;

import java.util.Scanner;

public class Newton_Sqrt {

	public static void main(String[] args) {
		
		double n;
		double last_guess;
		double new_guess;
		double difference;
		double absolute_value_of_x;
		boolean run = true;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("To Calculate a Square Root Using Newton's Method, Enter in N:");
		n = keyboard.nextDouble();
		
		last_guess = n/2; // initial guess is only correct for 4
		
		while(run)
		{
			new_guess = ((n/last_guess) + last_guess)/2; 
			
			difference = (new_guess - last_guess);
			
				if (difference >= 0)
					absolute_value_of_x = difference;
				else
					absolute_value_of_x = -difference;
				
				if (absolute_value_of_x < .000001)
				{	
					run = false;
					System.out.println("Newton's Method (" + n + ") = " + last_guess);
					System.out.println("Accuracy = " + absolute_value_of_x);
				}
				else
				{ 	run = true;
					last_guess = new_guess;
				}
		}
		
		System.out.println("Math.sqrt (" + n + ")" +  "= " + Math.sqrt(n));
		keyboard.close(); 
		}
		
	

	}
