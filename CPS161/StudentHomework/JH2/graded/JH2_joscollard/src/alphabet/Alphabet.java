package alphabet;

public class Alphabet {
	
	public static void main (String[] args) {
		
		char letter = 'a';
		while (letter <= 'z')
		{
			System.out.print(letter+ " is a ");
			if (letter == 'a')
				System.out.println("vowel.");
			else if (letter == 'e')
				System.out.println("vowel.");
			else if (letter == 'i')
				System.out.println("vowel.");
			else if (letter == 'o')
				System.out.println("vowel.");
			else if (letter == 'u')
				System.out.println("vowel.");
			else if (letter == 'y')
				System.out.println("vowel.");
			else
				System.out.println("consonant.");
						
	/*		switch (letter)  //functions the same way
			{
				case 'a':
					System.out.println("vowel.");
					break;
				case 'e':
					System.out.println("vowel.");
					break;
				case 'i':
					System.out.println("vowel.");
					break;
				case 'o':
					System.out.println("vowel.");
					break;
				case 'u':
					System.out.println("vowel.");
					break;
				case 'y':
					System.out.println("vowel.");
					break;
				default:
					System.out.println("consonant.");
					break; 
			} 
	*/		
			letter+=1;
		}

	}
	
}
