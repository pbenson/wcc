package alphabet;

public class alphabet {
	public static void main(String[] args) {
	
	// Declare variables that store the ASCII values for 'a' and 'z'
	int asciiCurrent = 97;
	int asciiEnd = 122;
	
	// Iterative while loop to implement program
	while (asciiCurrent<=asciiEnd){
		System.out.print((char)asciiCurrent + " is a ");
		if (((char)asciiCurrent)==('a')){
			System.out.println("vowel.");
		}
		else if (((char)asciiCurrent)==('e')){
			System.out.println("vowel.");
		}
		else if (((char)asciiCurrent)==('i')){
			System.out.println("vowel.");
		}
		else if (((char)asciiCurrent)==('o')){
			System.out.println("vowel.");
		}
		else if (((char)asciiCurrent)==('u')){
			System.out.println("vowel.");
		}
		else if (((char)asciiCurrent)==('y')){
			System.out.println("vowel.");
		}
		else System.out.println("consonant.");
		
		// Increment ASCII value
		asciiCurrent = asciiCurrent+1;
		}
	}
}

