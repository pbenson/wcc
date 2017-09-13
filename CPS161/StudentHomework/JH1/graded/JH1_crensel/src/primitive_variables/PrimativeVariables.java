package primitive_variables;

import java.util.Scanner;

public class PrimativeVariables {
	
	public static void main(String[] args) {
		// Local variable declarations
        double num1;
        double num2;
        double answer;
        
        // Accept input and assign to local variables
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = keyboard.nextDouble();
        System.out.println("Enter second number");
        num2 = keyboard.nextDouble();
        
        // Multiply, divide, modulus operations
        answer = num1  * num2;                
        System.out.println("The answer for multiply is " + answer);
        answer = num1 / num2;
        System.out.println("The answer for divide is " + answer);
        answer = num1 % num2;
        System.out.println("The answer for % is "+ answer);
    }
	
}