package Average;
import java.util.Scanner;

public class Averager {
	
	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
		double answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1 = keyboard.nextDouble();
		
		System.out.println("Enter second number: ");
		num2 = keyboard.nextDouble();
		
		System.out.println("Enter third number: ");
		num3 = keyboard.nextDouble();
		
		answer = (num1 + num2 + num3)/3;
		
		System.out.printf("The average is %.2f", answer);
	
		
	}
	
	
}
