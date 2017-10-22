package roman_calculator;

import java.util.*;
public class romanCalculator {
	Scanner scan = new Scanner(System.in);
	boolean doCalculation(){
		char operator ;
		operator = getOperator();
		if (operator=='q'){
			return false;
			}
		//If the operator is + - * or / then call // getOperand(1) for the first operand and // call getOperand(2) for the second operand
		int operand1 = getOperand(1);
		int operand2 = getOperand(2);
		
		//call doArithmetic and print out the result using // convert_to_Roman to generate Roman Numeral output.
		int result = doArithmetic(operand1, operand2, operator);
		String romanNumeralResult = convert_to_Roman(result);
		System.out.println(romanNumeralResult);
		return true;
		}
	
	/* This routine prompts the user with Operator:+ - * / q for quit
	 * If none of these are entered, this routine complains and prompts the user again. Otherwise the operator is returned. */
	char getOperator(){
		System.out.println("Operator: + - * / or q for quit:");
		String operatorString = scan.next();
		char operatorChar = operatorString.charAt(0);
		while (!(operatorChar == '+' || operatorChar == '-' || operatorChar == '*' || operatorChar == '/' || operatorChar == 'q' || operatorString.length()!=1)){
			System.out.println("Invalid operator! Please enter + - * / or q for quit:");
			operatorString = scan.next();
			operatorChar = operatorString.charAt(0);
			}
		return operatorChar;
		}
	
	/* This routine prompts the user for either operand1 or operand2 depending on the value of which. 
	 * If the input is invalid ( negative return from isValidOperand)	 
	 * then complain and prompt the user again. */
	
	int getOperand(int which) {
		System.out.println("Enter Operand " + which + ":");
		String operandString = scan.next();
		if (!isValidOperand(operandString)){
			while (!isValidOperand(operandString)){
				System.out.println("Invalid operand! Enter Operand " + which + ":");
				operandString = scan.next();
				}
			}
		int operand = convert_from_Roman(operandString);
		return operand;
		}
 
	boolean isValidOperand (String operand){
		String tempOperand=operand;
		tempOperand = tempOperand.toLowerCase();
		boolean testResult =true;
		for (int i=0;i<tempOperand.length(); i++ ){
			if (tempOperand.charAt(i) != 'i' && tempOperand.charAt(i) != 'v' && tempOperand.charAt(i) != 'x' && tempOperand.charAt(i) != 'l' && tempOperand.charAt(i) != 'c' && tempOperand.charAt(i) != 'd' && tempOperand.charAt(i) != 'm'){
				testResult= false;
				}
			}
		return testResult;
		}
 
	// Routine to convert an integer to a Roman Numeral String.
	String convert_to_Roman(int value) {
		String romanNumeralValues = "MDCLXVI";
		int[] romanValues = new int[7];
		romanValues[0] = 1000;
		romanValues[1] = 500;
		romanValues[2] = 100;
		romanValues[3] = 50;
		romanValues[4] = 10;
		romanValues[5] = 5;
		romanValues[6] = 1;
	 
		String result = "";
		for (int i=0; i<7; i++){
			if (value-romanValues[i]>=0){
				while (value-romanValues[i]>=0){
					result = result+romanNumeralValues.charAt(i);
					value = value-romanValues[i];
					}
				}
			}
		return result;
		}
	
	//Convert Roman Numeral String to an integer. If the // Roman Numeral String is invalid, return -1.
	int convert_from_Roman(String value){
		value=value.toUpperCase();
		String romanNumeralValues = "MDCLXVI";
		int[] romanValues = new int[7];
		romanValues[0] = 1000;
		romanValues[1] = 500;
		romanValues[2] = 100;
		romanValues[3] = 50;
		romanValues[4] = 10;
		romanValues[5] = 5;
		romanValues[6] = 1;
	 
		int romanValue=0;
	 
		for (int j=0; j<romanNumeralValues.length(); j++){
			if (value.indexOf(romanNumeralValues.charAt(j))>=0){
				while (value.indexOf(romanNumeralValues.charAt(j))>=0){
					romanValue = romanValue+romanValues[j];
					value = removeChar(value, value.indexOf(romanNumeralValues.charAt(j)));
					}
				}
			}
		return romanValue; 
		}
	
	// Remove char from String
	String removeChar(String str, Integer n) {
		String beginning = str.substring(0, n);
		String end = str.substring(n+1, str.length());
		return beginning + end;
		}
	
	//Perform the arithmetic indicated by the operator (+ - * /) // and return answe
	int doArithmetic(int operand1, int operand2, char operator){
		int mathResult=0;
		switch (operator)  {
		case '+':
			mathResult= operand1+operand2;
			return mathResult;
		case '-':
			mathResult= operand1-operand2;
			return mathResult;
		case '*':
			mathResult= operand1*operand2;
			return mathResult;
		case '/':
			mathResult= operand1/operand2;
			return mathResult;
			}
		return mathResult;
		}

	public static void main(String[] args) { romanCalculator rc = new romanCalculator(); while (rc.doCalculation()){
         System.out.println();  // blank line
         }
	System.out.println("Finished Roman Computations"); }
	}