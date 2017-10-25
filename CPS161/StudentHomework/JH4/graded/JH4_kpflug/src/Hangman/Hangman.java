package Hangman;

import java.util.*;
public class Hangman{
Scanner scan = new Scanner(System.in);
Random rand = new Random();



    boolean isIn(char c, String str) 
    {
    	boolean isin = false;
    	  for (int i = 0; i < str.length(); i++)
	    {
	    if (str.charAt(i) == c)
	    		isin = true;
	    }
    	  return isin;
    }
    
    
 
    boolean printCurrStatus(String strToGuess, String userInputs)
    {
    	boolean guessed = true;
    for (int i=0; i < strToGuess.length(); i++) 
    {
	    	char c = strToGuess.charAt(i);
	    if (isIn(c, userInputs) == true)
	    		System.out.print(c);
	    else
	    {
	    		System.out.print('_');
	    		guessed = false;
	    }
    }
    System.out.println();
    	return guessed;
    }
    
    

    
    String getNextWordToGuess()
    {
        final int num_words=10;
    int num = rand.nextInt(num_words);
    String word;
    switch(num)
    {
    case 0:
        word = "elephant";
        break;
    case 1:
    		word = "tiger";
    		break;
    case 2:
		word = "monkey";
		break;
    case 3:
		word = "baboon";
		break;
    case 4:
		word = "barbeque";
		break;
    case 5:
		word = "giraffe";
		break;
    case 6:
		word = "simple";
		break;
    case 7:
		word = "zebra";
		break;
    case 8:
		word = "porcupine";
		break;
    case 9:
 		word = "aardvark";
 		break;
    	default:
    		word = "default";
    		break;
    }
    
    return word;
    }
    

    void playGame()
{
    	String word = getNextWordToGuess();
    	String userinputs= "";
    	while(printCurrStatus(word, userinputs) == false)
    	{
    		System.out.println("Current Status for userInputs=" + userinputs);
    		System.out.println("Enter next letter");
		String nextinput = scan.nextLine();
        nextinput = nextinput.trim();
        userinputs = userinputs + nextinput.charAt(0);
    	}
    	System.out.println("You guessed the word!");
    
}
    
    

public static void main(String[] args)
{
    Hangman hangman = new Hangman();
    String response="";
    do
    {
        hangman.playGame();
        System.out.print("Do you want to play object oriented Hangman again? (y or n): ");
        response = hangman.scan.next();
    } while (response.charAt(0) == 'y');
    
    System.out.println("Bye");
    
}
}