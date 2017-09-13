package averager;
import java.text.MessageFormat;
import java.util.Scanner;
import util.Util;

public class Averager
{
	public static final int ITERATIONS = 3;
	
	/**
	 * Takes the average of numbers given by the user.
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double[] numbers = new double[ITERATIONS];
		double average = 0;
		for(int i = 0; i<ITERATIONS; i++)
		{
			numbers[i] = Util.readDouble(scanner, "Number " + (i+1) + ": ");
			average +=  numbers[i] / ITERATIONS;
		}
		
		String output = MessageFormat.format("The average of {0} is {1}", Util.listArray(numbers), average);
		System.out.println(output);
		
		scanner.close();
	}
}
