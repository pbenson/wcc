package alphabet;

public class Alphabet {

	public static void main(String[] args) {
	
		char letter = 'a';
		
		while(letter <= 'z')
		{
				switch(letter)
				{
					case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
						System.out.println(letter + " is a vowel");
						break;
					default:
						System.out.println(letter + " is a consonant");
						break;
				}
			
			letter += 1;	
		}	
				
	}

}


