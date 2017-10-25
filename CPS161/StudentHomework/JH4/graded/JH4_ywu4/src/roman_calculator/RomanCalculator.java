package roman_calculator;

import java.util.Scanner;

//**************************************************************** // ******* STARTING CODE ************************************** // **************************************************************** import java.util.*;
public class RomanCalculator {

	// scan can now be used anywhere within this class
	Scanner scan = new Scanner(System.in);
	//This routine either returns false if the use wants to quit, // or it does one Roman Calculator calculation
	boolean doCalculation()
	{
//		char operand;
		
		char operator=getOperator();
		
		if (operator=='q' )
		{
		return false;
		}
		
		int operand1=getOperand(1);
		int operand2=getOperand(2);
//		System.out.println("OperandOne "+operand1);
//		System.out.println("OperandTwo "+operand2);
		int answer= doArithmetic(operand1, operand2, operator);
		
		//		String sAnswer = convert_to_Roman(roman); 
		System.out.println("the answer is "+ convert_to_Roman(answer)); 
		
		//Call getOperator to get either - + * / or q. // If q is returned, we return a false.
		// ************** FILL IN CODE
		//If the operator is + - * or / then call // getOperand(1) for the first operand and // call getOperand(2) for the second operand
		// ************** FILL IN CODE
		//call doArithmetic and print out the result using // convert_to_Roman to generate Roman Numeral output.
		return true;
	}
	//This routine prompts the user with
	//Operator:+ - * / qforquit
	//If none of these are entered, this routine complains and
	//prompts the user again. Otherwise the operator is returned. char getOperator()
	public char getOperator()
	{
		char operator='q';
		boolean operator_is_good=false; 
        
        do
        {
            System.out.print("Enter an Operator: +  -  *  /  q for quit: ");
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
        return operator; 
	}
	
	//This routine prompts the user for either operand1 or operand2
	//depending on the value of which. This routine uppercases the
	//input and calls convert_from_Roman to create an integer.
	//If the input is invalid ( negative return from convert_from_Roman)
	//    then complain and prompt the user again.
	int getOperand(int which)
	{
		System.out.println("Enter operand "+which); 
		String operand="";
		//operand=scan.nextLine();
		int operandValue=0;
		
		//return convert_from_Roman(op);
		boolean isLetter=true;
		//input=scan.next();
		do
		{
			operand=scan.nextLine();
			for(int i=0;i<operand.length();i++)
			{
				char c = operand.charAt(i);
            		if (c!=('I')&&c!=('V')&&c!=('X')&&c!=('L')&&c!=('C')&&c!=('D')&&c!=('M')&&
            			c!=('i')&&c!=('v')&&c!=('x')&&c!=('l')&&c!=('c')&&c!=('d')&&c!=('m'))
            		{
                	// Oops, bad digit
                	isLetter=false;
                	System.out.println( operand + " has a bad character at position: "+ i );
                	break;
            		}
			}
			
		}while(isLetter==false);
		
		operandValue=convert_from_Roman(operand);
		
		return operandValue;
	}
	//Routine to convert an integer to a Roman Numeral String.
	//When you do this routine, you might find it handy to
	//create a utility routine that looks like:
	//String addRomanDigit(String starting, int num, char digit) String convert_to_Roman(int value)

	
	public String convert_to_Roman(int value)
	{
		String finalString="";
		
		int thousandResult=value/1000;
		int thousandRemainder=value%1000;
		String thousandString=" ";
		
		if(thousandResult==10)
		{
			thousandString="MMMMMMMMMM";
		}
		else if(thousandResult==9)
		{
			thousandString="MMMMMMMMM";
		}
		else if(thousandResult==8)
		{
			thousandString="MMMMMMMM";
		}
		else if(thousandResult==7)
		{
			thousandString="MMMMMMM";
		}
		else if(thousandResult==6)
		{
			thousandString="MMMMMM";
		}
		else if(thousandResult==5)
		{
			thousandString="MMMMM";
		}
		else if(thousandResult==4)
		{
			thousandString="MMMM";
		}
		else if(thousandResult==3)
		{
			thousandString="MMM";
		}
		else if(thousandResult==2)
		{
			thousandString="MM";
		}
		else if(thousandResult==1)
		{
			thousandString="M";
		}
		else
		{
			thousandString="";
		}//end of thousand division
	
		int fiveHundredResult=thousandRemainder/500;
		int fiveHundredRemainder=thousandRemainder%500;
		String fiveHundredString=" ";
		
		if(fiveHundredResult==10)
		{
			fiveHundredString="DDDDDDDDDD";
		}
		else if(fiveHundredResult==9)
		{
			fiveHundredString="DDDDDDDDD";
		}
		else if(fiveHundredResult==8)
		{
			fiveHundredString="DDDDDDDD";
		}
		else if(fiveHundredResult==7)
		{
			fiveHundredString="DDDDDDD";
		}
		else if(fiveHundredResult==6)
		{
			fiveHundredString="DDDDDD";
		}
		else if(fiveHundredResult==5)
		{
			fiveHundredString="DDDDD";
		}
		else if(fiveHundredResult==4)
		{
			fiveHundredString="DDDD";
		}
		else if(fiveHundredResult==3)
		{
			fiveHundredString="DDD";
		}
		else if(fiveHundredResult==2)
		{
			fiveHundredString="DD";
		}
		else if(fiveHundredResult==1)
		{
			fiveHundredString="D";
		}
		else
		{
			fiveHundredString="";
		}//end of 500 division
		
		
		int hundredResult=fiveHundredRemainder/100;
		int hundredRemainder=fiveHundredRemainder%100;
		String hundredString=" ";
		if(hundredResult==10)
		{
			hundredString="CCCCCCCCCC";
		}
		else if(hundredResult==9)
		{
			hundredString="CCCCCCCCC";
		}
		else if(hundredResult==8)
		{
			hundredString="CCCCCCCC";
		}
		else if(hundredResult==7)
		{
			hundredString="CCCCCCC";
		}
		else if(hundredResult==6)
		{
			hundredString="CCCCCC";
		}
		else if(hundredResult==5)
		{
			hundredString="CCCCC";
		}
		else if(hundredResult==4)
		{
			hundredString="CCCC";
		}
		else if(hundredResult==3)
		{
			hundredString="CCC";
		}
		else if(hundredResult==2)
		{
			hundredString="CC";
		}
		else if(hundredResult==1)
		{
			hundredString="C";
		}
		else
		{
			hundredString="";
		}//end of 100 division
		
		int fiftyResult=hundredRemainder/50;
		int fiftyRemainder=hundredRemainder%50;
		String fiftyString=" ";
		if(fiftyResult==10)
		{
			fiftyString="LLLLLLLLLL";
		}
		else if(fiftyResult==9)
		{
			fiftyString="LLLLLLLLL";
		}
		else if(fiftyResult==8)
		{
			fiftyString="LLLLLLLL";
		}
		else if(fiftyResult==7)
		{
			fiftyString="LLLLLLL";
		}
		else if(fiftyResult==6)
		{
			fiftyString="LLLLLL";
		}
		else if(fiftyResult==5)
		{
			fiftyString="LLLLL";
		}
		else if(fiftyResult==4)
		{
			fiftyString="LLLL";
		}
		else if(fiftyResult==3)
		{
			fiftyString="LLL";
		}
		else if(fiftyResult==2)
		{
			fiftyString="LL";
		}
		else if(fiftyResult==1)
		{
			fiftyString="L";
		}
		else
		{
			fiftyString="";
		}//end of 50 division
		
		int tenResult=fiftyRemainder/10;
		int tenRemainder=fiftyRemainder%10;
		String tenString=" ";
		if(tenResult==10)
		{
			tenString="XXXXXXXXXX";
		}
		else if(tenResult==9)
		{
			tenString="XXXXXXXXX";
		}
		else if(tenResult==8)
		{
			tenString="XXXXXXXX";
		}
		else if(tenResult==7)
		{
			tenString="XXXXXXX";
		}
		else if(tenResult==6)
		{
			tenString="XXXXXX";
		}
		else if(tenResult==5)
		{
			tenString="XXXXX";
		}
		else if(tenResult==4)
		{
			tenString="XXXX";
		}
		else if(tenResult==3)
		{
			tenString="XXX";
		}
		else if(tenResult==2)
		{
			tenString="XX";
		}
		else if(tenResult==1)
		{
			tenString="X";
		}
		else
		{
			tenString="";
		}//end of 10 division
		
		int fiveResult=tenRemainder/5;
		int fiveRemainder=tenRemainder%5;
		String fiveString=" ";
		if(fiveResult==10)
		{
			fiveString="VVVVVVVVVV";
		}
		else if(fiveResult==9)
		{
			fiveString="VVVVVVVVV";
		}
		else if(fiveResult==8)
		{
			fiveString="VVVVVVVV";
		}
		else if(fiveResult==7)
		{
			fiveString="VVVVVVV";
		}
		else if(fiveResult==6)
		{
			fiveString="VVVVVV";
		}
		else if(fiveResult==5)
		{
			fiveString="VVVVV";
		}
		else if(fiveResult==4)
		{
			fiveString="VVVV";
		}
		else if(fiveResult==3)
		{
			fiveString="VVV";
		}
		else if(fiveResult==2)
		{
			fiveString="VV";
		}
		else if(fiveResult==1)
		{
			fiveString="V";
		}
		else
		{
			fiveString="";
		}//end of 5 division
		
		int oneResult=fiveRemainder/1;
		
		String oneString=" ";
		if(oneResult==10)
		{
			oneString="IIIIIIIIII";
		}
		else if(oneResult==9)
		{
			oneString="IIIIIIIII";
		}
		else if(oneResult==8)
		{
			oneString="IIIIIIII";
		}
		else if(oneResult==7)
		{
			oneString="IIIIIII";
		}
		else if(oneResult==6)
		{
			oneString="IIIIII";
		}
		else if(oneResult==5)
		{
			oneString="IIIII";
		}
		else if(oneResult==4)
		{
			oneString="IIII";
		}
		else if(oneResult==3)
		{
			oneString="III";
		}
		else if(oneResult==2)
		{
			oneString="II";
		}
		else if(oneResult==1)
		{
			oneString="I";
		}
		else
		{
			oneString="";
		}//end of 5 division
		
		finalString=thousandString+fiveHundredString+hundredString+fiftyString+tenString+fiveString+oneString;
		
		return finalString;
		// ************** FILL IN CODE
	}
    
	//Convert Roman Numeral String to an integer. If the // Roman Numeral String is invalid, return -1.
	public int convert_from_Roman(String value)
	{
		
		
		String s=value.toUpperCase();
		int decimalValue=0;
		int eachPosition=0;
		for(int i=0;i<s.length();i++)
		{
			switch(s.charAt(i))
			{
			case 'M':
				eachPosition=1000;
				decimalValue=decimalValue+eachPosition;
				break;
			case 'D':
				eachPosition=500;
				decimalValue=decimalValue+eachPosition;
				break;
			case 'C':
				eachPosition=100;
				decimalValue=decimalValue+eachPosition;
				break;
			case 'L':
				eachPosition=50;
				decimalValue=decimalValue+eachPosition;
				break;
			case 'X':
				eachPosition=10;
				decimalValue=decimalValue+eachPosition;
				break;
			case 'V':
				eachPosition=5;
				decimalValue=decimalValue+eachPosition;
				break;
			case 'I':
				eachPosition=1;
				decimalValue=decimalValue+eachPosition;
				break;
			}
			
		}
		return decimalValue;
	}
		

	    	
	
	//Perform the arithmetic indicated by the operator (+ - * /) // and return answer
	public int doArithmetic(int operand1, int operand2, char operator)
	{
		int answer=0;
		
		if(operator=='+')
		{
			answer=operand1+operand2;
		}
		else if(operator=='-')
		{
			answer=operand1-operand2;
		}
		else if(operator=='*')
		{
			answer=operand1*operand2;
		}
		else if(operator=='/')
		{
			answer=operand1/operand2;
		}
		// *********************************** // Your logic to compute the answer
		return answer;
	}
	public static void main(String[] args) 
	{ 
		RomanCalculator rc = new RomanCalculator();
		//operator

		while (rc.doCalculation())
		{
		
			System.out.println();  // blank line
		}
	System.out.println("Finished Roman Computations"); 
	}
}
