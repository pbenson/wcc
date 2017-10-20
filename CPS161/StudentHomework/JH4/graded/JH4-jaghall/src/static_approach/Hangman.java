package static_approach;

import java.util.*;

public class Hangman {
	static Scanner keyboard = new Scanner(System.in);
	static Random rand = new Random();

	static boolean isIn(char c, String str) {
		return str.indexOf(c) > -1;
	}

	static boolean printCurrStatus(String strToGuess, String guesses) {
		String output = "";
		char c;
		char addition;
		int len = strToGuess.length();
		int correctCount = 0;
		
		for (int i = 0; i < len; i++) {
			c = strToGuess.charAt(i);
			
			if(isIn(c, guesses)) {
				addition = c;
				correctCount++;
			} else {
				addition = '_';
			}
			
			output = output + addition;
		}
		
		System.out.println("Current Status for userInputs: " + guesses);
		System.out.println(output);
		
		return correctCount == len;
	}

	static String getNextWordToGuess() {
		final int numWords = 10;
		int num = rand.nextInt(numWords);
		List<String> words = Arrays.asList(
			"elephant", 
			"tiger", 
			"monkey", 
			"baboon", 
			"barbeque", 
			"giraffe", 
			"simple", 
			"zebra", 
			"porcupine", 
			"aardvark"
		);

		return words.get(num);
	}
	
	static boolean isGuessValid(String guess) {
		char c;
		if (guess.length() > 0) {
			c = guess.charAt(0);
			if (isLetter(c)) return true;
			return false;
		}
		return false;
	}
	
	static boolean isLetter(char c) {
		if (c < '0' || c > '9') {
            return true;
        }
		
		return false;
	}

	static void playGame () {
		String wordToGuess = getNextWordToGuess();
		String guesses = "";
		
		while(!printCurrStatus(wordToGuess, guesses)) {
	    		System.out.println("Enter next letter:");
	    		String guess = keyboard.nextLine();
	    		if (isGuessValid(guess)) {
	    			guesses = guesses + guess.charAt(0);
	    		} else {
	    			System.out.println("Thats not a valid input!");
	    			continue;
	    		}
	    }
		
		System.out.println("You win!!");
	}

	public static void main(String[] args) {
		String response = "";
		do {
			Hangman.playGame();
			System.out.print("Do you want to play static Hangman again? (y or n): ");
			response = Hangman.keyboard.next();
		} while (response.charAt(0) == 'y');

		System.out.println("Bye");
	}
}