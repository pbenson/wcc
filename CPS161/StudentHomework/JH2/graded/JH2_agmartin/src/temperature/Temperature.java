package temperature;
import java.text.MessageFormat;
import java.util.Scanner;

import util.Util;

public class Temperature
{	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int loops = 0;
		double total = 0;
		while(true)
		{
			double temp = Util.readDouble(scanner, "Enter a temp in Celsius or <= -100 to quit: ");
			if(temp > -100)
			{
				String output = MessageFormat.format("Temperature: {0}°F {1}°C.", celsiusToFahrenheit(temp), temp);
				System.out.println(output);
				total += temp;
				loops++;
			}
			else break;
		}
		double average = total/loops;
		String output = MessageFormat.format("Average Temperature: {0}°F {1}°C.", celsiusToFahrenheit(average), average);
		System.out.println(output);
	}
	
	/**
	 * Converts a temperature in Celsius to Fahrenheit.
	 * 
	 * @param temp The temperature in Celsius.
	 * @return The temperature in Fahrenheit.
	 */
	public static double celsiusToFahrenheit(double temp)
	{
		return (9.0/5.0) * temp + 32;
	}
	
	/**
	 * Converts a temperature in Fahrenheit to Celsius.
	 * 
	 * @param temp The temperature in Fahrenheit.
	 * @return The temperature in Celsius.
	 */
	public static double fahrenheitToCelsius(double temp)
	{
		return (temp-32) * (5.0/9.0);
	}
}
