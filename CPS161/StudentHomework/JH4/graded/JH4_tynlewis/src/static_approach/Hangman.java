package static_approach;
import java.util.*;
public class Hangman
{
	static Scanner keyboard = new Scanner(System.in);
	static Random rand = new Random();

	static boolean isIn(char c, String str){
		for(int i=0; i <str.length(); i++){ 
			if (str.charAt(i) == c){
				return true;
			}
		}
		return false;
	}

	static boolean printCurrStatus(String strToGuess, String userInputs){
		boolean wordGuessed = false;
		for(int i = 0; i < strToGuess.length(); i++){	
			if (isIn(strToGuess.charAt(i), userInputs)){
				wordGuessed = true;
				continue;
			}
			else{
				wordGuessed = false;
				break;
			}
		}
		return wordGuessed;
	}

	static String getNextWordToGuess(){
		final int num_words = 10;
		int num = rand.nextInt(num_words);
		String word ="";
		switch(num){
		case 0: word = "elephant";
		break;
		case 1: word = "tiger";
		break;
		case 2: word = "monkey";
		break;
		case 3: word = "baboon";
		break;
		case 4: word = "barbeque";
		break;
		case 5: word = "giraffe";
		break;
		case 6: word = "simple";
		break;
		case 7: word = "zebra";
		break;
		case 8: word = "porcupine";
		break;
		case 9: word = "aardvark";
		break;
		default: word = "error";
		}
		return word;
	}

	static String displayStatus(String guess, String target){
		String currentStatus = "";
		for(int i = 0; i<target.length(); i++){
			if (isIn(target.charAt(i), guess)) currentStatus = currentStatus + " " + target.charAt(i);
			else currentStatus = currentStatus + " _";
		}
		return currentStatus;
	}

	static void playGame(){
		String wordToGuess = getNextWordToGuess();
		String userInputs = "";
		System.out.println("Current status for user inputs: " + userInputs);
		System.out.println(displayStatus(userInputs, wordToGuess));
		do {
			System.out.print("Enter next letter: ");
			String letterEntered = keyboard.next();
			userInputs = userInputs + letterEntered;
			System.out.println("Current status for user inputs: " + userInputs);
			System.out.println(displayStatus(userInputs, wordToGuess));
		} while (!printCurrStatus(wordToGuess, userInputs));
		System.out.println("Congratulations: you guessed the word!!!");
	}

	public static void main(String[] args){
		String response="";
		do{ playGame();
		System.out.print("Do you want to play object oriented Hangman again? (y or n): ");
		response = keyboard.next();
		} while (response.charAt(0) == 'y');
		keyboard.close();
		System.out.println("Bye");
	}
}