package breaking_it_down;

import java.util.Scanner;

public class TooMuchInMain {
    public static void main(String[] args) {
        TooMuchInMain bid = new TooMuchInMain();
        Scanner scan = new Scanner(System.in);

        while(bid.doCalculation(scan)) {
        		System.out.println("=======================");
        }
        
        scan.close();
        System.out.println("Finished Calculations");
    }
    
    boolean doCalculation(Scanner scan) {
    		int operand1, operand2, answer;
        char operator = 'q';

        operator = getOperator(scan);
        
        if (operator == 'q') return false;

        int which = 1;
        operand1 = getOperand(scan, which);
        which = 2;
        operand2 = getOperand(scan, which);

        answer = doArithmetic(operator, operand1, operand2);
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
    
    int getOperand(Scanner scan, int which) {
		System.out.println("Enter operand " + which);
	    String input;
	    boolean operand_is_bad;
	
	    do {
	        operand_is_bad = false;
	        input = scan.nextLine();
	        input = input.trim();
	        if (input.length() == 0) operand_is_bad = true;
	        
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c < '0' || c > '9') {
	                // Oops, bad digit
	                operand_is_bad = true;
	                System.out.println("Your last input was bad, try again ");
	            }
	        }
	    }
	    while (operand_is_bad);
	    
		return Integer.parseInt(input);
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
    
    void printResults(int operand1, char operator, int operand2, int answer) {
    		System.out.println(operand1 + " " + operator + " " +
            operand2 + " = " + answer);
    }
}