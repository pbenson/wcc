package roman_calculator;
import java.util.*;
import util.Util;

public class RomanCalculator {
	// scan can now be used anywhere within this class
	Scanner scan = new Scanner(System.in);

	// This routine either returns false if the use wants to quit,
	// or it does one Roman Calculator calculation
	boolean doCalculation()
	{
		char operator = getOperator();
		if(operator == 'q') return false;

		int op1 = getOperand(1);
		int op2 = getOperand(2);
		int result = doArithmetic(op1, op2, operator);
		String output = Numerals.Roman.convertToNumerals(result);
		System.out.println("Result:          " + output);

		return true;
	}

	/** This routine prompts the user with
	 * Operator: + - * / q for quit
	 * If none of these are entered, this routine complains and
	 * prompts the user again. Otherwise the operator is returned.
	 */
	char getOperator()
	{
		char op = ' ';
		boolean validOperator = false;
		while(!validOperator)
		{
			op = Util.readChar(scan, "Enter an operator (+, -, *, /, or 'q' to quit): ");
			switch(op)
			{
			case 'q':
			case '+':
			case '-':
			case '/':
			case '*':
				validOperator = true;
				break;
			default:
				System.out.println("Invalid operator: " + op);
				break;
			}
		}
		return op;
	}

//	 This routine prompts the user for either operand1 or operand2
//	 depending on the value of which. This routine uppercases the
//	 input and calls convert_from_Roman to create an integer.
//	 If the input is invalid ( negative return from convert_from_Roman)
//	 then complain and prompt the user again.
	int getOperand(int which)
	{
		int operand = 0;
		do
		{
			if(operand < 0) System.out.println("Invalid character at position " + -(operand+1));
			System.out.print("Enter operand " + which + ": ");
			String input = scan.nextLine().toUpperCase().trim();
			operand = Numerals.Roman.convertFromNumerals(input);
		} while(operand < 0);
		return operand;
	}

	// Perform the arithmetic indicated by the operator (+ - * /)
	// and return answer
	int doArithmetic(int operand1, int operand2, char operator)
	{
		int value;
		switch(operator)
		{
		case '+':
			value = operand1 + operand2;
			break;
		case '-':
			value = operand1 - operand2;
			break;
		case '*':
			value = operand1 * operand2;
			break;
		case '/':
			value = operand1 / operand2;
			break;
		default:
			System.out.println("Invalid operator. You shouldn't see this ever.");
			value = -1;
		}
		return value;
	}

	public static void main(String[] args)
	{
		RomanCalculator rc = new RomanCalculator();
		while (rc.doCalculation())
		{
			System.out.println(); // blank line
		}
		System.out.println("Finished Roman Computations");
	}
}