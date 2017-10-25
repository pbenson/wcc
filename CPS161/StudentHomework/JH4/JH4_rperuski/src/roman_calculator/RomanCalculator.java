package roman_calculator;
import java.util.Scanner;


public class RomanCalculator {
	private int answer=0;
	Scanner input = new Scanner(System.in);
	String num1="";
	String num2="";
	boolean checkNum=false;
	
	
	boolean keepCalculating() {
		
		char operator = getOperator();
		if (operator == 'q') {
			return false;
		} else {
			String num1=getNumOne();
			String num2 = getNumTwo();
			
			int firstNum = romanToNumeral(num1);
			int secondNum = romanToNumeral(num2);
			
			calculate(firstNum, secondNum, operator);
			printAnswer(num1, num2, operator, answer);
			
		
			return true;
		}
		
	}
	
	 char getOperator() {
	
			 char operator='q';
			 boolean operator_is_good=false;

			 do
			 {
				 System.out.print("Enter an Operator: + - * / q for quit: ");

				 String strOperator = input.nextLine();
				 strOperator = strOperator.trim();
				 if (strOperator.length() == 0)
					 continue; 
				 
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
	
	public String getNumOne() {
		
		 do {
			System.out.println("Please enter Roman Numeral number one: ");
			num1= input.nextLine();
			num1=num1.trim();
			num1=num1.toUpperCase();
			checkNumeral(num1);
		} while (checkNum==false);
		

		return num1;
		
	};
	
	public String getNumTwo() {
		
		do {
		System.out.println("Please enter Roman Numeral number two: ");
		num2= input.nextLine();
		num2=num2.trim();
		num2=num2.toUpperCase();
		checkNumeral(num2);
		} while (checkNum==false);
		
		return num2;
	};
	
	void checkNumeral(String romanNum) {
		for (int i = 0; i<romanNum.length(); i++) {
			if(romanNum.charAt(i) == 'M' || romanNum.charAt(i) == 'D' || romanNum.charAt(i) == 'C' || romanNum.charAt(i) == 'L' ||
					romanNum.charAt(i) == 'X' || romanNum.charAt(i) == 'V' || romanNum.charAt(i) == 'I') {
				checkNum=true;
				
				
			} else {
				
				System.out.println("Sorry, you must have gotten your Romans wrong. Try again.");
				checkNum=false;
				
			
			}
		}
		
		
		
	}
	
	public int romanToNumeral(String romanNumber) {
		int total=0;

		  for (int i=0; i<romanNumber.length(); i++) {
		    switch(romanNumber.charAt(i)){
		    case 'I':
		      total++;
		      break;
		    case 'V':
		      total+=5;
		      break;
		    case 'X':
		      total+=10;
		      break;
		    case 'L':
		      total+=50;
		      break;
		    case 'C':
		      total+=100;
		       break;
		    case 'D':
		      total+=500;
		       break;
		    case 'M':
		      total+=1000;
		       break;
		    default:
		    		System.out.println("Invalid entry");
		    		break;
		    }
		    
		  }
		  return total;
	}
	
	public int calculate(int num1, int num2, char operator) {
		switch(operator) {
		 case '+':
			 answer= num1 + num2;
			 break;
		 case '-':
			 answer= num1 - num2;
			 break;
		 case '*':
			 answer= num1 * num2;
			 break;
		 case '/':
			 answer= num1 / num2;
			 break;
		 default:
			 System.out.println("Dude, how'd you find my non-number?");	
		
		}
		return answer;
	}
	
	public void printAnswer(String number1, String number2, char operator, int answ) {
		System.out.println(number1 + " "  + operator + " " + number2 + "= " + answ);
	}
	
	


}


