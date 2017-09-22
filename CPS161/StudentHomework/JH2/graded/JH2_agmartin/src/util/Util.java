package util;

import java.util.Scanner;

public class Util
{
	private static String[] truthyValues = {"y", "yes", "yep",  "true",  "1", "sure"};
	private static String[] falseyValues = {"n", "no",  "nope", "false", "0", "nah"};
		
	/**
	 * Prompts the user for a boolean
	 * 
	 * @param scanner Scanner object to use.
	 * @param prompt Prompt to show the user.
	 * @return A boolean from the user.
	 */
	public static boolean readBool(Scanner scanner, String prompt)
	{
		System.out.print(prompt);
		String input = "";
		while(input.length()<1)
		{
			input = scanner.nextLine().toLowerCase();
		}
		if(inArray(input, truthyValues)) return true;
		else if(inArray(input, falseyValues)) return false;
		else
		{
			prompt = "\"" + input + "\" is not valid. Type 'y' or 'n'.";
			return readBool(scanner, prompt);
		}
	}
	
	/**
	 * Checks if the input string is in the array.
	 * 
	 * @param input Input string to search for.
	 * @param array Array to search through.
	 * @return True if found, false if not.
	 */
	public static boolean inArray(String input, String[] array)
	{
		for(int i=0; i<array.length; i++) if(array[i].equals(input)) return true;
		return false;
	}
	
	/**
	 * Prompts the user for a double
	 * 
	 * @param scanner An existing scanner object to use.
	 * @param prompt Prompt to show the user
	 * @return A double from the user
	 */
	public static double readDouble(Scanner scanner, String prompt)
	{
		double result;
		try
		{
			System.out.print(prompt);
			result = scanner.nextDouble();
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("\"" + scanner.nextLine() + "\" is not a number. Enter a number.");
			result = readDouble(scanner, prompt);
		}
		return result;
	}
	
	/**
	 * Prompts the user for a double
	 * 
	 * @param prompt Prompt to show the user
	 * @return A double from the user
	 */
	public static double readDouble(String prompt)
	{
		Scanner scanner = new Scanner(System.in);
		double result = readDouble(scanner, prompt);
		scanner.close();
		return result;
	}
	
	/**
	 * Prompts the user for a double
	 * 
	 * @param scanner An existing scanner object to use.
	 * @return A double from the user
	 */
	public static double readDouble(Scanner scanner)
	{
		return readDouble(scanner, "$ ");
	}
	
	/**
	 * Prompts the user for an int
	 * 
	 * @param scanner An existing scanner object to use.
	 * @param prompt Prompt to show the user
	 * @return An int from the user
	 */
	public static int readInt(Scanner scanner, String prompt)
	{
		int result;
		try
		{
			System.out.print(prompt);
			result = scanner.nextInt();
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("\"" + scanner.nextLine() + "\" is not a int. Enter a integer.");
			result = readInt(scanner, prompt);
		}
		return result;
	}
	
	/**
	 * Prompts the user for an int
	 * 
	 * @param prompt Prompt to show the user
	 * @return An int from the user
	 */
	public static int readInt(String prompt)
	{
		Scanner scanner = new Scanner(System.in);
		int result = readInt(scanner, prompt);
		scanner.close();
		return result;
	}
	
	/**
	 * Prompts the user for an int
	 * 
	 * @param scanner An existing scanner object to use.
	 * @return An int from the user
	 */
	public static int readInt(Scanner scanner)
	{
		return readInt(scanner, "$ ");
	}
	
	/**
	 * Converts an array to a string in a more natural way.
	 * 
	 * @param numbers The array to convert.
	 * @return A string listing the numbers of the array.
	 */
	public static String listArray(double[] numbers)
	{
		String result = "";
		for(int i = 0; i<numbers.length; i++)
		{
			if(numbers[i] % 1 == 0)
			{
				result += (int) numbers[i];
			}
			else
			{
				result += numbers[i];
			}
			if(i != numbers.length-1)
			{
				result += ", ";
			}
			if(i == numbers.length-2)
			{
				result += "and ";
			}
		}
		return result;
	}
}
