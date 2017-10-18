package breaking_it_down;

import java.util.Scanner;
import util.Util;

public class BreakingItDown {
	Scanner scan = new Scanner(System.in);

	boolean doCalculation() {
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
	char getOperator() {
		char operator = 'q';

		boolean operator_is_good = false;

		while (!operator_is_good) {
			System.out.print("Enter an Operator: +  -  *  /  q for quit: ");
			String strOperator;
			do {
				strOperator = scan.nextLine();
			} while (strOperator.length() == 0);

			strOperator = strOperator.trim();
			if (strOperator.length() == 0)
				continue; // Need to try this again with no input
			operator = strOperator.charAt(0);
			operator_is_good = false;

			switch (operator) {
			case 'q':
			case '+':
			case '-':
			case '*':
			case '/':
				operator_is_good = true; //It's times like this I really miss python's "element in list" syntax...
				break;
			default:
				System.out.println("Your operator is bad ... try again:");
				break;
			}
		}

		return operator;
	}

	// Get one operand reliably
	int getOperand(int which) {
		return Util.readInt(scan, "Enter operand " + which + "\n" );
	}

	// Do the Actual Calculation required
	int doArithmetic(char operator, int operand1, int operand2) {
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
			System.out.println("We shouldn't get here in doArithmentic!!!!");
			answer = -1;
			break;
		}
		return answer;
	}

	// Format the final results
	void format(char operator, int operand1, int operand2, int answer) {

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
