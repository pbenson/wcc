package primitive_variables;
import java.util.Scanner;
import util.Util;

public class PrimativeVariables
{
	/**
	 * Reads two numbers from stdin and outputs their sum.
	 */
	public static void main()
	{
		System.out.println("Enter two numbers to sum.");
		
		Scanner scanner = new Scanner(System.in);
		double num1 = Util.readDouble(scanner, "Number 1: ");
		double num2 = Util.readDouble(scanner, "Number 2: ");
		double answer = num1 + num2;
		
		System.out.println("The answer is " + answer);
		
		scanner.close();
	}
}
