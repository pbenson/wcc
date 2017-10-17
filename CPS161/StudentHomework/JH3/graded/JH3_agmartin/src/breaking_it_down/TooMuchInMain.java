package breaking_it_down;

import java.util.Scanner;

public class TooMuchInMain {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int operand1, operand2, answer;
		char operator='q';
		boolean keepCalculating = true;
		
		while (keepCalculating)
		{
			//*************************************************
			// This next block will get the user desired operator
			// getOperator should contain the following logic
			//*************************************************
			boolean operator_is_good=false; 
			
			do
			{
				System.out.print("Enter an Operator: +  -  *  /  q for quit: ");
				String strOperator = scan.nextLine();
				strOperator = strOperator.trim();
				if (strOperator.length() == 0)
					continue; // Need to try this again with no input
				operator = strOperator.charAt(0);
				operator_is_good=false;
				
				switch (operator)
				{
				case 'q':
				case '+':
				case '-':
				case '*':
				case '/':
					operator_is_good = true;
					break;
				default:
					System.out.println("Your operator is bad ... try again:");
					break;					
				}
			} while (!operator_is_good);
			
			//***********************************************
			// At this point operator contains a proper operator chosen by the user
			// This will show up in doCalculation
			//***********************************************
			if (operator == 'q')
			{
				keepCalculating=false; // not really needed because we are doing a break... but clarifies what will happen
				break;
			}
			
			//***********************************************
			// Now get operand 1
			// getOperand() will get the next hunk of logic
			//***********************************************
			int which =1;
			System.out.println("Enter operand "+which);
			String input;
			
			boolean operand_is_bad;
			
			do
			{
				operand_is_bad=false;
				
				input = scan.nextLine();
				input = input.trim();
				if (input.length() == 0)
					operand_is_bad=true;
				for (int i=0; i < input.length(); i++)
				{
					char c = input.charAt(i);
					if (c < '0' || c > '9')
					{
						// Oops, bad digit
						operand_is_bad=true;
						System.out.println("Your last input was bad, try again");
					}
				}
			} while (operand_is_bad);
			
			// The following statement will be covered later in the course.  
			// For now, just know that it converts a String to an integer
			// Note that Integer.parseInt is picky and blows up with any bad characters
			operand1 =  Integer.parseInt(input);
			
			
			//***********************************************
			// Now get operand 2
			// Note this code is mostly the same as the above code.  
			// You can just reuse the same getOperand method again
			//***********************************************
			which =2;
			System.out.println("Enter operand "+which);
			do
			{
				operand_is_bad=false;
				
				input = scan.nextLine();
				input = input.trim();
				if (input.length() == 0)
					operand_is_bad=true;
				for (int i=0; i < input.length(); i++)
				{
					char c = input.charAt(i);
					if (c < '0' || c > '9')
					{
						// Oops, bad digit
						operand_is_bad=true;
						System.out.println("Your last input was bad, try again");
					}
				}
			} while (operand_is_bad);
			
			// The following statement will be covered later in the course.  
			// For now, just know that it converts a String to an integer
			// Note that Integer.parseInt is picky and blows up with any bad characters
			
			operand2 =  Integer.parseInt(input); 
			
			//***********************************************
			// Now we have operator, operand1, and operand2.
			// Time to calculate the answer
			// doArithmetic will take the following logic
			//***********************************************
			switch(operator)
			{
			case '+':
				answer = operand1 + operand2;
				break;
			case '-':
				answer = operand1 - operand2;
				break;
			case '*':
				answer = operand1 * operand2;
				break;
			case '/':
				answer = operand1 / operand2;
				break;
			default:
				System.out.println("We shouldn't get here in doArithmentic!!!!");
				answer = -1;
				break;
			}
			
			//***********************************************
			// Time to format the answer
			// the format routine will get the following statement
			//***********************************************
			System.out.println(operand1 + " "+ operator + " "+ operand2 + " = "+ answer);
			
			System.out.println("=======================");		   
		} // end of while (continue_calculating)
		
		System.out.println("Finished Calculations");
		scan.close();
	} // end of main


} // end of class TooMuchInMain