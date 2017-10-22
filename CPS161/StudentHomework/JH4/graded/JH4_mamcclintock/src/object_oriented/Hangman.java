package object_oriented;
import java.util.*;

public class Hangman{
	Scanner keyboard = new Scanner(System.in); 
	Random rand = new Random();
	
	// Returns true if char c is in str
    boolean isIn(char c, String str){
        if (str.indexOf(c)!=-1){
        	return true;
        	}
        return false;
        }
    
    //Prints current game status including guessed letters and game board ie "w_r_d"
    boolean printCurrStatus(String strToGuess, String userInputs) {
    	boolean success=true;
    	System.out.println("Current status for user inputs = " + userInputs);
        for(int i=0; i<strToGuess.length(); i++){
        	if(isIn(strToGuess.charAt(i), userInputs )){
        		System.out.print(strToGuess.charAt(i) + " ");
        	}
        	else {
        		System.out.print("_ ");
        		success=false;
        	}
        }
        System.out.println();
        return success;
    }
    
    // Returns new word or next game
    String getNextWordToGuess(){
    	final int num_words=5;
    	String[] words = new String[5];
    	words[0]="baboon";
    	words[1]="giraffe";
    	words[2]="simple";
    	words[3]="zebra";
    	words[4]="barbeque";
    	int num = rand.nextInt(num_words);
    	return words[num];
    	}

    // Runs game
    void playGame(){
    	String nextWord = getNextWordToGuess();
    	String guessedLetters="";
    	while(!printCurrStatus (nextWord, guessedLetters)){
    		System.out.println();
        	System.out.println("Please enter next letter: ");
        	guessedLetters = guessedLetters+keyboard.next();
        	}
    	}
    
    public static void main(String[] args){
        Hangman hangman = new Hangman();
        String response="";
        do{
        	hangman.playGame();
        	System.out.println("Congrats! You guessed the word! ");            
        	System.out.println("Do you want to play object oriented Hangman again? (y or n): ");
            response = hangman.keyboard.next();
            } 
        while (response.charAt(0) == 'y');
        System.out.println("Bye");
        }
    }