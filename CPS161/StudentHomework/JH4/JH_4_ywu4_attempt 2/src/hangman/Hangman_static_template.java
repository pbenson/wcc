package hangman;

import java.util.*;
public class Hangman_static_template
{
	static Scanner keyboard = new Scanner(System.in); 
	static Random rand = new Random();
	// The following routine will determine if the character c
	// is inside the String str. A true is returned if it is inside.
	// It is very useful to call the isIn routine inside of printCurrStatus
	//...
	// See the comments in the Hint for printCurrStatus.
	static boolean isIn(char c, String str)
	{
		boolean find=false;
		char [] strArray=str.toCharArray();
		for(int i=0;i<strArray.length;i++)
		{
			if(c==strArray[i])
			{
				find=true;
			}
		}
		return find;
		
		//********** Fill in Details
	}
	// ******   printCurrStatus
	// If userInputs contains "ard"
	// the following routine prints
	//
	// Current Status for userInpts=ard
	// a a r d _ a r _
	// This routine returns true if all false is returned.
	// strToGuess contains "aardvark" then
	//an output that looks something like:
	//letters were guessed, otherwise
    //and out
		// HINT: It is useful to have a for loop that goes through each of the characters in
		// strToGuess. Call isIn for each character (note the second parameter would
		// be userInputs). If isIn returns true, just print out the character, if isIn
		//         returns false, then print out  '_'.
		//         Additionally, you can have a variable like:
		//         boolean success = true;
		// Whenever you output at least one '_', you can set success = false.
		// Your code can just return the variable "success" and it will return true if
		//         the user has picked all of the letters.
		static boolean printCurrStatus(String strToGuess, String userInputs) 
		{
			boolean absoluteRight=false;
			char[] printChar=strToGuess.toCharArray();
			for(int i=0;i<printChar.length;i++)
			{
				printChar[i]='_';
			}
			
			for(int i=0;i<strToGuess.length();i++)
			{
				char eachCorrectChar=strToGuess.charAt(i);
				for(int j=0;j<userInputs.length();j++)
				{
					char eachGuessChar=userInputs.charAt(j);
					if (eachGuessChar==eachCorrectChar)
					{
						printChar[i]=eachGuessChar;
					}
//					boolean hasIt=false;
//					hasIt=isIn(userInputs.charAt(j),strToGuess);
//					if(hasIt==true)
//					{
//						printChar[i]=userInputs.charAt(j);
//					}
				}
			}
			
			
			boolean noUnderscore=true;
			for(int i=0;i<printChar.length;i++)
			{
				if(printChar[i]=='_')
				{
					noUnderscore=false;
				}
			}
			
			if(noUnderscore==true)
			{
				absoluteRight=true;
				System.out.println("Congratulations: you guessed the word!");
			}
			
			System.out.println("Current Status for userInputs:");
			for(int i=0;i<printChar.length;i++)
			{
				System.out.print(printChar[i]);
			}
			System.out.println();
			return absoluteRight;
			
		//********** Fill in Details
		}
	// The following routine will return a random String from the list of words:
	// elephant, tiger, monkey,
	// porcupine, aardvark
	static String getNextWordToGuess()
	{
		final int num_words=10;
		String correctWord="";
		String []words= {"elephant", "tiger", "monkey","porcupine", "aardvark","baboon",
				"barbeque", "giraffe", "simple", "zebra"};
		// change this if you have a different number
		//of words
		int num = rand.nextInt(num_words);
		correctWord=words[num];
		return correctWord;
		// Another way to accomplish the same thing: // int num = (int)(num_words* Math.random());
		//********** Fill in Details
	}
	// The following routine plays the hangman game. It calls getNextWordToGuess to
	// get the word that should be guessed. It then has a loop which outputs the
	// following prompt:
	// Enter next letter
	//
	// A String named userInputs stores all letters selected already.
	// Then the routine printCurrStatus is called to print out the curren status of
	// the guessed word. If printCurrStatus returns true, we are done.
	static void playGame()
	{
		String rightWord=getNextWordToGuess();
		String currentGuess="";
		do
		{
			System.out.println("Enter next letter:");
			char eachTimeLetter=keyboard.next().charAt(0);
			currentGuess=currentGuess+eachTimeLetter;
		}while(printCurrStatus(rightWord,currentGuess)!=true);
		//********** Fill in Details
	}
	// main will call playGame to play the hangman game.
	// Then main will issue the prompt:
	// Do you want to play again (y or n)
	// If the answer is "y", then call playGame again, otherwise exit
	public static void main(String[] args)
	{
		Hangman_object_template hangman = new Hangman_object_template();
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