package roman_calculator;

import java.util.*;

public class RomanCalculator {
	// scan can now be used anywhere within this class
	private Scanner scan = new Scanner(System.in);
	// This routine either returns false if the user wants to quit,

	// or it does one Roman Calculator calculation
	private boolean doCalculation() {
		// Call getOperator to get either -+ * / or q.
		// If q is returned, we return a false.
		// ************** FILL IN CODE
		// If the operator is + -* or / then call
		// getOperand(1) for the first operand and
		// call getOperand(2) for the second operand
		// ************** FILL INCODE
		// call doArithmetic and print out the result using
		// convert_to_Roman to generate Roman Numeral output.
		int operand1, operand2, answer;
		char operator = getOperator();
		if (operator == 'q')
			return false;
		operand1 = getOperand(1);
		operand2 = getOperand(2);
		answer = doArithmetic(operand1, operand2, operator);
		System.out.printf("Answer = %s", convertToRoman(answer));
		return true;
	}
	
	// This routine prompts the user with
	// Operator: +-*/q for quit

	// If none of these are entered, this routine complains and
	// prompts the user again. Otherwise the operator is returned.
	private char getOperator() {
		// ************** FILL IN CODE
		char operator = 'q';
		boolean isGood = false;
		while (!isGood) {
			System.out.print("Operator: + - * / q for quit: ");
			String strOperator = scan.nextLine();
			strOperator = strOperator.trim();
			if (strOperator.length() == 0)
				continue;
			operator = strOperator.charAt(0);
			
			switch (operator) {
			case 'q': case '+': case '-': case '*': case '/':
				isGood = true;
				break;
			default:
				System.out.println("Invalid operator, try again.");
				break;
			}
		}
		return operator;
	}

	// This routine prompts the user for either operand1 or operand2
	// depending on the value of which. This routine upper cases the
	// input and calls convert_from_Roman to create an integer.
	// If the input is invalid ( negative return from convert_from_Roman)

	// then complain and prompt the user again.
	private int getOperand(int which) {
		// ************** FILL IN CODE
		boolean isGood = false;
		String input  = "";
		
		while (!isGood) {
			isGood = true;
			System.out.print("Enter operand" + which + ": ");			
			input = scan.nextLine();
			input = input.trim();
			input = input.toUpperCase();
			
			if (input.length() == 0)
				isGood = false;
			for (int i = 0; i < input.length(); i++) {
				char rn = input.charAt(i);
				if (rn != 'I' && rn != 'V' && rn != 'X' && rn != 'L' && rn != 'C' && rn != 'D' && rn != 'M') {
					isGood = false;
					System.out.println(input + " has a bad character at position: " + i);
				}
			}
			if (isGood != false && convertFromRoman(input) == -1)
				isGood = false;
		}
		return convertFromRoman(input);
	}

	// Routine to convert an integer to a Roman Numeral String.
	// When you do this routine, you might find it handy to
	// create a utility routine that looks like: 
	// String addRomanDigit(String starting, int num, char digit)
	private String convertToRoman(int value) {
		// ************** FILL IN CODE
		String roman = "";
		int valueLeft = value;
		
		roman = addRomanDigit(roman, valueLeft / 1000, 'M');
		valueLeft -= 1000 * (valueLeft / 1000);
		
		roman = addRomanDigit(roman, valueLeft / 500, 'D');
		valueLeft -= 500 * (valueLeft / 500);
		
		roman = addRomanDigit(roman, valueLeft / 100, 'C');
		valueLeft -= 100 * (valueLeft / 100);
		
		roman = addRomanDigit(roman, valueLeft / 50, 'L');
		valueLeft -= 50 * (valueLeft / 50);
		
		roman = addRomanDigit(roman, valueLeft / 10, 'X');
		valueLeft -= 10 * (valueLeft / 10);
		
		roman = addRomanDigit(roman, valueLeft / 5, 'V');
		valueLeft -= 5 * (valueLeft / 5);

		roman = addRomanDigit(roman, valueLeft / 1, 'I');
		valueLeft -= 1 * (valueLeft / 1);
		
		return roman;
	}
	
	private String addRomanDigit(String start, int num, char digit) {
		String s = start;
		for (int i = 0; i < num; i++) {
			s += digit;
		}
		return s;
	}
	
	// Convert Roman Numeral String to an integer. If the
	// Roman Numeral String is invalid, return-1.

	private int convertFromRoman(String value) {
		// ************** FILL IN CODE
		int numeric = 0;
		for (int i = 0; i < value.length(); i++) {
			switch (value.charAt(i)) {
			case 'I':
				numeric++;
				break;
			case 'V':
				numeric += 5;
				break;
			case 'X':
				numeric += 10;
				break;
			case 'L':
				numeric += 50;
				break;
			case 'C':
				numeric += 100;
				break;
			case 'D':
				numeric += 500;
				break;
			case 'M':
				numeric += 1000;
				break;
			default:
				System.out.println("Something went wrong when converting from Roman.");
				return -1;
			}
		}
		return numeric;
	}

	// Perform the arithmetic indicated by the operator (+-*/)

	// and return answer
	private int doArithmetic(int operand1, int operand2, char operator) {
		// ************** FILL IN CODE
		int answer;
		switch (operator) {
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
			System.out.println("Program Error: Invalid Operator Specified: " + operator);
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
