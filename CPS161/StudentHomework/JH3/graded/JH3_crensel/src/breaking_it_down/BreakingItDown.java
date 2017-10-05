package breaking_it_down;

import java.util.Scanner;

public class BreakingItDown {
	// instance variable
	private Scanner scan = new Scanner(System.in);

	// Top Level routine for doing a single calculation
	private boolean doCalculation() {
		int operand1, operand2, answer;
		char operator = getOperator();
		if (operator == 'q')
			return false;
		operand1 = getOperand(1);
		operand2 = getOperand(2);
		answer = doArithmetic(operator, operand1, operand2);
		format(operator, operand1, operand2, answer);
		return true;
	}

	// Get the Operator reliably
	private char getOperator() {
		char operator = 'q';
		// ***********************************
		// Logic to get a correct operator from the user goes here
		// ***********************************
		boolean isGood = false;
		while (!isGood) {
			System.out.print("Enter an Operator: + - * / q for quit: ");
			String strOperator = scan.nextLine();
			strOperator = strOperator.trim();
			if (strOperator.length() == 0)
				continue;
			operator = strOperator.charAt(0);

			switch (operator) {
			case 'q':
			case '+':
			case '-':
			case '*':
			case '/':
				isGood = true;
				break;
			default:
				System.out.println("Invalid operator, try again.");
				break;
			}
		}
		return operator;
	}

	// Get one operand reliably
	private int getOperand(int which) {
		// ***********************************
		// Logic to get a correct operand from the user goes here.
		// Hint: collect the users operand into the "input" variable
		// Remove excess whitespace (trim call). Make sure all characters are
		// digits (i.e. between '0' and '9'). If not, then ask the user for
		// another input. Once you have a good "input" string, the statement
		// below will convert it to an integer.
		// ************************************
		// The following statement will be covered later in the course.
		// For now, just know that it converts a String to an integer
		// Note that Integer.parseInt is picky and blows up with any bad characters
		// ***********************************
		boolean isGood = false;
		String input = "";
		while (!isGood) {
			isGood = true;
			System.out.println("Enter operand " + which);
			input = scan.nextLine();
			input = input.trim();

			if (input.length() == 0)
				isGood = false;
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c < '0' || c > '9') {
					isGood = false;
					System.out.println("Your last inupt was bad, try again.");
				}
			}
		}
		return Integer.parseInt(input);
	}

	// Do the Actual Calculation required
	private int doArithmetic(char operator, int operand1, int operand2) {
		int answer;
		// ***********************************
		// Your logic to compute the answer
		// ***********************************
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

	// Format the final results
	private void format(char operator, int operand1, int operand2, int answer) {
		// ***********************************
		// Your logic to format the result. For example:
		// 23 * 45 = 1035
		// ***********************************
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + answer);
	}

	// We like to keep minimal code in main
	public static void main(String[] args) {
		// Construct our class
		BreakingItDown bid = new BreakingItDown();
		// Call doCalculation for each calculation we are doing.
		while (bid.doCalculation()) {
			System.out.println("=======================");
		} // end of while (continue_calculating)
		System.out.println("Finished Calculations");
	}
}