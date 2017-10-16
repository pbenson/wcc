package string_methods;
import java.util.Scanner;
public class String_methods 
{
	private String myStr="";
	public void readString() 
	{
		System.out.print("Enter in the desired String:");
		Scanner keyboard = new Scanner(System.in);
		myStr = keyboard.nextLine();
		keyboard.close();
	}
	public int countOccurrences(String s) 
	{
		int string_count;
		string_count = 0;
		int string_index = 0;
		while(true) {
			string_index = myStr.indexOf(s, string_index) + 1; 
			if (string_index == 0)
				break;
			string_count++;
		}
		return string_count;
	}
	public int countOccurrences(char c)
	{
		int char_count;
		char_count = 0;
		int char_index = 0;
		while(true) 
		{
			char_index = myStr.indexOf(c, char_index) +1;
			if (char_index == 0)
				break;
			char_count++;
		}
		return char_count;
	}
	public int countUpperCaseLetters() 
	{
		int upper_count = 0;
		for (int i = 0; i < myStr.length(); i++)
		{
			char upper = myStr.charAt(i);
			if (upper >= 'A' && upper <= 'Z')
				upper_count++;
		}
		return upper_count;
	}
	public int countLowerCaseLetters() 
	{
		int lower_count = 0;
		for (int i = 0; i < myStr.length(); i++)
		{
			char lower = myStr.charAt(i);
			if (lower >= 'a' && lower <= 'z')
				lower_count++;
		}
		return lower_count;
	}
	public void printCounts(String s, char c)
	{
		System.out.println("***************************************");
		System.out.println("Analyzing: "+ myStr);
		System.out.println("Number of Upper case letters="+ countUpperCaseLetters());
		System.out.println("Number of Lower case letters="+ countLowerCaseLetters());
		System.out.println("Number of "+s + " is "+ countOccurrences(s));
		System.out.println("Number of "+c + " is "+ countOccurrences(c));
	}
	public static void main(String[] args) 
	{
		String_methods msm = new String_methods();
		msm.readString();
		msm.printCounts("big", 'a');
		msm.printCounts("van", 'i');
		msm.printCounts("the", 'o');
	}	
}