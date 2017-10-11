//did this version on my own
package BreakingItDown;
import java.util.Scanner;
public class BreakingItDown_practice {
	// instance variable
	Scanner scan = new Scanner(System.in);
	// Top Level routine for doing a single calculation boolean doCalculation()
	
	// Get the Operator reliably
	public char getOperator()
	{
		//System.out.println("Enter an Operator: +  -  *  /  q for quit:");
		char operator='q';
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
         
		
		
		
		
		
		// ***********************************
		// Logic to get a correct operator from the user goes here
		// ***********************************
		return operator;
	}
	// Get one operand reliably
	int getOperand(int which)
	{
		System.out.println("Enter operand "+which); 
		String input;
		boolean isNumber=true;
		input=scan.next();
		for(int i=0;i<input.length();i++)
		{
			char c = input.charAt(i);
            if (c < '0' || c > '9')
            {
                // Oops, bad digit
                isNumber=false;
                System.out.println("Your last input was bad, try again");
            }
		}
		if(isNumber==false)
		{
			do
			{
				isNumber=true;
				System.out.println("Enter operand "+which); 
				input=scan.next();
				for(int i=0;i<input.length();i++)
				{
					char c = input.charAt(i);
					if (c < '0' || c > '9')
					{
	                // Oops, bad digit
						isNumber=false;
						System.out.println("Your last input was bad, try again");
					}
				}
			}while(isNumber==false);
		}
		
		// ***********************************
		// Logic to get a correct operand from the user goes here.
		// Hint: collect the users operand into the "input" variable
		// Remove excess whitespace (trim call). Make sure all characters are
		// digits (i.e. between '0' and '9'). If not, then ask the user for
		// another input. Once you have a good "input" string, the statement // below will convert it to an integer.
		// ************************************
		// The following statement will be covered later in the course.
		// For now, just know that it converts a String to an integer
		// Note that Integer.parseInt is picky and blows up with any bad
		//characters
		// ***********************************
		return Integer.parseInt(input);
	}
	// Do the Actual Calculation required
	public int doArithmetic(char operator, int operand1, int operand2) {
		int answer=0;
		if(operator=='+')
		{
			answer=operand1+operand2;
		}
		else if(operator=='-')
		{
			answer=operand1-operand2;
		}
		else if(operator=='*')
		{
			answer=operand1*operand2;
		}
		else if(operator=='/')
		{
			answer=operand1/operand2;
		}
		// *********************************** // Your logic to compute the answer
		return answer;
	}
	// Format the final results
	public void format(char operator, int operand1, int operand2, int answer) {
		if(operator=='+')
		{
			System.out.println(operand1+"+"+operand2+"="+answer);
		}
		else if(operator=='-')
		{
			System.out.println(operand1+"-"+operand2+"="+answer);
		}
		else if(operator=='*')
		{
			System.out.println(operand1+"*"+operand2+"="+answer);
		}
		else if(operator=='/')
		{
			System.out.println(operand1+"/"+operand2+"="+answer);
		}
		// ***********************************
		// Your logic to format the result. For example: // 23 * 45 = 1035
		// ***********************************
	}
	// We like to keep minimal code in main
	public static void main(String[] args)
	{
		// Construct our class
		BreakingItDown_practice bid = new BreakingItDown_practice();
		// Call doCalculation for each calculation we are doing. while (bid.doCalculation())
		char operatorPass=' ';
		int operandOne=0;
		int operandTwo=0;
		int answerGetter=0;
		do
		{
			int operandCounter=1;
			operatorPass=bid.getOperator();
			if(operatorPass=='q')
			{
				break;
			}
			operandOne=bid.getOperand(operandCounter);
			operandCounter++;
			operandTwo=bid.getOperand(operandCounter);
			answerGetter=bid.doArithmetic(operatorPass, operandOne, operandTwo);
			bid.format(operatorPass, operandOne, operandTwo, answerGetter);
			System.out.println("======================="); 
		} while(operatorPass!='q');// end of while (continue_calculating)
		System.out.println("Finished Calculations"); 
	}
}