package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		
		char charLetter = 'a';
		String charType;
			
		while (charLetter <= 'z') {
			switch (charLetter) {
				case 'a': charType = "vowel"; 
						  break;
				case 'e': charType = "vowel"; 
				  		  break;
				case 'i': charType = "vowel"; 
				  		  break;
				case 'o': charType = "vowel"; 
				  		  break;
				case 'u': charType = "vowel"; 
				  		  break;
				case 'y': charType = "vowel"; 
				  		  break;
				default:  charType = "consonant"; 
				  		  break;
			}

		System.out.println(charLetter + " is a " + charType);
		charLetter++;

		}

	}

}


