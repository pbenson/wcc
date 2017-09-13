package gas_milage;

import java.util.Scanner;

public class gasMilage 
{
    public static void main(String[] args) 
    {
        int num1;   
        double num2;   
        double answer; 
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter distance traveled:");
        num1 = keyboard.nextInt();
        System.out.println("Enter gallons consumed:");
        num2 = keyboard.nextDouble();
        answer = num1 / num2;  
        System.out.println("The miles per gallon is =" + answer);
    }
}