package alphabet;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		char letter ='a';
		
		Scanner keyboard = new Scanner(System.in);
		
		while(letter != '{') {
			switch(letter) {
			case 'a': System.out.println(letter+" is a vowel");break;
			case 'e': System.out.println(letter+" is a vowel");break;
			case 'i': System.out.println(letter+" is a vowel");break;
			case 'o': System.out.println(letter+" is a vowel");break;
			case 'u': System.out.println(letter+" is a vowel");break;
			case 'y': System.out.println(letter+" is a vowel");break;
			default:System.out.println(letter+" is a consonant");
			}
			letter += 1;
		}
	keyboard.close();
	}
}
