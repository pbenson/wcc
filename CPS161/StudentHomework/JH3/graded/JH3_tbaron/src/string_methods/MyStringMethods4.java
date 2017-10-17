package string_methods;

// Starting Template
import java.util.Scanner;

public class MyStringMethods4 {

	private String myStr="";

	public void readString()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in a string:");
		myStr= keyboard.nextLine();
		keyboard.close(); 
		// Prompt the user and read in a String from a Scanner class from the keyboard  
		// with the nextLine() method and store it in "myStr"
	}
	public void setString(String s)

	{
		myStr =s;
	}
	
	public int countOccurrences(String s)

	{
		int start1 = 0;
		int count1 = 0;
		int index1 = 0;
		do
		{
			index1 = myStr.indexOf(s, start1);
			if (index1 >= 0)
			{
				start1 = index1 + 1;
				count1 += 1;
			}
		} while(index1 >= 0);
		
		return count1;
		
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
	}
	
	public int countOccurrences(char c)

	{
		int start2 = 0;
		int count2 = 0;
		int index2 = 0;
		do
		{
			index2 = myStr.indexOf(c, start2);
			if (index2 >= 0)
			{
				start2 = index2 + 1;
				count2 += 1;
			}
		} while(index2 >= 0);
		
		return count2;
		
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
	}
	
	int countUpperCaseLetters()

	{
		int upperCaseCount = 0;
		for (int i=0; i<myStr.length(); i++)
		{
			for(char c='a'; c<='z'; c++)
			{
				if (myStr.charAt(i) == c)
				{
					upperCaseCount ++;
				}		
			}

			// return the number of upper case letters in "myStr"
		}
		return upperCaseCount;
	}
	int countLowerCaseLetters()
	{
		int lowerCaseCount = 0;
		for (int i=0; i<myStr.length(); i++)
		{
			for(char c='A'; c<='Z'; c++)
			{
				if (myStr.charAt(i) == c)
				{
					lowerCaseCount ++;
				}		
			}

			// return the number of upper case letters in "myStr"
		}
		return lowerCaseCount;
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
		MyStringMethods4 msm = new MyStringMethods4();
		msm.readString();
		msm.printCounts("big", 'a');

		msm.setString("Parked in a van down by the river bank .... The van evan  vanished  near a lot of other vans");
		msm.printCounts("van", 'a');

		MyStringMethods4 msm2 = new MyStringMethods4();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');
	}
}
