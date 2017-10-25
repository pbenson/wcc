package roman_calculator;

//****************************************************************
//******* STARTING CODE **************************************
//****************************************************************
import java.util.*;

public class RomanCalculator {
	// scan can now be used anywhere within this class
	Scanner scan = new Scanner(System.in);

	// This routine either returns false if the use wants to quit,
	// or it does one Roman Calculator calculation
	boolean doCalculation() {
		char operator;

		// Call getOperator to get either - + * / or q.
		// If q is returned, we return a false.

		operator = getOperator();
		// ************** FILL IN CODE

		if (operator == 'q')
		{
			return false;
		}
		
		int operand1, operand2, answer;

		
		// If the operator is + - * or / then call
		// getOperand(1) for the first operand and
		// call getOperand(2) for the second operand
		operand1 = getOperand(1);
		operand2 = getOperand(2);

		
		// ************** FILL IN CODE

		// call doArithmetic and print out the result using
		// convert_to_Roman to generate Roman Numeral output.
		answer = doArithmetic(operand1, operand2, operator);
		System.out.println(String.format("Answer = %s", convert_to_Roman(answer)));
		
		
		
		return true;
	}

	// This routine prompts the user with
	// Operator: + - * / q for quit
	// If none of these are entered, this routine complains and
	// prompts the user again. Otherwise the operator is returned.
	char getOperator() {

		// ************** FILL IN CODE
		char operator='q';

		// ***********************************
		// Logic to get a correct operator from the user goes here
		// ***********************************
		boolean operator_is_good=false;

		do
		{
			System.out.print("Enter an Operator: + - * / q for quit: ");
			String strOperator = scan.nextLine();
			strOperator = strOperator.trim();
			if (strOperator.length() == 0)
			{
				System.out.println("There is no input. White space counts as non input... try again.");
				continue; // Need to try this again with no input
			}
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

		return operator;

	}

	// This routine prompts the user for either operand1 or operand2
	// depending on the value of which. This routine uppercases the
	// input and calls convert_from_Roman to create an integer.
	// If the input is invalid ( negative return from convert_from_Roman)
	// then complain and prompt the user again.
	int getOperand(int which) {

		// ************** FILL IN CODE
		String input;

		boolean operand_is_bad;
		int operand = -1;
		do
		{
			System.out.print("Enter operand " + which + ": ");
			operand_is_bad=false;
			input = scan.nextLine();		
			
			operand = convert_from_Roman(input);
			
			if(operand == -1)
			{
				operand_is_bad = true;
				System.out.println("Your input operand is bad... Please try again.");	
				
			}
			
		} while (operand_is_bad);

		
		return operand;
	}

	// Routine to convert an integer to a Roman Numeral String.
	// When you do this routine, you might find it handy to
	// create a utility routine that looks like:
	// String addRomanDigit(String starting, int num, char digit)
	String convert_to_Roman(int value) {

		// ************** FILL IN CODE
		String answer = "";
		
		if(value < 1)
		{
			System.out.println("Your input value is less than 1. Conversion to Roman fails.");
			return answer;
		}
		
		int num = 0;
		int divisor = 1000;
		int remainder = value;
		
		num = remainder/divisor;
		remainder = remainder % divisor;
		answer = addRomanDigit(answer, num, 'M');
		
		divisor = 500;
		num = remainder/divisor;
		remainder = remainder % divisor;
		answer = addRomanDigit(answer, num, 'D');

		divisor = 100;
		num = remainder/divisor;
		remainder = remainder % divisor;
		answer = addRomanDigit(answer, num, 'C');

		divisor = 50;
		num = remainder/divisor;
		remainder = remainder % divisor;
		answer = addRomanDigit(answer, num, 'L');
		
		divisor = 10;
		num = remainder/divisor;
		remainder = remainder % divisor;
		answer = addRomanDigit(answer, num, 'X');
		
		divisor = 5;
		num = remainder/divisor;
		remainder = remainder % divisor;
		answer = addRomanDigit(answer, num, 'V');
		
		answer = addRomanDigit(answer, remainder, 'I');

		
		return answer;
	}

	String addRomanDigit(String starting, int num, char digit)
	{
		if(num < 1)
		{
			return starting;
		}
		StringBuilder builder = new StringBuilder(starting);
		
		for (int i = 0; i < num; i++) {
	        builder.append(digit);
	    }
		return builder.toString();
		
	}
	
	// Convert Roman Numeral String to an integer. If the
	// Roman Numeral String is invalid, return -1.
	int convert_from_Roman(String value) {

		// ************** FILL IN CODE
		int answer = 0;
		
		String v = value.trim();
		
		if (v.length() == 0)
		{
			answer = -1;
			System.out.println("Coversion from Roman fails because white spaces cannot be counted as Roman character.");
			return answer;
		}
		
		answer = 0;
		v = v.toUpperCase();
		
		for (int i=0; i < v.length(); i++)
		{
			char c = v.charAt(i);
			switch (c)
			{
				case 'I':
					answer += 1;
					break;

				case 'V':
					answer += 5;
					break;
					
				case 'X':
					answer += 10;
					break;
					
				case 'L':
					answer += 50;
					break;

				case 'C':
					answer += 100;
					break;

				case 'D':
					answer += 500;
					break;

				case 'M':
					answer += 1000;
					break;
					
				default:
					answer = -1;
					System.out.println(String.format("%s has a bad character at position: %d", v, i));
					return answer;
			}

			
		}
		return answer;

		
	}

	// Perform the arithmetic indicated by the operator (+ - * /)
	// and return answer
	int doArithmetic(int operand1, int operand2, char operator) {

		// ************** FILL IN CODE
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
	}

	public static void main(String[] args) {
		RomanCalculator rc = new RomanCalculator();
		while (rc.doCalculation()) {
			System.out.println(); // blank line
		}
		System.out.println("Finished Roman Computations");
	}
}
