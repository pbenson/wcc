package jar;
import java.text.MessageFormat;
import java.util.Scanner;
import util.Util;

public class Jar
{
	
	/**
	 * Prompts the user for the number of each type of coin in the jar, then displays their total value.
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of each type of coin in the jar.");
		
		int totalValue = 0;
		for(Coin coin : Currency.US.getCoins())
		{
			String prompt = "Enter the number of " + coin.getPlural() + ": ";
			coin.add(Util.readInt(scanner, prompt));
			totalValue += coin.getTotalValue();
		}
		
		String output;
		if(totalValue < 100) output = MessageFormat.format("The jar contains {0} {1}.", totalValue, Currency.US.getUnit());
		else output = MessageFormat.format("The jar cointains {1}{0}.", totalValue/100.0, Currency.US.getSymbol());
		System.out.println(output);
		
		scanner.close();
	}
}