package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		char letter = 'a';
		int count = 0;
		
		while (count < 26) {	
			switch(letter)
			{
			case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
				System.out.println(letter + " is a vowel");
				count += 1;
				break;
			default:
				System.out.println(letter + " is a consonant");
				count += 1;
				break;
			}
			letter += 1;
		} 
	}
}
