package roman_calculator;

import java.util.*;
public class RomanCalculator {
    
    static Scanner scan = new Scanner(System.in);

	private static char Operator;

static int doCalculation (int dec1, int dec2, char Operator)
{
	int result = 0;
	 
        switch(Operator) {
        case '+' : result = dec1 + dec2;
        break;
        case '-' : result = dec1 - dec2;
        break;
        case '*' : result = dec1 * dec2;
        break;
        case '/' : result = dec1 / dec2;
        break;
        default:
        	
         }
        
return result;
    }  

static int ConvertToDec( String roman) {
        roman = roman.toUpperCase();
    	   int romantodec=0;
    	   
    	   char[] numeral = roman.toCharArray();
    	   
    	   for (int i= 0; i<= roman.length()-1; i++)
    	   {
    		   switch (numeral[i]) {
    		   case 'M': romantodec = romantodec+ 1000;
    		   break;
    		   case 'D': romantodec = romantodec +500;
    		   break;
    		   case 'C': romantodec = romantodec + 100;
    		   break;
    		   case 'L': romantodec = romantodec + 50;
    		   break;
    		   case 'X': romantodec = romantodec +10;
    		   break;
    		   case 'V': romantodec = romantodec + 5;
    		   break;
    		   case 'I': romantodec = romantodec +1;
    		   break;
    		   default:
    			   
    		   }
    	   }
		return romantodec;
	}

static char getOperator() {
	   
	boolean Oper = false;
	char operator1;
	
        do{
    	   System.out.println(" Please give me an operator to use +,-,*,/. q to quit- ");
    	   operator1= scan.next().charAt(0);
    	   
      
    	  
    	   if (operator1 == '+' ) {
    		   Oper = true;
    	   }
    	   else if ( operator1 == '-') {
    		   Oper = true;
    	   }
    	   else if (operator1=='/') {
    		   Oper = true;
    	   }
    	   else if (operator1 == '*') {
    		   Oper = true;
    	   }
    	   else if (operator1 == 'q') {
    		   Oper = true;
    	   }
    	   else  {
    		   System.out.println(" Sorry, not allowed ");
    		   Oper = false;
    	   }    	   
        } 
              
        while (Oper == false);
          
    	   return operator1;
    	   
       }


static  String getOperand(int which)
    { System.out.println(" Enter the operand number " + which);
      String roman = scan.next();
		return roman; 
    }

static String convert_to_roman(int result)
{
	int M,C, D, L, X, V, I, x;
	String convertroman = " ";
	
 {
		M = result / 1000;
		result = result % 1000;
		D = result / 500;
		result = result % 500;
		C = result / 100;
		result = result % 100;
		L = result / 50;
		result = result % 50;
		X = result / 10;
		result = result % 10;
		V = result / 5;
		result = result % 5;
		I = result;
		
		for(x=1; x <= M; x++) {
		convertroman = convertroman + "M";}
		for(x=1; x <= D; x++) {
			convertroman = convertroman + "D";}
		for(x=1; x <= C; x++) {
			convertroman = convertroman + "C";}
		for(x=1; x <= L; x++) {
			convertroman = convertroman + "L";}
		for(x=1; x <= X; x++) {
			convertroman = convertroman + "X";}
		for(x=1; x <= V; x++) {
			convertroman = convertroman + "V";}
		for(x=1; x <= I; x++) {
			convertroman = convertroman + "I";}
		}
		
		
	
	return convertroman;
       
    }

public static void main(String[] args)
{
	
int x = 1;
	        do {

	      
            System.out.println();  
            char Operator = getOperator();
            if (Operator == 'q')
            { System.exit(0);};
            String Operand1 = getOperand(1);
            String Operand2 = getOperand(2);
            int dec1 = ConvertToDec(Operand1);
            int dec2 = ConvertToDec(Operand2);
            int result= doCalculation(dec1, dec2, Operator); 
            String finalroman= convert_to_roman(result);
            System.out.println( "Final result = " + finalroman );
	        }
	        while (x == 1 );
	       
        }
}