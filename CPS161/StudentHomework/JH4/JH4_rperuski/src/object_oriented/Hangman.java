package object_oriented;

import java.util.*;
public class Hangman {
	Scanner keyboard = new Scanner(System.in);
	 Random rand = new Random();
	 private String[] words = {"elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "simple", "zebra",
          	 "porcupine", "aardvark"};
	 private String word2Guess="";
	 private String userInputs="";
	 private String wrongGuesses="";
	private char guess;
	 private boolean allDone;

	 boolean isIn(char c, String str)
	 {
		 for (int i=0; i<str.length(); i++) {
			 if (str.charAt(i)==c) {
				 System.out.println(c + " is in the word!");
				 userInputs+=c;
				 return true;
			 } 
		 }
		 System.out.println("Sorry, that's not in there.");
		 return false;
	 }


	 void printCurrStatus(String strToGuess, char guess)
	 {	
		 if (strToGuess.equals(userInputs)) {
			 System.out.println("You got it! The word is " + word2Guess);
			 allDone=true;
			 
		 } else {
			 isIn(guess, word2Guess);
			 System.out.println("Your guess so far is: " + userInputs);
			 
		 }
	 
		 
		 
	 }



	 void setNextWordToGuess()
	 {
		 
		 final int num_words=10; // change this if you have a different number of words
		 int num = rand.nextInt(num_words);
		 
		word2Guess = words[num];
		 //System.out.println("THis is word to guess "+ word2Guess);
	
	 }
	 

	 void playGame()
	 {
		 setNextWordToGuess();
		 
		 do {
		 	System.out.println("Please enter a letter to guess: ");
			guess = keyboard.nextLine().charAt(0);
			
			
			printCurrStatus(word2Guess, guess);
			
			
		 } while(!allDone);

	 }
	 
	 public static void main(String[] args)
	 {
		 Hangman hangman = new Hangman();
	
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
