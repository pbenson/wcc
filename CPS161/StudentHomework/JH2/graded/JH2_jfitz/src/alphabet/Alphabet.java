package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		
		//Char 'a' has an index of 97
		char c = 'a';
		while((int)c < 123) {
			
			String charType = findCharType((int)c - 96);
			
			System.out.printf("%c is a %s\n", c, charType);
			c++;
		}
	}
	static String findCharType(int index) {
		switch(index) {
			case 1: 
			case 5:  
			case 9:
			case 15: 
			case 21:
			case 25: return "vowel";
			default: return "consonant";
		}
	}
}
