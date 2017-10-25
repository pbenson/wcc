package object_oriented;
import java.util.*;
public class Hangman 
{
	String[] words = {"elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "simple", "zebra", "porcupine", "aardvark"};
	public Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();	
	boolean isIn(char c, String str) 
	{			
		for (int i=0; i < str.length(); i++) 
		{
			if (c == str.charAt(i))
				return true;
		}
		return false; 
	}
	String getNextWordToGuess() 
	{
		final int num_words=10;
		int num = rand.nextInt(num_words);
		String word = words[num];
		return word;
	}
	boolean printCurrStatus(String word, String userInputs)
	{boolean success = true;
	for (int i = 0; i < word.length(); i++) 
	{
		char c = word.charAt(i);
		if  (isIn(c, userInputs))
			System.out.print(c);
		else
		{System.out.print(" _ ");
		success = false;}
	}System.out.println("");
	return success;
	}
	public void playGame() 
	{ boolean status;
	String userInputs="";
	String word = getNextWordToGuess();
	do
	{
		System.out.println("Enter next letter.");
		userInputs += keyboard.nextLine();
		status = printCurrStatus(word, userInputs);
	}
	while (!status);
	}
	public static void main(String[] args)
	{
		Hangman hangman = new Hangman();
		String response="";
		do
		{
			hangman.playGame();
			System.out.print("Do you want to play object oriented Hangman again? (y or n): ");
			response = hangman.keyboard.next();
		} while (response.charAt(0) == 'y');
		System.out.println("Bye");
	}
}