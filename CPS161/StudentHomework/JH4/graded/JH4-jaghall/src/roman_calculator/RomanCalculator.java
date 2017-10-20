package roman_calculator;

import java.util.*;

public class RomanCalculator {
	public static void main(String[] args) {
		RomanCalculator bid = new RomanCalculator();
        Scanner scan = new Scanner(System.in);

        while(bid.doCalculation(scan)) {
        		System.out.println("");
        		System.out.println("=======================");
        }
        
        scan.close();
        System.out.println("Finished Calculations");
    }
    
    boolean doCalculation(Scanner scan) {
    		String operand1, operand2;
    		int converted1, converted2, answer;
        char operator = 'q';

        operator = getOperator(scan);
        
        if (operator == 'q') return false;

        int which = 1;
        operand1 = getOperand(scan, which);
        converted1 = convertFromRoman(operand1);
        
        which = 2;
        operand2 = getOperand(scan, which);
        converted2 = convertFromRoman(operand2);
        
        answer = doArithmetic(operator, converted1, converted2);
        printResults(operand1, operator, operand2, answer);
        return true;
    }
    
    char getOperator(Scanner scan) {
 		char operator = 'q';
         while (true) {
             System.out.print("Enter an Operator: + - * / q for quit: ");
             String strOperator = scan.nextLine();
             strOperator = strOperator.trim();
             if (strOperator.length() == 0)
                 continue; // Need to try this again with no input

             operator = strOperator.charAt(0);
             if (isOperatorValid(operator)) {
            	 	return operator;
             }
             
             System.out.println("Your operator is bad ... try again: ");
             continue;
         }
 	}
    
    boolean isOperatorValid(char operator) {
    		switch (operator) {
	        case 'q':
	        case '+':
	        case '-':
	        case '*':
	        case '/':
	            return true;
	        default:
	            return false;
    		}
    }
    
    String getOperand(Scanner scan, int which) {
		System.out.println("Enter operand " + which);
	    String input;
	    boolean operand_is_bad;
	
	    do {
	        operand_is_bad = false;
	        input = scan.nextLine()
	        		.trim()
	        		.toUpperCase();
	        
	        if (input.length() == 0) operand_is_bad = true;
	        
	        if (convertFromRoman(input) == -1) {
	        		operand_is_bad = true;
	            System.out.println("Your last input was bad, try again ");
	        }
	    }
	    while (operand_is_bad);
	    
		return input;
	}
    
    int doArithmetic(char operator, int operand1, int operand2) {
	    	switch (operator) {
	        case '+':
	            return operand1 + operand2;
	        case '-':
	            return operand1 - operand2;
	        case '*':
	            return operand1 * operand2;
	        case '/':
	            return operand1 / operand2;
	        default:
	            System.out.println("We shouldn't get here in doArithmentic!!!!");
	            return -1;
	    }
	}

	String convertToRoman(int value) {
		String numerals = "MDCLXVI";
		String output = "";
		for (int i = 0; i < numerals.length(); i++ ) {
			char c = numerals.charAt(i);
			int numeralNumber = numeralToNumber(c);
			int remainder = value % numeralNumber;
			
			int n = (value - remainder) / numeralNumber;

			// I was looking for a simple way of creating a string of length 'n'
			// all of character 'c'. This solution came from here:
			// https://stackoverflow.com/a/2807731/965352
			output = output + new String(new char[n]).replace('\0', c);
			value = remainder;
		}
		return output;
	}

	int numeralToNumber(char c) {
		switch (c) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default: return -1;
		}
	}

	int convertFromRoman(String value) {
		int amount = 0;
		for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int numeralValue = numeralToNumber(c);
            if (numeralValue == -1) {
            	System.out.println(value + " has a bad character at position: " + i);
            		return numeralValue;
            	}
            
			amount = amount + numeralToNumber(c);
		}
		return amount;
	}
	
	void printResults(String operand1, char operator, String operand2, int answer) {
		System.out.println(operand1 + " " + operator + " " +
        operand2 + " = " + convertToRoman(answer));
	}
}