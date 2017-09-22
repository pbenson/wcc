package alphabet;

public class Alphabet {
	
	public static void main(String[] args){
	    char alpha = 'a';


	    for (int i=0; i<26; i++){
	      switch (alpha) {
	      case 'a' :
	        System.out.println(alpha + " is a vowel");
	        break;
	      case 'e':
	       System.out.println(alpha + " is a vowel");
	        break;
	      case 'i':
	         System.out.println(alpha + " is a vowel");
	          break;
	      case 'o':
	         System.out.println(alpha + " is a vowel");
	          break;
	      case 'u':
	         System.out.println(alpha + " is a vowel");
	          break;
	      case 'y':
	         System.out.println(alpha + " is a vowel");
	          break;
	      default:
	        System.out.println(alpha + " is a consonant");
	      }

	      alpha++;
	    }
	  }
}
