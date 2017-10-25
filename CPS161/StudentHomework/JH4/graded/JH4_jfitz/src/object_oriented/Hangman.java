package object_oriented;

import java.util.*;

public class Hangman {
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();
	String[] possibleWords = new String[] {
			"elephant", "tiger", "monkey", "baboon", "barbeque",
			"giraffe", "simple", "zebra", "porcupine", "aardvark" };
	String userInputs = "";
	String strToGuess = "";

	boolean printCurrStatus() {
		String output = "Current Inputs: " + userInputs + "\n";
		
		boolean finished = true;
		
		for (int strPos = 0; strPos < strToGuess.length(); strPos++) {
			char letter = strToGuess.charAt(strPos);
			char charToDisplay = '_';
			
			for (int inputPos = 0; inputPos < userInputs.length(); inputPos++) {
				if (letter == userInputs.charAt(inputPos)) {
					charToDisplay = letter;
					break;
				}
			}
			
			output += String.valueOf(charToDisplay) + " ";
			
			if (charToDisplay == '_')
				finished = false;
		}
		
		System.out.print(output + "\n");
		
		return finished;
	}

	void getNextWordToGuess() {
		int index = rand.nextInt(possibleWords.length);
		
		strToGuess = possibleWords[index];
	}

	void playGame() {
		getNextWordToGuess();
		userInputs = "";
		
		while (true) {
			System.out.printf("Enter next letter: ");
			userInputs += keyboard.next().toLowerCase();
			
			if (printCurrStatus()) {
				System.out.println("Congratulations, you guessed the word!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Hangman hangman = new Hangman();

		System.out.println("Welcome to object oriented Hangman.");
		String response = "";
		do {
			hangman.playGame();
			System.out.print("Do you want to play object oriented Hangman again? (y or n): ");
			response = hangman.keyboard.next();
		} while (response.charAt(0) == 'y');

		System.out.println("Bye");
	}
}