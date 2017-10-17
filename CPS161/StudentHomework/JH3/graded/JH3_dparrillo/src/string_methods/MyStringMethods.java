package string_methods;

// Starting Template
import java.util.Scanner;

public class MyStringMethods {

	private String myStr="";
	
	public void readString()
	{
		System.out.println("Enter in the desired String:");
		Scanner keyboard = new Scanner(System.in);
		myStr = keyboard.nextLine();
	}
	public void setString(String s)
	{
		myStr =s;
	}
	public int countOccurrences(String s)
	{
		int count = 0;
		int index = myStr.indexOf(s);
		
		while (index >= 0) {
			index = myStr.indexOf(s, index++);
			count++;
		}
		return count;
		
	}
	public int countOccurrences(char c)
	{
		int count = 0;
		int index = myStr.indexOf(c);
		
		while (index >= 0) {
			index = myStr.indexOf(c, index++);
			count++;
		}
		return count;
		
	}
	int countUpperCaseLetters()
	{
		int UpperCaseCount = 0;
		
		for (int i = 0; i < myStr.length(); i++)
		{
			for(char c = 'A'; c <= 'Z'; c++)
			{
				if (myStr.charAt(i) == c)
				{
					UpperCaseCount++;
				}
			}
		}
		return UpperCaseCount;
	}
	
	int countLowerCaseLetters()
	{
		int LowerCaseCount = 0;
		
		for (int i = 0; i < myStr.length(); i++)
		{
			for(char c = 'a'; c <= 'z'; c++)
			{
				if (myStr.charAt(i) == c)
				{
					LowerCaseCount++;
				}
			}
		}
		return LowerCaseCount;
	}
	public void printCounts(String s, char c)
	{
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr="+myStr);
		System.out.println("Number of Upper case letters="+countUpperCaseLetters());
		System.out.println("Number of Lower case letters="+countLowerCaseLetters());
		System.out.println("Number of "+s + " is "+ countOccurrences(s));
		System.out.println("Number of "+c + " is "+ countOccurrences(c));
	}
	
	public static void main(String[] args) {
		MyStringMethods msm = new MyStringMethods();
		msm.readString();
		msm.printCounts("big", 'a');
		
		msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
		msm.printCounts("van", 'a');
		
		MyStringMethods msm2 = new MyStringMethods();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');
	}
}