package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		char letter = 'a';
		
		while(true) {
			switch (Character.toString(letter)) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "y":
				System.out.println(letter + " is a vowel");
				break;

			default:
				System.out.println(letter + " is a consonant");
				break;
			}
			
			if (letter == 'z') {
				break;
			} else {
				letter += 1;
			}
		}
	}

}
