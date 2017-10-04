package alphabet;


public class Alphabet {

	public static void main(String[] args) {
	
	
		for(char ch ='a';ch<='z';ch++)
		  switch (ch) {
		  case 'a': 
		   System.out.println(ch + " is a vowel");
		   break;
		  case 'e': 
		   System.out.println(ch + " is a vowel");
		   break;
		  case 'i': 
		   System.out.println(ch + " is a vowel");
		   break;
		  case 'o':  
		   System.out.println(ch + " is a vowel");
		   break;
		  case 'u': 
		   System.out.println(ch + " is a vowel");
		   break;
		  case 'y': 
		   System.out.println(ch + " is a vowel");
		   break;
		   default:
		   int asciiValue = (int)ch; //convert letter ch to lcase integer
		   if( asciiValue >= 97 && asciiValue <= 122){
		    System.out.println(ch + " is a consonant");
		   }
		   break;
}
	}
}