package string_methods;
// Starting Template
import java.util.Scanner;
public class MyStringMethods {
	private String myStr="";
	Scanner keyboard = new Scanner(System.in);
	public void readString()
	{
		// Prompt the user and read in a String from a Scanner class from the keyboard
		// with the nextLine() method and store it in "myStr"
		System.out.println("Enter in the Desired String:");
		myStr = keyboard.nextLine();
	}
	
	public void setString(String s)
	{
		myStr =s;
	}
	public int countOccurrences(String s)
	{
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
		int count = 0;
		int i = myStr.indexOf(s);
		while ( i >= 0)
		{
			count++; 
			i = myStr.indexOf(s, i+ s.length());

		}
		return count;
	}
	public int countOccurrences(char c)
	{
		// use indexOf and return the number of occurrences of the character "c" in "myStr"
		int count = 0;
		int i = myStr.indexOf(c);
		while ( i >= 0)
		{
			count++; 
			i = myStr.indexOf(c, i+ 1);
			
		}
		return count;
	}
	int countUpperCaseLetters()
	{
		// return the number of upper case letters in "myStr"
		int count = 0;
		int length = myStr.length();
		for(int i = 0; i < length; i++)
		{
			if(Character.isUpperCase(myStr.charAt(i)))
			{
				count++;
			}
			
		}
		return count;
		
	}
	int countLowerCaseLetters()
	{
		// return the number of lower case letters in "myStr"
		
		int count = 0;
		int length = myStr.length();
		for(int i = 0; i < length; i++)
		{
			if(Character.isLowerCase(myStr.charAt(i)))
			{
				count++;
			}
			
		}
		return count;
	}
	public void printCounts(String s, char c)
	{
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr="+myStr);
		System.out.println("Number of Upper case letters="+
				countUpperCaseLetters());
		System.out.println("Number of Lower case letters="+
				countLowerCaseLetters());
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