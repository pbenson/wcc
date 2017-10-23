package static_approach;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import util.Util;

public class Hangman {
	public static Scanner keyboard = new Scanner(System.in);
	public static Random rand = new Random();
	public static String[] words = readWords();
	
	public static String[] readWords()
	{
		final String[] requiredWords = {"elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "simple", "zebra", "porcupine", "aardvark"};
		try
		{
			List<String> wordList = Files.readAllLines(Paths.get("wordlist.txt"), StandardCharsets.UTF_8);
			for(String word : requiredWords)
			{
				wordList.add(word);
			}
			String[] wordArray = new String[wordList.size()];
			wordArray = wordList.toArray(wordArray);
			return wordArray;

		} catch (IOException e)
		{
			//Backup if we can't read file.
			System.out.println("Could not read wordlist");
			return requiredWords;
		}
	}

	// The following routine will determine if the character c
	// is inside the String str. A true is returned if it is inside.
	// It is very useful to call the isIn routine inside of printCurrStatus
	// See the comments in the Hint for printCurrStatus.
	public static boolean isIn(char c, String str)
	{
		for(char currentChar : str.toCharArray()) if(currentChar == c) return true;
		return false;
	}

	// ****** printCurrStatus
	// If userInputs contains "ard" and strToGuess contains "aardvark" then
	// the following routine prints out an output that looks something like:
	//
	// Current Status for userInpts=ard
	// a a r d _ a r _

	// This routine returns true if all letters were guessed, otherwise false is
	// returned.
	// HINT: It is useful to have a for loop that goes through each of the
	// characters in
	// strToGuess. Call isIn for each character (note the second parameter would
	// be userInputs). If isIn returns true, just print out the character,if isIn
	// returns false, then print out '_'.
	// Additionally, you can have a variable like:
	// boolean success = true;
	// Whenever you output at least one '_', you can set success = false.
	// Your code can just return the variable "success" and it will return true if
	// the user has picked all of the letters.

	public static boolean printCurrStatus(String strToGuess, String userInputs)
	{
		char[] userChars = userInputs.toCharArray();
		String outputString = "";
		boolean finished = true;
		for(char currentChar : strToGuess.toCharArray())
		{
			boolean currentFound = false;
			for(char inputChar : userChars)
			{
				if(inputChar == currentChar)
				{
					currentFound = true;
					break;
				}
			}
			if(currentFound) outputString += currentChar + " ";
			else
			{
				outputString += "_ ";
				finished = false;
			}
		}
		System.out.println(outputString);
		return finished;
	}

	// The following routine will return a random String from the list of words:
	// 

	public static String getNextWordToGuess()
	{
		int num = rand.nextInt(words.length);
		return words[num];
	}

	// The following routine plays the hangman game. It calls getNextWordToGuess to
	// get the word that should be guessed. It then has a loop which outputs the
	// following prompt:
	// Enter next letter
	//
	// A String named userInputs stores all letters selected already.
	// Then the routine printCurrStatus is called to print out the current status of
	// the guessed word. If printCurrStatus returns true, we are done.

	public static void playGame()
	{
		String word = getNextWordToGuess();
		String guessed = "";
		printCurrStatus(word, guessed);
		do
		{
			guessed += Util.readChar(keyboard, "Enter your guess: ");
		} while(!printCurrStatus(word, guessed));
	}
	// main will call playGame to play the hangman game.
	// Then main will issue the prompt:
	// Do you want to play again (y or n)
	// If the answer is "y", then call playGame again, otherwise exit

	public static void main(String[] args) 
	{
		boolean continuePlaying = true;
		while(continuePlaying)
		{
			playGame();
			continuePlaying = Util.readBool(keyboard, "Do you want to play static Hangman again? (y or n): ");
		}
		System.out.println("Bye");
	}
}