package primative_variables;
import java.util.Scanner;

public class PrimativeVariables
{
    public static void main(String[] args) {
        double num1;   
        double num2;   
        double answer; 
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = keyboard.nextDouble();
        System.out.println("Enter second number:");
        num2 = keyboard.nextDouble();
        answer = num1 + num2;  
        System.out.println("The answer ="+ answer);
        
        keyboard.close();
    }
}