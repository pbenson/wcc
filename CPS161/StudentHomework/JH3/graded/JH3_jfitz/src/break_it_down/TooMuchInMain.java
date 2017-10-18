package break_it_down;

import java.util.Scanner;

public class TooMuchInMain {
	
	static Scanner keyboard = new Scanner(System.in);
	static double setDouble(int operandNum) {
		
		System.out.print("Enter operand " + operandNum + ": ");
		String input = keyboard.next();
		
		while (!tryParse(input) || input.length() == 0) {
			System.out.println("Operand " + operandNum + " (Currently: \"" + input + "\") was not in the correct format.");
			System.out.print("Enter operand " + operandNum + ": ");
			input = keyboard.next();
		}
		return Double.parseDouble(input);
	}
	
	static boolean tryParse(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	static boolean goodInput(char operand) {
		
		switch(operand) {
		case '+':
		case '-':
		case '*':
		case '/':
		case 'q':
			return true;
		default:
			break;
		}
		
		return false;
	}
	
	static void doArithmatic(char operator, double operand1, double operand2) {
		
		boolean error = false;
		double result = 0;
		
		switch (operator) {
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case '*':
			result = operand1 * operand2;
			break;
		case '/':
			result = operand1 / operand2;
			break;
		default:
			System.out.print("Exception in doArithmatic() method");
			error = true;
			break;
		}
		
		System.out.printf("%f %c %f = " + (error ? "NaN" : result) + "\n", operand1, operator, operand2);
		System.out.println("==========================");
	}

	public static void main(String[] args) {
		
		while (true) {
			
			System.out.print("Enter an operator (+, -, *, /, or q to quit): ");
			char operator = keyboard.next().trim().toCharArray()[0];
			
			if (!goodInput(operator)) {
				System.out.print("Operator \"" + operator + "\" was not in the correct format.\n");
				continue;
			}
			if (operator == 'q')
				break;
			
			double operand1 = setDouble(1);
			double operand2 = setDouble(2);
			
			doArithmatic(operator, operand1, operand2);
		}
		
		System.out.print("Thank you for using the program. Have a good day.");
		keyboard.close();
	}
}