package alphabet;

public class Alphabet {

	public static void main(String args[]){
		char letter = 'a';
		while (letter<122) {
			letter++;
			
			
			
			switch(letter) {
			case 97:
			case 101:
			case 105:
			case 111:
			case 117:
			System.out.println(letter+" is a vowel");
				break;
			case 121:
			case 119:

			default:
			System.out.println(letter+" is a constent");
				break;

			
			}
			
		}
		
		
	}

}
