package object_oriented;
import java.util.Random;
import java.util.Scanner;
public class Hangman{

 String str;
 Scanner keyboard = new Scanner(System.in);
 String hangmanstr = "";
{
Scanner keyboard = new Scanner(System.in); Random rand = new Random();}

boolean printCurrStatus(String strToGuess, char userInputs, String hangmanstr)
{
       char charComp ;
	    char[] charsToGuess = strToGuess.toCharArray();
	    char[] chars = hangmanstr.toCharArray();
	    int x;
	    System.out.print(chars);
	    
    	    for ( x = 0; x <= strToGuess.length()-1; x++ );
    	    {
    	    	System.out.println(x);
   	    	charComp = charsToGuess[x];
    	    
//    	    if (userInputs == charComp); 
//    	   	{ 
//    	   		chars[x]= charsToGuess[x];
//    	   		}
    	    
    	    }
    	    
    	    hangmanstr = new String (chars);
    	    
    	    System.out.println(hangmanstr);
    	    return false;
    	     } 



String getNextWordToGuess()
{
	final int num_words=10;
    Random rand = new Random();
	int x= rand.nextInt(num_words);
   

    String[] listofwords = new String[]{ "baboon", " barbeque", "giraffe", "simple", "zebra", "elephant", "tiger", "monkey", "porcupine", "aardvark"};

   
    return listofwords[x];

// change this if you have a different number of words
  // int num = rand.nextInt(num_words);
// Another way to accomplish the same thing: // int num = (int)(num_words* Math.random());
        //********** Fill in Details
    }
// The following routine plays the hangman game. It calls getNextWordToGuess to
// get the word that should be guessed. It then has a loop which outputs the
    // following prompt:
// Enter next letter
    //
// A String named userInputs stores all letters selected already.
// Then the routine printCurrStatus is called to print out the current status of
// the guessed word. If printCurrStatus returns true, we are done.
    void playGame()
    {  
    	   str = getNextWordToGuess();
    	   for (int i=1; i <= str.length(); i ++)
    	   {
    		 hangmanstr = hangmanstr+ '_';
    	   }
    	   
  //  	   do {
    	   System.out.println( " Enter in your letter to guess " );
    	   char guess = keyboard.next().charAt(0);
    	   printCurrStatus(str, guess, hangmanstr);
    	  // }
    	   //while (str= hangmanstr);
	   System.exit(0);
    }
// main will call playGame to play the hangman game.
// Then main will issue the prompt:
// Do you want to play again (y or n)
// If the answer is "y", then call playGame again, otherwise exit
    public static void main(String[] args)
    {
    	   
        Hangman hangman = new Hangman();
        String response=" ";
        do
        {
            hangman.playGame();
System.out.print("Do you want to play object oriented Hangman again? (y or n): ");
            response = hangman.keyboard.next();
        } while (response.charAt(0) == 'y');
        System.out.println("Bye");
    }
}