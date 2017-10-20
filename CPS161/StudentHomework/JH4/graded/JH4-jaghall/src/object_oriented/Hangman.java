package object_oriented;

import java.util.*;

public class Hangman {
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();
	
	private String guesses;
	private String wordToGuess;

	boolean isIn(char c, String str) {
		return str.indexOf(c) > -1;
	}

	boolean printCurrStatus(String strToGuess) {
		String output = "";
		char c;
		char addition;
		int len = strToGuess.length();
		int correctCount = 0;
		
		for (int i = 0; i < len; i++) {
			c = strToGuess.charAt(i);
			
			if(isIn(c, this.guesses)) {
				addition = c;
				correctCount++;
			} else {
				addition = '_';
			}
			
			output = output + addition;
		}
		
		System.out.println("Current Status for userInputs: " + this.guesses);
		System.out.println(output);
		
		return correctCount == len;
	}

	String getNextWordToGuess() {
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
	
	boolean isGuessValid() {
		String guess = this.keyboard.nextLine();
		char c;
		if (guess.length() > 0) {
			c = guess.charAt(0);
			if (isNumber(c)) return false;
			
			this.guesses = this.guesses + c;
			return true;
		}
		return false;
	}
	
	boolean isNumber(char c) {
		if (c < '0' || c > '9') {
            return false;
        }
		
		return true;
	}

	void playGame () {
		this.keyboard = new Scanner(System.in);
		this.wordToGuess = getNextWordToGuess();
		this.guesses = "";
		
		while(!printCurrStatus(this.wordToGuess)) {
	    		System.out.println("Enter next letter:");
	    		
	    		if (!this.isGuessValid()) {
	    			System.out.println("Thats not a valid input!");
	    			continue;
	    		}
	    }
		
		System.out.println("You win!!");
		

	}

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