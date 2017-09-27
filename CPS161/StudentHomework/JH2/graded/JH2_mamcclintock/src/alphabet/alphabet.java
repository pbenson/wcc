package alphabet;

public class alphabet {
	public static void main(String[] args) {
	
	// Declare variables that store the ASCII values for 'a' and 'z'
	char startLetter = 'a';
	
	// Iterative while loop to implement program
	while (startLetter!='z'){
		System.out.print(startLetter + " is a ");
		// Implement switch statement
		switch(startLetter){
		case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
			System.out.println("vowel.");
			break;
		default:
			System.out.println("consonant.");
			break;
			}
		// Increment ASCII value
		startLetter +=1;
		}
	}
	}


