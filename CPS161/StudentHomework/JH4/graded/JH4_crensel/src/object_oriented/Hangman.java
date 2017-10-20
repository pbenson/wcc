package object_oriented;

import java.util.*;

public class Hangman {
	private Scanner keyboard = new Scanner(System.in);
	private Random rand = new Random(System.currentTimeMillis());

	// The following routine will determine if the character c
	// is inside the String str. A true is returned if it is inside.
	// It is very useful to call the isIn routine inside of printCurrStatus ...
	// Seethe comments in the Hint for printCurrStatus.
	private boolean isIn(char c, String str) {
		// ********** Fill in Details
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == c)
				return true;
		}
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
	// be userInputs). If isIn returns true, just print out the character, if isIn
	// returns false, then print out '_'.
	// Additionally, you can have a variable like:
	// boolean success = true;
	// Whenever you output at least one '_', you can set success = false.
	// Your code can just return the variable "success" and it will return true if

	// the user has picked all of the letters.
	private boolean printCurrStatus(String strToGuess, String userInputs) {
		// ********** Fill in Details
		boolean success = true;
		
		System.out.println("Current Status for userInputs=" + userInputs);
		for (int i = 0; i < strToGuess.length(); i++) {
			if (isIn(strToGuess.charAt(i), userInputs)) {
				System.out.print(strToGuess.charAt(i) + " ");
			} else {
				System.out.print("_ ");
				success = false;
			}
		}
		System.out.println();
		
		return success;
	}

	// The following routine will return a random String from the list of words:
	// elephant, tiger, monkey, baboon, barbeque, giraffe, simple, zebra,
	// porcupine, aardvark
	private String getNextWordToGuess() {
		final String[] words = new String[] {"elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "simple", "zebra", "porcupine", "aardvark"}; // change this if you have a different number of words
		return words[rand.nextInt(words.length)];
		// Another way to accomplish the same thing:
		// int num = (int)(num_words* Math.random());
		// ********** Fill in Details
	}

	// The following routine plays the hangman game. It calls getNextWordToGuess to
	// get the word that should be guessed. It then has a loop which outputs the
	// following prompt:
	// Enter next letter
	//
	// A String named userInputs stores all letters selected already.
	// Then the routine printCurrStatus is called to print out the current status of

	// the guessed word. If printCurrStatus returns true, we are done.
	private void playGame() {
		// ********** Fill in Details
		String word = getNextWordToGuess();
		String userInputs = "";
		while (!printCurrStatus(word, userInputs)) {
			System.out.print("Enter next letter: ");
			String input = keyboard.next();
			input = input.trim();
			
			if (input.length() > 1) {
				System.out.println("Please only enter one letter at a time");
			} else if (isIn(input.charAt(0), userInputs)) {
				System.out.println("You've already guessed '" + input + "' try another letter.");
			} else {
				userInputs += input;
			}
		}
		System.out.println("Congratulations, you guessed the word: " + word + "!");
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
			response = hangman.keyboard.next();
		} while (response.charAt(0) == 'y');
		System.out.println("Bye");
	}
}