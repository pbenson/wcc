package alphabet;


public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	char letter = 'a';
		
	while (letter <= 'z')
	{			
	
		switch (letter)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
				System.out.println(letter + " is a vowel");
			break;
			
			default:
				System.out.println(letter + " is a consonant");
			break;
		
		}
		
	    letter++;
	}
}
}
