package object_oriented;

import java.util.*;

public class Hangman {
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();

	// The following routine will determine if the character c
	// is inside the String str. A true is returned if it is inside.
	// It is very useful to call the isIn routine inside of printCurrStatus
	// ...
	// See the comments in the Hint for printCurrStatus.

	boolean isIn(char c, String str) {
		// ********** Fill in Details
		if (str.length() == 0) {
			return false;
		}

		boolean found = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				found = true;
				break;
			}

		}
		return found;
	}

	// ****** printCurrStatus
	// If userInputs contains "ard" and strToGuess contains "aardvark" then
	// the following routine prints out an output that looks something like:
	//
	// Current Status for userInpts=ard
	// a a r d _ a r _

	// This routine returns true if all letters were guessed, otherwise
	// false is returned.
	// HINT: It is useful to have a for loop that goes through each of the
	// characters in
	// strToGuess. Call isIn for each character (note the second
	// parameter would
	// be userInputs). If isIn returns true, just print out the character,if isIn
	// returns false, then print out '_'.
	// Additionally, you can have a variable like:
	// boolean success = true;
	// Whenever you output at least one '_', you can set success = false.
	// Your code can just return the variable "success" and it will return true if
	// the user has picked all of the letters.

	boolean printCurrStatus(String strToGuess, String userInputs) {
		// ********** Fill in Details
		
				

		boolean success = true;		
		
		for( int i = 0; i < strToGuess.length(); i++)
		{
			if(isIn(strToGuess.charAt(i), userInputs))
			{
				System.out.print(strToGuess.charAt(i));
			}
			else
			{
				System.out.print(" " + '_' + " ");
				success = false;
			}
		}
		System.out.println();
		return success;
		
	}

	// The following routine will return a random String from the list of words:
	// elephant, tiger, monkey, baboon, barbeque, giraffe, simple, zebra,
	// porcupine, aardvark

	String getNextWordToGuess() {
		final String[] words = { "elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "zebra",
				"porcupine", "aardvark", "simple"};
		final int num_words = words.length;
		int num = rand.nextInt(num_words);

		// Another way to accomplish the same thing:
		// int num = (int)(num_words* Math.random());
		// ********** Fill in Details

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

	void playGame() {
		// ********** Fill in Details
		boolean guessed = false;

		String strToGuess = getNextWordToGuess();
		StringBuilder userInputs = new StringBuilder();

		do {
			System.out.println(String.format("Current Status for userInputs = %s",  userInputs.toString()));

			System.out.print("Enter next letter:");
			String cString = keyboard.nextLine();
			System.out.println();
			cString = cString.trim();
			if (cString.length() != 1) {
				System.out.println("Letter should be exact a lower case English character... continue to try.");
				continue;
			}

			char c = cString.charAt(0);

			if (c >= 'a' && c <= 'z') {
				userInputs.append(c);
				if (printCurrStatus(strToGuess, userInputs.toString())) {
					System.out.println("Congratulations: you guessed the word!!");
					guessed = true;
				}
			} else {
				System.out.println("Letter should be a lower case English character... continue to try.");
				continue;
			}
		} while (!guessed);

	}
	// main will call playGame to play the hangman game.
	// Then main will issue the prompt:
	// Do you want to play again (y or n)
	// If the answer is "y", then call playGame again, otherwise exit

	public static void main(String[] args) {
		Hangman hangman = new Hangman();

		String response = "";
		do {
			hangman.playGame();
			System.out.print("Do you want to play object oriented Hangman again? (y or n): ");
			response = hangman.keyboard.nextLine();
		} while (response.charAt(0) == 'y');

		System.out.println("Bye");
	}

}