package roman_calculator;
import java.util.*;
public class romanCalculator {
	Scanner scan = new Scanner(System.in);

	// This routine either returns false if the use wants to quit,
	// or it does one Roman Calculator calculation
	boolean doCalculation()
	{
		char operator ;

		operator = getOperator(); 

		if (operator == 'q') {
			return false;
		}
		else if (operator == '-'|| operator == '+' || operator == '*' || operator == '/'){
						
			int Operand1;
			Operand1 = getOperand(1);

			int Operand2;
			Operand2 = getOperand(2);

			int Arithmetic;
			Arithmetic = doArithmetic(Operand1, Operand2, operator);

			String ArithmeticRoman = convert_to_Roman(Arithmetic);
			System.out.println(ArithmeticRoman);
		}

		// Call getOperator to get either - + * / or q.
		// If q is returned, we return a false.

		// ************** FILL IN CODE

		// If the operator is + - * or / then call
		// getOperand(1) for the first operand and
		// call getOperand(2) for the second operand

		// ************** FILL IN CODE

		// call doArithmetic and print out the result using
		// convert_to_Roman to generate Roman Numeral output.


		return true;
	}

	// This routine prompts the user with
	// Operator: + - * / q for quit
	// If none of these are entered, this routine complains and
	// prompts the user again. Otherwise the operator is returned.
	char getOperator()
	{		
		// ************** FILL IN CODE
		System.out.print("Enter an Operator: + - * / q for quit: ");
		char operator='q';
		boolean operator_is_good=false;
		do
		{
			String strOperator = scan.nextLine();
			strOperator = strOperator.trim();
			if (strOperator.length() == 0)
				continue; // Need to try this again with no input
			operator = strOperator.charAt(0);
			operator_is_good=false;
			switch (operator) {
			case 'q':
				operator = 'q';
				operator_is_good = true;
				break;
			case '+':
				operator = '+';
				operator_is_good = true;
				break;
			case '-':
				operator = '-';
				operator_is_good = true;
				break;
			case '*':
				operator = '*';
				operator_is_good = true;
				break;
			case '/':
				operator = '/';
				operator_is_good = true;
				break;
			default:
				System.out.println("Your operator is bad ... try again:");
				break;
			}
		} while (!operator_is_good);

		return operator;
	}

	// This routine prompts the user for either operand1 or operand2
	// depending on the value of which. This routine uppercases the
	// input and calls convert_from_Roman to create an integer.
	// If the input is invalid ( negative return from convert_from_Roman)
	// then complain and prompt the user again.
	int getOperand(int which)
	{
		System.out.print("Enter Operand " + which + ":");
		
		String strOperator = scan.nextLine();
		strOperator = strOperator.trim();
		
		which = convert_from_Roman(strOperator);
				
		return which;

		// ************** FILL IN CODE
	}


	// Routine to convert an integer to a Roman Numeral String.
	// When you do this routine, you might find it handy to
	// create a utility routine that looks like:
	// String addRomanDigit(String starting, int num, char digit)
	String convert_to_Roman(int value)
	{
	
		String Roman = "";
		
		int M =  value / 1000;
		value = value % 1000;
		String M1 = String.join("", Collections.nCopies(M, "M"));
		
		int D =  value / 500;
		value = value % 500;
		String D1 = String.join("", Collections.nCopies(D, "D"));
		
		int C =  value / 100;
		value = value % 100;
		String C1 = String.join("", Collections.nCopies(C, "C"));
		
		int L =  value / 50;
		value = value % 50;
		String L1 = String.join("", Collections.nCopies(L, "L"));
		
		int X =  value / 10;
		value = value % 10;
		String X1 = String.join("", Collections.nCopies(X, "X"));
		
		int V =  value / 5;
		value = value % 5;
		String V1 = String.join("", Collections.nCopies(V, "V"));
		
		int I =  value / 1;
		value = value % 1;
		String I1 = String.join("", Collections.nCopies(I, "I"));
	
		Roman = (M1+D1+C1+L1+X1+V1+I1);
		
		return Roman;
		
	}
		// ************** FILL IN CODE



	// Convert Roman Numeral String to an integer. If the
	// Roman Numeral String is invalid, return -1.
	int convert_from_Roman(String value)
	{		
		int Total = 0; 
				
		boolean operand_is_bad;
		do {

			operand_is_bad=false;
			
			value = value.toUpperCase();
			value = value.trim();
			
			if (value.length() == 0)
				operand_is_bad=true;
			for (int i=0; i < value.length(); i++)
			{
				char c = value.charAt(i);
				
				switch (c) {
				case 'I': Total += 1;
					break;
				case 'V': Total += 5;
					break;
				case 'X': Total += 10;
					break;
				case 'L': Total += 50;
					break;
				case 'C': Total += 100;
					break;
				case 'D': Total += 500;
					break;
				case 'M': Total += 1000;
					break;
				
				default: 
					System.out.println("Your submission is not made of IVXLCDM");
					;
				}
			}
		} while (operand_is_bad);
				
		return Total;
		
		// ************** FILL IN CODE
	}

	// Perform the arithmetic indicated by the operator (+ - * /)
	// and return answer
	int doArithmetic(int operand1, int operand2, char operator)
	{
		
		int answer;
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
		return answer;
		// ************** FILL IN CODE
	}

	public static void main(String[] args) {
		romanCalculator rc = new romanCalculator();
		while (rc.doCalculation())
		{
			System.out.println(); // blank line
		}
		System.out.println("Finished Roman Computations");
	}
}

