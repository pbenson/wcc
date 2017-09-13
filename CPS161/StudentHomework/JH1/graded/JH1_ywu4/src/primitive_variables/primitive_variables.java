package primitive_variables;
//HW #1  primitive_variables queston
//YIFAN WU
//@00619375
import java.util.Scanner;

public class primitive_variables {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double answer;
       
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter first number");
       
         num1= keyboard.nextDouble();
       System.out.println("Enter second number");
       
         num2 =keyboard.nextDouble();
       
       //basic operator: +/-/*//
       
       answer= num1 + num2;
       System.out.println("The answer is for addition is " + answer);
       
       answer= num1 - num2;
       System.out.println("The answer is for substraction is " + answer);
       
       answer= num1 * num2; 
       //equal sign is replace, take that result
       System.out.println("The answer is for multiply is " + answer);
       /*be aware of the string + number, they are two different
         types of data. got charater and numeric
        */
       answer= num1/num2;
       System.out.println("The answer is for divide is "+ answer);
       
       answer= num1 % num2;
       //% is the remainder operator
       System.out.println("The answer is for % is " + answer);
       
       
	}

}
