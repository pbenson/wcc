package static_approach;
import java.util.*;

public class Hangman {
	static Scanner keyboard = new Scanner(System.in);
	static Random rand = new Random();
	static String[] possibleWords = new String[] {
				"elephant", "tiger", "monkey", "baboon", "barbeque",
				"giraffe", "simple", "zebra", "porcupine", "aardvark" };
	
	static boolean printCurrStatus(String strToGuess, String userInputs) {
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
	static String getNextWordToGuess() {
		
		int index = rand.nextInt(possibleWords.length);
		
		return possibleWords[index];
	}
	static void playGame() {
		String word = getNextWordToGuess();
		String userInputs = "";
		
		while (true) {
			System.out.printf("Enter next letter: ");
			userInputs += keyboard.next().toLowerCase();
			
			if (printCurrStatus(word, userInputs)) {
				System.out.println("Congratulations, you guessed the word!");
				break;
			}
		}
	}
	public static void main(String[] args) {

		System.out.println("Welcome to static approach Hangman.");
		
		String response = "";
		do {
			playGame();
			System.out.print("Do you want to play static approach Hangman again? (y or n): ");
			response = keyboard.next();
		} while (response.charAt(0) == 'y');

		System.out.println("Bye");
	}
}