package static_approach;


import java.util.*;
public class Hangman {
	static Scanner keyboard = new Scanner(System.in);
	 static Random rand = new Random();
	  private String[] words = {"elephant", "tiger", "monkey", "baboon", "barbeque", "giraffe", "simple", "zebra",
          	 "porcupine", "aardvark"};
	 private String word2Guess="";
	 private String userInputs="";
	 private char guess;

	 // The following routine will determine if the character c
	 // is inside the String str. A true is returned if it is inside.
	 // It is very useful to call the isIn routine inside of printCurrStatus...
	 // See the comments in the Hint for printCurrStatus.

	 static boolean isIn(char c, String str)
	 {
		 for (int i=0; i<str.length(); i++) {
			 if (str.charAt(i)==c) {
				 System.out.println(c + " is in " + str);
				 return true;
			 } 
		 }
		 return false;
	 }

	// ****** printCurrStatus
	 // If userInputs contains "ard" and strToGuess contains "aardvark" then
	 // the following routine prints out an output that looks something like:
	 //
	 // Current Status for userInpts=ard
	 // a a r d _ a r _

	 // This routine returns true if all letters were guessed, otherwisfalse is returned.
	// HINT: It is useful to have a for loop that goes through each of the
//	characters in
//	// strToGuess. Call isIn for each character (note the second
//	parameter would
//	// be userInputs). If isIn returns true, just print out the
//	character, if isIn
//	// returns false, then print out '_'.
//	// Additionally, you can have a variable like:
//	// boolean success = true;
//	// Whenever you output at least one '_', you can set success = false.
//	// Your code can just return the variable "success" and it will
//	return true if
//	// the user has picked all of the letters.



	 static boolean printCurrStatus(String strToGuess, String userInputs)
	 {
		 if (strToGuess.equals(userInputs)) {
			 return true;
			 
		 } else {
			 isIn(guess, word2Guess);
			 System.out.println("Nope, don't have it all");
			 return false;
		 }
	 
		 
		 
	 }



	 static String setNextWordToGuess()
	 {
		 
		 final int num_words=10; // change this if you have a different number of words
		 int num = rand.nextInt(num_words);
		 
		 String word2Guess = words[num];
		 System.out.println("THis is word to guess "+ word2Guess);
		 
		 return word2Guess;
		 
		 
	
	 
	 }
	 
	 
	 // The following routine plays the hangman game. It calls getNextWordToGuess to
	 // get the word that should be guessed. It then has a loop which outputs the
	 // following prompt:
	 // Enter next letter
	 //
	 // A String named userInputs stores all letters selected already.
	 // Then the routine printCurrStatus is called to print out the current status of
	 // the guessed word. If printCurrStatus returns true, we are done.

	 static void playGame()
	 {
		 setNextWordToGuess();
		 
		 do {
		 	System.out.println("Please enter a letter to guess: ");
			guess = keyboard.nextLine().charAt(0);

			userInputs+=guess;
			
			
			System.out.println("This is word to be guessed" + word2Guess);
			printCurrStatus(word2Guess, userInputs);
			
			
		 } while(!printCurrStatus(word2Guess, userInputs));

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
