package Roman_Calculator;

import java.util.*;



public class Roman_Calculator {
   
    Scanner scan = new Scanner(System.in);
    
   
    boolean doCalculation()
    {
        int operand1, operand2, answer;
        String answer_Roman, operand1_Roman, operand2_Roman;
        char operator = getOperator();
        if (operator == 'q')
            return false;
        
        operand1 = getOperand(1);
        operand2 = getOperand(2);
        answer = doArithmetic(operator, operand1, operand2);
        
  
        answer_Roman = Convert_to_Roman(answer);
        operand1_Roman = Convert_to_Roman(operand1);
        operand2_Roman = Convert_to_Roman(operand2);
        
        format(operator, operand1_Roman, operand2_Roman, answer_Roman);
        
        return true;
    }

   
    char getOperator()
    { 
        char operator='q';
        boolean operator_is_good=false; 
        
        do
        {
            System.out.print("Enter an Operator: +  -  *  /  q for quit: ");
            String strOperator = scan.nextLine();
            strOperator = strOperator.trim();
            if (strOperator.length() == 0)
                continue; 
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
    

    int getOperand(int which)
    {

     
        System.out.println("Enter operand "+which);
        String input;

        boolean operand_is_bad;
        
        do
        {
            operand_is_bad=false;
            
            input = scan.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            if (input.length() == 0)
                operand_is_bad=true;
            for (int i=0; i < input.length(); i++)
            {
                char c = input.charAt(i);
                if (c != 'M' && c != 'D' && c != 'C'&& c != 'L'&& c != 'X'&& c != 'V'&& c != 'I')
                {
                   
                    operand_is_bad=true;
                    System.out.println("Your last input was bad, try again");
                }
            }
        } while (operand_is_bad);
        
        
        

      
        return getConversion(input);
    }
    

    int getConversion(String numeral)
    {
    		int I = 1; 
		int V = 5;
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500; 
		int M = 1000; 
	
		numeral = numeral.toUpperCase();
		numeral = numeral.trim();
		
		int len = numeral.length();
		int total = 0;
		int i=0;
		for (i = 0; i < len; i++)
		{
			char c = numeral.charAt(i);
			if (c == 'M')
			{
				total = total + M;
			}
			else if (c == 'D')
			{
				total = total + D;
			}
			else if (c == 'C')
			{
				total = total + C;
			}
			else if (c == 'L')
			{
				total = total + L;
			}
			else if (c == 'X')
			{
				total = total + X;
			}
			else if (c == 'V')
			{
				total = total + V;
			}
			else if (c == 'I')
			{
				total = total + I;
			}
			else
			{
				total = 0;
				System.out.println("Error, enter roman numerals from I to M only");
			}
		}
		
    	return total;
    }

   
    String Convert_to_Roman(int number)
    {
    	// how many M?
    	int number_of_M;
    	int remainderM;
    	String roman = "";
    	number_of_M = number/1000;
    	remainderM = number%1000;
 
    	for (int i = 1; i <= number_of_M; i++)
    	{
    		roman = roman + "M";
    	}
    	
    	// how many D?
    	int number_of_D;
    	int remainderD;
    
    	number_of_D = remainderM/500;
    	remainderD = remainderM%500;
    	for (int i = 1; i <= number_of_D; i++)
    	{
    		roman = roman + "D";
    	}
    	
    	// how many C?
    	int number_of_C;
    	int remainderC;
    	
    	number_of_C = remainderD/100;
    	remainderC = remainderD%100;
    	for (int i =1; i <= number_of_C; i++)
    	{
    		roman = roman + "C";
    	}
    	
    	// how many L
    	int number_of_L;
    	int remainderL;
    	
    	number_of_L = remainderC/50;
    	remainderL = remainderC%50;
    	for(int i =1; i<= number_of_L; i++)
    	{
    		roman = roman + "L";
    	}
    	
    	//how many X
    	int number_of_X;
    	int remainderX;
    	
    	number_of_X = remainderL/10;
    	remainderX= remainderL%10;
    	for (int i=1; i <= number_of_X; i++)
    	{
    		roman = roman + "X";
    	
    	}
    	
    	//how many V
    	int number_of_V;
    	int remainderV;
    	
    	number_of_V = remainderX/5;
    	remainderV = remainderX%5;
    	for (int i = 1; i<= number_of_V; i++)
    	{
    		roman = roman + "V";
    	}
    	

    	
    	int number_of_I;
    	int remainderI; 
    	
    	number_of_I = remainderV/1;
    	remainderI = remainderV/1;
    	for (int i = 1; i<=number_of_I; i++)
    	{
    		roman = roman + "I";
    	
    	}
    
    	return roman;
    }
    
  
    int doArithmetic(char operator, int operand1, int operand2)
    {
        int answer;
        switch(operator)
        {
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
            System.out.println("We shouldn't get here in doArithmentic!!!!");
            answer = -1;
            break;
        }
        return answer;
    }

    void format(char operator, String operand1, String operand2, String answer)
    {   
        System.out.println(operand1 + " "+ operator + " "+ operand2 + " = "+ answer);
    }

   
    public static void main(String[] args)
    {
    
        Roman_Calculator RC = new Roman_Calculator();
        
      
        while (RC.doCalculation())
        {
           System.out.println("=======================");           
        } 
        
        System.out.println("Finished Calculations");
        
        int number;
        number = RC.getConversion("	Mccxxvi");
        System.out.println("the conversion is: " +number);
        
        RC.Convert_to_Roman(3623);
        
    }

}
