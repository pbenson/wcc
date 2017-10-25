package hangman;

import java.util.Scanner;

public class Hangman {

	private static String[] words = {"simple", "monkey", "aardvark", "fig", "horse", "alligator" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String underscore = new String(new char[word.length()]).replace("\0", "_");
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 10 && underscore.contains("_")) {
			System.out.println("Current Status for userInputs=");
			System.out.println(underscore);
			System.out.println("Enter next letter:");
			String guess = sc.next();
			hang(guess);
		}
		
		Hangman hangman = new Hangman();
        String response="";
        do
        { 
        		
            System.out.print("Do you want to play object oriented Hangman again? (y or n): ");
            response = sc.next();
        } while (response.charAt(0) == 'y');
        System.out.println("Bye");
		
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (underscore.charAt(i) != '_') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "_";
			}
		}

		if (underscore.equals(newasterisk)) {
			count++;
		} else {
			underscore = newasterisk;
		}
		if (underscore.equals(word)) {
			System.out.println("Congratulations: you guessed the word!!" + word);
		}
	}
		
}