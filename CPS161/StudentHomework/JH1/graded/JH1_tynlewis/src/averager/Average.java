package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
	int num1;
	int num2;
	int num3;
	int answer;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("What is the first number?");
	num1 = keyboard.nextInt();
	
	System.out.println("What is the second number?");
	num2 = keyboard.nextInt();
	
	System.out.println("What is the third number?");
	num3 = keyboard.nextInt();
	
	answer = (num1 + num2 + num3) / 3;
	
	System.out.println("The average of numbers " + num1 + ", " + num2 + " and " + num3 + " is " + answer + ".");
			
	}

}
