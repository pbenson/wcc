package object_oriented;
import java.util.Random;
import java.util.Scanner;
public class Hangman3
{
	Scanner keyboard = new Scanner(System.in);
	Scanner letter = new Scanner(System.in);
	Random rand = new Random();
	String name;
	char c;
	String s;
	boolean success = true;
	String userInputs = " ";
	
	
	
	
	// The following routine will determine if the character c
	// is inside the String str.  A true is returned if it is inside.
	// It is very useful to call the isIn routine inside of printCurrStatus ...
	// Seethe comments in the Hint for printCurrStatus.
	
	
	
	boolean isIn(char c, String str)
	{
		if (str.indexOf(c)>0)
			return true;
		else
			return false;
	}
	
	
	// ******   printCurrStatus 
	
	
	
	
	
	// If userInputs contains "ard" and strToGuess contains "aardvark" then
	// the following routine prints out an output that looks something like:
	//
	// Current Status for userInpts=ard
	// a a r d _ a r _
	// This routine returns true if all letters were guessed, otherwise false is returned.
	// HINT:  It is useful to have a for loop that goes through each of the characters in
	//         strToGuess.    Call isIn for each character (note the second parameter would 
	//         be userInputs).   If isIn returns true, just print out the character, if isIn
	//returns false, then print out  '_'.  
	//         Additionally, you can have a variable like:
	//         boolean success = true;
	//         Whenever you output at least one '_', you can set success = false.  
	//         Your code can just return the variable "success" and it will return true if
					//         the user has picked all of the letters.
	
	
					
					
					boolean printCurrStatus(String strToGuess, String userInputs)
	{
						
						for(c = 0; c < strToGuess.length(); c++)
						{
						
						if (isIn(c, userInputs))
						{
							System.out.println(c);
							success = true;
						}
						else
						{
							System.out.println("_");
							success = false;
						}
						}
						return success;
	}
					
					
					
					
	// The following routine will return a random String from the list of words:
		// elephant, tiger, monkey, baboon, barbeque, giraffe,  simple, zebra, 
		// porcupine, aardvark
					
					
					
					
		String getNextWordToGuess()
	{
		/*final int num_words = 10; // change this if you have a different number of words
		int num = rand.nextInt(num_words);*/
		String[] names = { "elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "simple", "zebra", "porcupine", "aardvark"};
		name = names[(int) (Math.random() * names.length)];
		return name;
		
		
		// Another way to accomplish the same thing:
		// int num = (int)(num_words* Math.random());
		//********** Fill in Details
	}
		
		
		
		
	// The following routine plays the hangman game. It calls getNextWordToGuess to
	// get the word that should be guessed.  It then has a loop which outputs the 
	// following prompt:
	// Enter next letter
	//
	// A String named userInputs stores all letters selected already.  
	// Then the routine printCurrStatus is called to print out the current status of
	// the guessed word.  If printCurrStatus returns true, we are done.
		
		
		
	void playGame()
	{
	
		getNextWordToGuess();
		String strToGuess = name;
		do
		{
		System.out.println("Enter a letter for your next guess");
		userInputs = letter.next();
		String s = userInputs;
		// char[] a = letter.next().toCharArray();
		// char c = letter.next().charAt(0);
		System.out.println(name);
		} while (success);
		userInputs = s + userInputs;
		printCurrStatus(strToGuess, userInputs);
		
	}
	
	
	
	
	// main will call playGame to play the hangman game.
	// Then main will issue the prompt:
	// Do you want to play again (y or n)
	// If the answer is "y", then call playGame again, otherwise exit
	
	
	
	
	public static void main(String[] args)
	{
		Hangman3 hangman = new Hangman3();
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