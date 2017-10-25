package roman_calculator;

import java.util.*;

public class RomanCalculator {
	// scan can now be used anywhere within this class
	Scanner scan = new Scanner(System.in);

	// This routine either returns false if the use wants to quit,
	// or it does one Roman Calculator calculation
	boolean doCalculation() {
		char operator = getOperator();

		// Call getOperator to get either - + * / or q.
		// If q is returned, we return a false.
		if (operator == 'q' || operator == 'Q')
			return false;

		// If the operator is + - * or / then call
		// getOperand(1) for the first operand and
		// call getOperand(2) for the second operand
		int operand1 = getOperand(1);
		while (operand1 == -1)
			operand1 = getOperand(1);
		
		
		int operand2 = getOperand(2);
		while (operand2 == -1)
			operand2 = getOperand(2);

		// call doArithmetic and print out the result using
		// convert_to_Roman to generate Roman Numeral output.
		int calculated = doArithmetic(operand1, operand2, operator);
		String result = convert_to_Roman(calculated);
		
		System.out.println("Answer = " + result);
		

		return true;
	}

	// This routine prompts the user with
	// Operator: + - * / q for quit
	// If none of these are entered, this routine complains and
	// prompts the user again. Otherwise the operator is returned.
	char getOperator() {
		char operator = 'A';
		boolean isNotCorrect = true;
		
		while (isNotCorrect) {
			System.out.print("Enter operator + - * / or q to quit: ");
			operator = scan.nextLine().charAt(0);
			
			switch (operator) {
				case 'q':
				case 'Q':
				case '+':
				case '-':
				case '*':
				case '/': isNotCorrect = false;
						  break;
						  
				default: System.out.println("Unrecognized operator, please try again.");
						 break;
			}
		}
		
		return operator;
	}

	// This routine prompts the user for either operand1 or operand2
	// depending on the value of which. This routine uppercases the
	// input and calls convert_from_Roman to create an integer.
	// If the input is invalid ( negative return from convert_from_Roman)
	// then complain and prompt the user again.
	int getOperand(int which) {
		System.out.print("Enter Operand " + which + ": ");
		String line = scan.nextLine();
		
		return convert_from_Roman(line);
	}

	// Routine to convert an integer to a Roman Numeral String.
	// When you do this routine, you might find it handy to
	// create a utility routine that looks like:
	// String addRomanDigit(String starting, int num, char digit)
	String convert_to_Roman(int value) {
		String s = "";
		
		for (int i = 0; i < 7; i++) {
			int num = 0;
			char digit = 'A';
			switch (i) {
				case 0: num = 1000;
						digit = 'M';
						break;
				case 1: num = 500;
						digit = 'D';
						break;
				case 2: num = 100;
						digit = 'C';
						break;
				case 3: num = 50;
						digit = 'L';
						break;
				case 4: num = 10;
						digit = 'X';
						break;
				case 5: num = 5;
						digit = 'V';
						break;
				case 6: num = 1;
						digit = 'I';
						break;
				default: num = 0;
						 digit = 'A';
						 break;
			}
			
			if (num == 0 || digit == 'A')
				continue;
			
			while (value >= num) {
				value -= num;
				s += String.valueOf(digit);
			}
		}
		
		return s;
	}
	
	// Convert Roman Numeral String to an integer. If the
	// Roman Numeral String is invalid, return -1.
	int convert_from_Roman(String value) {
		int num = 0;
		char[] charArr = value.toUpperCase().toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			switch (charArr[i]) {
				case 'I': num += 1;
						  break;
				case 'V': num += 5;
						  break;
				case 'X': num += 10;
						  break;
				case 'L': num += 50;
						  break;
				case 'C': num += 100;
						  break;
				case 'D': num += 500;
						  break;
				case 'M': num += 1000;
						  break;
				default: System.out.println("Unrecognized character at position: " + i);
						 num = -1;
						 break;
			}
			
			if (num == -1)
				break;
		}
		
		return num;
	}

	// Perform the arithmetic indicated by the operator (+ - * /)
	// and return answer
	int doArithmetic(int operand1, int operand2, char operator) {
		switch (operator) {
			case '+': return operand1 + operand2;
			case '-': return operand1 - operand2;
			case '*': return operand1 * operand2;
			case '/': return Math.round((float)operand1 / operand2);
			default: return 0;
		}
	}

	public static void main(String[] args) {
		RomanCalculator rc = new RomanCalculator();
		
		while (rc.doCalculation()) {
			System.out.println(); // blank line
		}
		System.out.println("Finished Roman Computations");
	}
}