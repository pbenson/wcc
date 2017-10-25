package roman_calculator;
import java.util.*;
public class RomanCalculator {

	// scan can now be used anywhere within this class

	Scanner scan = new Scanner(System.in);
	
	// This routine either returns false if the use wants to quit,
	//    or it does one Roman Calculator calculation

	boolean doCalculation()
	{
		char operand;
		
		char operator = getOperator();
		if (operator == 'q')
			return false;
		
		int operand1 = getOperand(1);
		int operand2 = getOperand(2);
		int answer = doArithmetic(operand1, operand2, operator);
		
		String sAnswer = convert_to_Roman(answer);
		System.out.println("The answer is " + sAnswer);
		
		return true;
	}

	// This routine prompts the user with 
	// Operator: +  -* /  q for quit
	// If none of these are entered, this routine complains and
	//   prompts the user again.  Otherwise the operator is returned. 

	char getOperator()
	{

		char operator = 'q';
		boolean operator_is_good = false; 

		do
		{
			System.out.print("Enter an Operator: +  - *  /  q for quit: ");
			String strOperator = scan.nextLine();
			strOperator = strOperator.trim();
			if (strOperator.length() == 0)
				continue; // Need to try this again with no input
			operator = strOperator.charAt(0);
			operator_is_good=false;

			switch (operator)
			{
			case 'q':
			case '+':
			case '-':
			case '*':
			case '/':
				operator_is_good = true;
				break;
			default:
				System.out.println("Your operator is bad ... try again:");
				break;            
			}
		} while (!operator_is_good);

		if (operator == 'q')
		{

			// not really needed because we are doing a break... but clarifies what will happen

		}

		return operator;

	}

	// This routine prompts the user for either operand1 or operand2
	// depending on the value of which.  This routine uppercases the 
	// input and calls convert_from_Roman to create an integer.
	// If the input is invalid ( negative return from convert_from_Roman)
	//    then complain and prompt the user again. 

	int getOperand(int which)
	{
		
		System.out.println("Enter operand " + which);  
		String op = scan.next();
		return convert_from_Roman(op);
		
	}

	// Routine to convert an integer to a Roman Numeral String.    
	// When you do this routine, you might find it handy to 
	// create a utility routine that looks like:
	//  String addRomanDigit(String starting, int num, char digit)

	String convert_to_Roman(int value)
	{
		
		String total = ""; 
	    String s = "";
	    while (value >= 1000) 
	    {
	    	s += "M";
	    	value -= 1000;        
	    	}
	    while (value >= 900) 
	    {
	    	s += "CM";
	    	value -= 900;
	    }
	    while (value >= 500) 
	    {
	    	s += "D";
	    	value -= 500;
	    }
	    while (value >= 400) 
	    {
	    	s += "CD";
	    	value -= 400;
	    }
	    while (value >= 100) 
	    {
	    	s += "C";
	    	value -= 100;
	    }
	    while (value >= 90) 
	    {
	    	s += "XC";
	    	value -= 90;
	    }
	    while (value >= 50) 
	    {
	    	s += "L";
	    	value -= 50;
	    }
	    while (value >= 40) 
	    {
	    	s += "XL";
	    	value -= 40;
	    }
	    while (value >= 10) 
	    {
	    	s += "X";
	    	value -= 10;
	    }
	    while (value >= 9) 
	    {
	    	s += "IX";
	    	value -= 9;
	    }
	    while (value >= 5) 
	    {
	    	s += "V";
	    	value -= 5;
	    }
	    while (value >= 4) 
	    {
	    	s += "IV";
	    	value -= 4;
	    }
	    while (value >= 1) 
	    {
	    	s += "I";
	    	value -= 1;
	    	
	    	
	   
	    } 
	    total = total + s;
	   
	    return total;
		

	}
	
	// Convert Roman Numeral String to an integer.  If the 
	// Roman Numeral String is invalid, return -1.

	int convert_from_Roman(String value)
	{
		int decimal = 0;
		int total = 0;

	    String romanNumeral = value.toUpperCase();
	    for(int x = 0;x<romanNumeral.length();x++)
	    {
	        char convertToDecimal = value.charAt(x);

	        switch (convertToDecimal)
	        {
	        case 'M':
	            decimal += 1000;
	            break;

	        case 'D':
	            decimal += 500;
	            break;

	        case 'C':
	            decimal += 100;
	            break;

	        case 'L':
	            decimal += 50;
	            break;

	        case 'X':
	            decimal += 10;
	            break;

	        case 'V':
	            decimal += 5;
	            break;

	        case 'I':
	            decimal += 1;
	            break;
	        }
	    }
	    if (romanNumeral.contains("IV"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("IX"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("XL"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("XC"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("CD"))
	    {
	        decimal-=100;
	    }
	    if (romanNumeral.contains("CM"))
	    {
	        decimal-=100;
	    }
	    total = total + decimal;
	    return decimal;
		
	}

	// Perform the arithmeticindicated by the operator (+ -* /)
	// and return answer

	int doArithmetic(int operand1, int operand2, char operator)
	{
		int result = 0;
		switch (operator)
		{
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
			
		}	
		
		return result;
		
	
	}

	public static void main(String[] args) {
		RomanCalculator rc = new RomanCalculator();
		while (rc.doCalculation())
		{
			System.out.println();  // blank line
		}
		System.out.println("Finished Roman Computations");
	}
}
