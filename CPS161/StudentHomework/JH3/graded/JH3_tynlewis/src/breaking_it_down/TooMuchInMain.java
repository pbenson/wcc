package breaking_it_down;

import java.util.Scanner;

public class TooMuchInMain{ 

	private String strOperator, input;
	private Scanner keyboard;
	private int operand1, operand2, answer;

	public void readOperator(){
		keyboard = new Scanner(System.in);
		System.out.print("Enter an Operator: +  -  *  /  q for quit: ");
		strOperator = keyboard.nextLine();

		switch (strOperator){                                   
		case "+": 
		case "-":
		case "*":
		case "/": readOperands();
		break;
		case "q": System.out.println("Finished Calculations");
		keyboard.close();
		break;
		default:  System.out.println("Your last input is bad ... try again:");
		readOperator();
		}
	}

	private void readOperands(){

		boolean operandIsBad;

		do{ operandIsBad = false;
		System.out.println("Enter operand 1: ");
		input = keyboard.nextLine().trim();

		if (input.length() == 0)                         
			operandIsBad=true;                     

		for (int i=0; i < input.length(); i++){                         
			char c = input.charAt(i);                         
			if (c < '0' || c > '9'){                                                       
				operandIsBad = true;                             
				System.out.println("Your last input was bad, try again");
			}
		}                 
		} while (operandIsBad); 

		operand1 =  Integer.parseInt(input);

		do{ operandIsBad = false;
		System.out.println("Enter operand 2: ");
		input = keyboard.nextLine().trim();

		if (input.length() == 0)                         
			operandIsBad=true;                     

		for (int i=0; i < input.length(); i++){                         
			char c = input.charAt(i);                         
			if (c < '0' || c > '9'){                                                       
				operandIsBad = true;                             
				System.out.println("Your last input was bad, try again");
			}
		}                 
		} while (operandIsBad); 

		operand2 =  Integer.parseInt(input);	 

		calculateResults();	 
	}

	private void calculateResults(){
		switch(strOperator){                     
		case "+": answer = operand1 + operand2;                         
		break;                     
		case "-": answer = operand1 - operand2;                         
		break;                     
		case "*": answer = operand1 * operand2;                         
		break;                     
		case "/": answer = operand1 / operand2;                         
		break;                     
		case "q":  System.out.println("q shouldnt fall through here");                        
		break; 		
		default: System.out.println("We shouldn't get here in doArithmentic!!!!");
		}
		System.out.println(operand1 + " " + strOperator + " " + operand2 + " = " + answer);
		System.out.println("=======================");
		readOperator();
	}
}