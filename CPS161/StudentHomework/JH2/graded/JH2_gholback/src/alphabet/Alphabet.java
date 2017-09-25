package alphabet;

public class Alphabet {
	public static void main(String[] args){

		char letter = 'a';

		int alphabet = 1;

		String letterType = "x";

		while (alphabet < 27){

			switch (alphabet){
			case 1: letterType = "vowel";
			break;
			case 5: letterType = "vowel";
			break;
			case 9: letterType = "vowel";
			break;
			case 15: letterType = "vowel";
			break;
			case 21: letterType = "vowel";
			break;
			case 25: letterType = "vowel";
			break;
			default: letterType = "consonant";
			break;
			}

			System.out.println(letter + " is a " + letterType);

			alphabet += 1;
			letter += 1;
		}
	}
}
