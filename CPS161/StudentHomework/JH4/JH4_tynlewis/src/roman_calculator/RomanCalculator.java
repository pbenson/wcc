package roman_calculator;

import java.util.*;

public class RomanCalculator {

	private Scanner scan = new Scanner(System.in);
	public static String answer = "";

	boolean doCalculation()
	{
		char operator = getOperator();
		int operand1 = getOperand(1);
		int operand2 = getOperand(2);
		answer = convertToRoman(doArithmetic(operator, operand1, operand2));
		return true;
	}

	char getOperator()
	{
		String operator = "";
		boolean badOperator = true;

		do {
			System.out.print("Operator: + - * / q for quit: ");		
			operator = scan.next();

			switch (operator){
			case "+":
			case "-":
			case "*":
			case "/": badOperator = false;
			break;
			case "q": System.out.print("Finished Roman Computations");
			scan.close();
			System.exit(-1);
			default : System.out.println("Your operand is bad ... try again: ");
			break;
			}
		}	while(badOperator);

		return operator.charAt(0);
	}


	int getOperand(int which)
	{
		boolean badOperand = true;
		String operand = "";

		do {
			System.out.print("Enter operand" + which + ": ");		
			operand = scan.next().toUpperCase(); 

			for(int i=0; i<operand.length(); i++)
			{
				switch(operand.charAt(i))
				{
				case 'I':
				case 'V':
				case 'X':
				case 'L':
				case 'C':
				case 'D':
				case 'M': if(i + 1 == operand.length()) 
				{ badOperand = false;
				break;
				}
				else break;
				default: System.out.println(operand + " has a bad character at position: " + i);
				i = operand.length();
				break;
				}

			}
		} while(badOperand);
		
		return convertFromRoman(operand);
	}

	String convertToRoman(int value)
	{
		String convertedAnswer = "";

		int countM = value / 1000;
		int countD = (value % 1000) / 500;
		int countC = (value % 500) / 100;
		int countL = (value % 100) / 50;
		int countX = (value % 50) / 10;
		int countV = (value % 10) / 5;	 
		int countI = value % 5;	 

		for(int i = 0; i < countM; i++){convertedAnswer = convertedAnswer + 'M';}
		for(int i = 0; i < countD; i++){convertedAnswer = convertedAnswer + 'D';}
		for(int i = 0; i < countC; i++){convertedAnswer = convertedAnswer + 'C';}
		for(int i = 0; i < countL; i++){convertedAnswer = convertedAnswer + 'L';}
		for(int i = 0; i < countX; i++){convertedAnswer = convertedAnswer + 'X';}
		for(int i = 0; i < countV; i++){convertedAnswer = convertedAnswer + 'V';}
		for(int i = 0; i < countI; i++){convertedAnswer = convertedAnswer + 'I';}

		return convertedAnswer;
	}

	int convertFromRoman(String value)
	{
		int convertedValue = 0;

		for(int i=0; i<value.length(); i++)
		{

			switch(value.charAt(i)) {
			case 'I': convertedValue += 1;
			break;
			case 'V': convertedValue += 5;
			break;
			case 'X': convertedValue += 10;
			break;
			case 'L': convertedValue += 50;
			break;
			case 'C': convertedValue += 100;
			break;
			case 'D': convertedValue += 500;
			break;
			case 'M': convertedValue += 1000;
			break;
			}
		}
		return convertedValue;
	}


	int doArithmetic(char operator, int operand1, int operand2)
	{
		int answer = 0;

		switch(operator)
		{
		case '+': answer = operand1 + operand2;
		break;
		case '-': answer = operand1 - operand2;
		break;
		case '*': answer = operand1 * operand2;
		break;
		case '/': answer = operand1 / operand2;
		break;
		}
		return answer;
	}

	public static void main(String[] args) {

		RomanCalculator rc = new RomanCalculator();

		while (rc.doCalculation())
		{
			System.out.println("Answer = " + answer);
			System.out.println(); // blank line
		}
		System.out.println("Finished Roman Computations");

	}
}