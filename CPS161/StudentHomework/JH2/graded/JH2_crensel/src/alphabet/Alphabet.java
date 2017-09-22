package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		// Local variable declaration/initialization
		char currentLetter = 'a' - 1;
		
		// Main logic while loop
		while (currentLetter != 'z') {
			// Increment letter
			currentLetter++;
			switch (currentLetter) {
			// Group all vowel cases into one block as they all execute the same thing
			case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
				System.out.printf("%c is a vowel\n", currentLetter);
				break;
			default:
				System.out.printf("%c is a consonant\n", currentLetter);
				break;
			}
		}
	}

}
