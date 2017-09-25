public class alphabet {
	public static void main(String[] args) {
		char letter = 'a';
		while (letter <='z') {
			switch(letter) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				System.out.println (letter + (" is a vowel"));
				break;
			case 'y' :
				System.out.println (letter + (" is sometimes a vowel"));
				break;
			default:
				System.out.println(letter + (" is a consonant"));
			}
			letter += 1;
		}
	}
}