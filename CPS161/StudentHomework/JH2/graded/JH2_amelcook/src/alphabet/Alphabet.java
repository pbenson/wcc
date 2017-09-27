package alphabet;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		char letter = 'a';
		
		Scanner keyboard = new Scanner(System.in);
		while (letter <= 'z'){
			letter++;
			System.out.println(+ letter);
		}
		
		
		keyboard.close();
		 
		
	}

}
