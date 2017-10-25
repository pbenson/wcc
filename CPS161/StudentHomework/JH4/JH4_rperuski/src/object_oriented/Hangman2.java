package object_oriented;

import java.util.Scanner;

public class Hangman2 {
	Scanner keyboard = new Scanner(System.in)
;	private String word2Guess;
	private String[] words = {"elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "simple", "zebra",
	                              	 "porcupine", "aardvark"};
	private String[] guessedLetters= new String[25];
	private String[] wordArray;
	private String[] correctArray;
	
	
	String[] getWord() {
		int num = (int)(words.length* Math.random());
		
		word2Guess = words[num];
		wordArray = word2Guess.split("");
		return wordArray;
		
	}
	
	void printing() {
		
	}
	
	boolean checkGuess(String guessedLetter, String[] guessedWord) {
		for (int i=0; i<guessedLetter.length(); i++) {
			for (int j=0; j<guessedWord.length; j++) {
				if(guessedWord[j].equals(guessedLetter.charAt(i))) {
					correctArray.push(i);
				}
			
			}
		}
		
		return true;
	}

	void playGame() {
		getWord();
		System.out.println("Please enter a letter to guess: ");
		String guess = keyboard.nextLine();
		guess = guess.trim();
		guess = guess.toLowerCase();
		
		checkGuess(guess, wordArray);
		
		
	
		
		
		
		
	}
	
	public static void main(String[] args)
	 {
		 Hangman2 hangman = new Hangman2();
	
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
