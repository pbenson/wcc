package gas_mileage;
import java.text.MessageFormat;
import java.util.Scanner;
import util.Util;

public class GasMileage
{
	/**
	 * Prompts the user for miles driven and gallons consumed and prints the MPG.
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double dist = Util.readDouble(scanner, "Miles Driven: ");
		double fuel = Util.readDouble(scanner, "Gallons of Gas Consumed: ");
		double mpg = dist/fuel;
		
		String output = MessageFormat.format("Your vehicle has a fuel economy of {0} MPG", mpg);
		System.out.println(output);
		
		scanner.close();
	}
}
