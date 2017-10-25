package roman_calculator;
import java.util.Scanner;
public class Roman_Calculator 
{
	Scanner scan = new Scanner(System.in);
	boolean doCalculation()
	{String operand1;
	String operand2;
	int answer;
	char operator = getOperator();
	if (operator == 'q')
		return false;
	operand1 = getOperand("1");
	operand2 = getOperand("2");
	answer = doArithmetic(operator, operand1, operand2);
	String roman = arabic_conversion(answer);
	System.out.println ("Answer = " +roman);
	return true;
	}
	char getOperator() {
		char operator='q';
		boolean operator_is_good=false;
		do{
			System.out.print("Enter an Operator: + - * / q for quit: ");
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
		}
		while (!operator_is_good);
		return operator;
	}
	String getOperand(String which)
	{
		String input;
		boolean operand_is_bad;
		do
		{System.out.println("Enter operand "+which);
		operand_is_bad=false;
		input = scan.nextLine();
		input = input.trim();
		input = input.toUpperCase();
		if (input.length() == 0) {
			System.out.println("Your last input was bad, try again");			
			operand_is_bad=true;
			continue;}
		for (char i=0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			if (c < 'Z' && c > 'A' )
			{
			}
		}
		}
		while (operand_is_bad);
		return input;
	}
	int roman_conversion (String input)
	{int count=0;
	for (char i=0; i < input.length(); i++) {
		char r = input.charAt(i);
		{
			if (r == 'I')
				count = count + 1;
			if (r == 'V')
				count = count + 5;
			if (r == 'X')
				count = count + 10;
			if (r == 'L')
				count = count + 50;
			if (r == 'C')
				count = count + 100;
			if (r == 'D')
				count = count + 500;
			if (r == 'M')
				count = count + 1000;
		}
	}
	return count;}
	int doArithmetic(char operator, String operand1, String operand2)
	{
		int converted_operand1 = roman_conversion(operand1);
		int converted_operand2 = roman_conversion(operand2);
		int answer;
		switch(operator)
		{case '+':
			answer = converted_operand1 + converted_operand2;
			break;
		case '-':
			answer = converted_operand1 - converted_operand2;
			break;
		case '*':
			answer = converted_operand1 * converted_operand2;
			break;
		case '/':
			answer = converted_operand1 / converted_operand2;
			break;
		default:
			System.out.println("We shouldn't get here in doArithmentic!!!!");
			answer = -1;
			break;
		}
		return answer;
	}
	String arabic_conversion(int number) {
		String roman="";

		{
			while(number>=1000){
				roman += "M";
				number-=1000;
			}

			while(number>=900){
				roman += "CM";
				number-=900;
			}

			while(number>=500){
				roman += "D";
				number-=500;
			}

			while(number>=400){
				roman += "CD";
				number-=400;
			}

			while(number>=100){
				roman += "C";
				number-=100;
			}

			while(number>=90){
				roman += "XC";
				number-=90;
			}

			while(number>=50){
				roman += "L";
				number-=50;
			}

			while(number>=40){
				roman += "XL";
				number-=40;
			}

			while(number>=10){
				roman += "X";
				number-=10;
			}

			while(number>=9){
				roman += "IX";
				number-=9;
			}

			while(number>=5){
				roman += "V";
				number-=5;
			}

			while(number>=4){
				roman += "IV";
				number-=4;
			}

			while(number>=1){
				roman += "I";
				number-=1;
			}
			return roman;
		}
	}
	public static void main(String[] args)
	{
		Roman_Calculator rc = new Roman_Calculator();
		while (rc.doCalculation()) {
			System.out.println("=======================");
		}
		System.out.println("Finished Roman Computation");

	}
}