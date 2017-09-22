package factorial;
import java.text.MessageFormat;
import java.util.Scanner;
import util.Util;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			long i = Util.readInt(scanner, "Enter N: ");
			String output = MessageFormat.format("{0}! = {1}", i, factorial(i));
			System.out.println(output);
			
			if(!Util.readBool(scanner, "Do you want to continue? (y/n): ")) break;
			else System.out.println();
		}
		System.out.println("Bye!");
	}
	
	/**
	 * Finds n!
	 * 
	 * @param n Number to find the factorial of.
	 * @return n!
	 */
	public static long factorial(long n)
	{
		if(n <= 0) return 1;
		else return n*factorial(n-1);
	}
}
