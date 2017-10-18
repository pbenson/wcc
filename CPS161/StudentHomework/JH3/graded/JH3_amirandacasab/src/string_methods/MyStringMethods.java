package string_methods;

import java.util.Scanner;

public class MyStringMethods {

	private String myStr = "";

	public void readString()
	{
		System.out.println("Enter in the desired String: ");
		Scanner keyboard = new Scanner(System.in);
		myStr = keyboard.nextLine();
		keyboard.close();
	}

	public void setString(String s)
	{
		myStr = s;
	}

	public int countOccurrences(String s)
	{
		int index;
		int start = 0;
		int count1 = 0;
		
		do {
			index = myStr.indexOf(s, start);
			if (index >= 0)
			{
				start = index + 1;
				count1 += 1;
			}
		} while (index >= 0);
		return count1;
	}

	public int countOccurrences(char c)
	{
		int index2;
		int start2 = 0;
		int count2 = 0;
		
		do {
			index2 = myStr.indexOf(c, start2);
			if (index2 >= 0)
			{
				start2 = index2 + 1;
				count2 += 1;
			}
		} while (index2 >= 0);
		return count2;
	}

	int countUpperCaseLetters()
	{
		int i;
		int len = myStr.length();
		int count3 = 0;
		
		for (i = 0; i < len; i++)
		{
			if (Character.isUpperCase(myStr.charAt(i)))
				count3 += 1;
		}
		return count3;
	}

	int countLowerCaseLetters()
	{
		int k;
		int len2 = myStr.length();
		int count4 = 0;
		
		for (k=0; k < len2; k++)
		{
			if (Character.isLowerCase(myStr.charAt(k)))
				count4 += 1;
		}
		return count4;
	}

	public void printCounts(String s, char c)
	{
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr=" + myStr);
		System.out.println("Number of Upper case letters=" + countUpperCaseLetters());
		System.out.println("Number of Lower case letters=" + countLowerCaseLetters());
		System.out.println("Number of " + s + " is " + countOccurrences(s));
		System.out.println("Number of " + c + " is " + countOccurrences(c));
	}

	public static void main(String[] args)
	{
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