package breaking_it_down;


import java.util.Scanner;
public class BreakingItDown2 {
	
	 // instance variable
	 Scanner scan = new Scanner(System.in);

	 // Top Level routine for doing a single calculation
	 boolean doCalculation() {
		 int operand1, operand2, answer;
		 char operator = getOperator();
		 if (operator == 'q') {
			 return false; }
		 else {
		 operand1 = getOperand(1);
		 operand2 = getOperand(2);
		 answer = doArithmetic(operator, operand1, operand2);
		 format(operator, operand1, operand2, answer);
		
		 return true;
		 }
	 }
	 
	 // Get the Operator reliably
	 char getOperator()
	 { 
		 char operator='q';
		 boolean operator_is_good=false;

		 do
		 {
			 System.out.print("Enter an Operator: + - * / q for quit: ");
			 String strOperator = scan.nextLine();
			 strOperator = strOperator.trim();
			 if (strOperator.length() == 0)
				 continue; // Need to try this again with no input
			 
			 operator = strOperator.charAt(0);
			 operator_is_good=false;
			 
			 switch (operator) {
				case 'q':
				case '+':
				case '-':
				case '*':
				case '/':
				 operator_is_good = true;
				 break;
				default:
				 System.out.println("Your operator is bad ... try again:");
				 operator_is_good = false;
				 break;
			 }
		 } while (!operator_is_good);
		
		 
		 return operator;
	 }
	
	
	 // Get one operand reliably
	 int getOperand(int which) {
		 
		 
		 String input = null;
		 boolean operand_is_bad=false;
		 
		 if (which == 1) {
			 do {
				 System.out.println("Enter operand "+which);
				 input = scan.nextLine();
				 input = input.trim();
				 
				 if (input.length() == 0)
					 operand_is_bad=true;
				 
				 for (int i=0; i < input.length(); i++) {
					 char c = input.charAt(i);
					 if (c < '0' || c > '9') {
					 operand_is_bad=true;
					 System.out.println("Your last input was bad, try again");
					 } else {
						 operand_is_bad=false;
					 }
				 }
			 
			 } while (operand_is_bad);
			
			 int operand1 = Integer.parseInt(input);
		 
		 }

		 //***********************************************
		 // Now get operand 2
		 //Note this code is mostly the same as the above code.
		 // You can just reuse the same getOperand method again
		 //***********************************************
		 else if(which==2)  {

		 
		 do
		  {
			 System.out.println("Enter operand "+ which);
			 operand_is_bad=false;
			 input = scan.nextLine();
			 input = input.trim();
			 
			 if (input.length() == 0)
			  operand_is_bad=true;
			  for (int i=0; i < input.length(); i++)
			 {
			  char c = input.charAt(i);
			 
			  if (c < '0' || c > '9')
			 {
				  operand_is_bad=true;
				 System.out.println("Your last input was bad, try again");
			  }
			  }
		  } while (operand_is_bad);
		  
		  int operand2 = Integer.parseInt(input);
		 }
		 
		 return Integer.parseInt(input);
	 }
	
	
	
	 // Do the Actual Calculation required
	 int doArithmetic(char operator, int operand1, int operand2)
	 {
		 int answer=0;
		 
		 switch(operator) {
			 case '+':
				 answer= operand1 + operand2;
				 break;
			 case '-':
				 answer= operand1 - operand2;
				 break;
			 case '*':
				 answer= operand1 * operand2;
				 break;
			 case '/':
				 answer= operand1 / operand2;
				 break;
			 default:
				 System.out.println("Dude, how'd you find my non-number?");	 
				 
				 
		 }		 
				 
		 return answer;
	 }
	 
	 // Format the final results
	 void format(char operator, int operand1, int operand2, int answer)
	 {
		 System.out.println(operand1 + " " + operator + " " + operand2 + " = " + answer);
	 
}
	 
 // We like to keep minimal code in main 
 public static void main(String[] args)
 {
	 
	 BreakingItDown2 bid = new BreakingItDown2();
	
	while (bid.doCalculation()) {
		System.out.println("=======================");
	} 
	
	System.out.println("Finished Calculations");
	
	}
}
 
 
 
 
 