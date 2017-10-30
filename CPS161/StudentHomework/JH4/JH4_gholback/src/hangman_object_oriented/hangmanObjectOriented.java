package hangman_object_oriented;
import java.util.*;
public class hangmanObjectOriented
{
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();
	String SaveLetters = "";

	// The following routine will determine if the character c
	// is inside the String str. A true is returned if it is inside.
	// It is very useful to call the isIn routine inside of printCurrStatus ...
	// See the comments in the Hint for printCurrStatus.

	boolean isIn(char c, String str)
	{

		boolean operand_is_bad;
		do {
			operand_is_bad=false;

			String word = str.toLowerCase();

			if (word.length() == 0)
				operand_is_bad=true;
			for (int i=0; i < word.length(); i++)
			{
				int Character = str.charAt(i);

				if (Character == c) {
					return true;
				}
			}
		} while (operand_is_bad);
		return false;
		//********** Fill in Details
	}

	// ****** printCurrStatus
	// If userInputs contains "ard" and strToGuess contains "aardvark" then
	// the following routine prints out an output that looks something like:
	//
	// Current Status for userInpts=ard
	// a a r d _ a r _

	// This routine returns true if all letters were guessed, otherwise false is returned.
	// HINT: It is useful to have a for loop that goes through each of the characters in
	// strToGuess. Call isIn for each character (note the second parameter would
	// be userInputs). If isIn returns true, just print out the character, if isIn
	// returns false, then print out '_'.
	// Additionally, you can have a variable like:
	// boolean success = true;
	// Whenever you output at least one '_', you can set success = false.
	// Your code can just return the variable "success" and it will return true if
	// the user has picked all of the letters.



	boolean printCurrStatus(String strToGuess, String userInputs)
	{


		String Print = "";
		int FailCount = 0;
		userInputs = SaveLetters+userInputs;
		boolean operand_is_bad;
		do {
			FailCount = 0;
			operand_is_bad=false;

			for (int i=0; i < strToGuess.length(); i++)
			{
				if (isIn(strToGuess.charAt(i), userInputs) == true) {
					Print = Print+strToGuess.charAt(i)+" ";
					SaveLetters = SaveLetters+strToGuess.charAt(i);
				} else {
					Print = Print+"_ ";
					FailCount++;
				}
			}

			System.out.println(Print);

		
		} while (operand_is_bad);
		
		if (FailCount > 0) {
			return false;
		}
		else {
			return true;
		}
		
		//********** Fill in Details
	}

	// The following routine will return a random String from the list of words:
	// elephant, tiger, monkey, baboon, barbeque, giraffe, simple, zebra,
	// porcupine, aardvark

	String getNextWordToGuess()
	{
		final int num_words=10; // change this if you have a different number of words
		int num = rand.nextInt(num_words);
		switch (num) {
		case 1: return "elephant";
		case 2: return "tiger";
		case 3: return "monkey";
		case 4: return "baboon";
		case 5: return "barbeque";
		case 6:	return "giraffe";
		case 7: return "simple";
		case 8: return "zebra";
		case 9: return "porcupine";
		case 10: return "aardvark";
		}
		// Another way to accomplish the same thing:
		// int num = (int)(num_words* Math.random());
		//********** Fill in Details
		return null;
	}

	// The following routine plays the hangman game. It calls getNextWordToGuess to
	// get the word that should be guessed. It then has a loop which outputs the
	// following prompt:
	// Enter next letter
	//
	// A String named userInputs stores all letters selected already.
	// Then the routine printCurrStatus is called to print out the current status of
	// the guessed word. If printCurrStatus returns true, we are done.

	void playGame()
	{
		String word = getNextWordToGuess();
		System.out.println("Alright, I've got a word!");
		boolean run = true;
		String savedLetters = "";
		do{
			run = false;
			System.out.println("Guess a letter: ");
			String input = keyboard.next();
			input = input.trim();
			input = input.toLowerCase();

			boolean Curr = printCurrStatus(word,input);
			Curr = false;
			if (Curr = true) {
				run = false;				
			}
			else {
				run = true;
			}


		} while (run = true);
	}
	// main will call playGame to play the hangman game.
	// Then main will issue the prompt:
	// Do you want to play again (y or n)
	// If the answer is "y", then call playGame again, otherwise exit

	public static void main(String[] args)
	{
		hangmanObjectOriented hangman = new hangmanObjectOriented();

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