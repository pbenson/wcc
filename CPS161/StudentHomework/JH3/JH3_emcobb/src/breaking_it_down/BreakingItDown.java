package breaking_it_down;

import java.util.Scanner;

public class BreakingItDown {
		// instance variable
		Scanner scan = new Scanner(System.in);
		
		// Top Level routine for doing a single calculation
		boolean doCalculation() {
			
			int operand1, operand2, answer;
			
			//finding out if the user would like to quit
			char operator = getOperator(); 
			if (operator == 'q')
				return false;
			
			// if the user wants to continue getting the two values
			// and sending the values to the proper method
			operand1 = getOperand(1); 
			operand2 = getOperand(2);
			answer = doAritmetic (operator, operand1, operand2);
			format(operator, operand1, operand2, answer);
			
			return true;
		}
		
		// Get the operator reliably.
		
		char getOperator(){
			char operator ='q';
			
			boolean operator_is_good = false;
			
			do {
				System.out.println("Enter an operator: + - * / or q to quit");
				
				String strOperator = scan.nextLine();
				strOperator = strOperator.trim();
				if (strOperator.length() == 0)
					continue;
				operator = strOperator.charAt(0);
				operator_is_good = false;
				
				switch (operator){
				case 'q':
				case '+':
				case '-':
				case '*':
				case '/':
					operator_is_good = true;
					break;
				default:
					System.out.println("Your operator is bad, please try again.");
					break;
				}	
			}while (!operator_is_good);
			
			return operator;
		}

		
		int getOperand(int which) {
			
			//Asking the user for the first operand for the method doCalculation
			
			System.out.println("Enter operand " + which);
			String input;
			
			boolean operand_is_bad = false;
			
			do {
				operand_is_bad = false;
				
				//reading the user input and making sure there is input
				
				input = scan.nextLine();
				input = input.trim();
				if (input.length() == 0)
					operand_is_bad = true;
				
				//reading the length of the number and making sure its valid
				
				for (int i = 0; i < input.length(); i++) {
					char c = input.charAt(i);
					if (c < '0' || c> '9') {
						operand_is_bad = true;
						System.out.println("Bad input, please try again.");
					}
				}
				
			} while(operand_is_bad);
			
			return Integer.parseInt(input);
			
		}
		
		int doAritmetic(char operator, int operand1, int operand2) {
			int answer;
			
			//using a switch statement to determine what formula to use. 
			
			switch(operator) {
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
					System.out.println("Error; Refer to programmer for further editing");
					answer = -1;
					break;
			}
			
			return answer;
		}
			
		void format(char operator, int operand1, int operand2, int answer){
			
			System.out.println(operand1 + " " + operator + " " + operand2 + " = " + answer);
			
		}

	public static void main(String[] args) {
		
		BreakingItDown bid = new BreakingItDown();
		
		while (bid.doCalculation()) {
			System.out.println("=======================");	
		}
		
		System.out.println("Finished Calculating");
		

	}

}
