package alphabet;
import java.util.Scanner;

public class Alphabet 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		char ch;

		for( ch = 'a'; ch <= 'z'; ch++)
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
			{	
				System.out.println(ch + " is a vowel");
			}
			
			else
			{	
				System.out.println(ch + " is a consanant");
			}
			
			
	}

}
