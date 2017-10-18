package string_methods;

import java.util.Scanner;

public class MyStringMethods
{
	private String myStr="";
	
	public void readString(Scanner scanner, String prompt)
	{
		System.out.print(prompt);
		myStr = scanner.nextLine();
	}
	
	public void readString(String prompt)
	{
		Scanner scanner = new Scanner(System.in);
		readString(scanner, prompt);
		scanner.close();
	}
	
	public void readString(Scanner scanner)
	{
		readString(scanner, "Enter in the desired String: ");
	}
	
	public void readString()
	{
		readString("Enter in the desired String: ");
	}
	
	public void setString(String s)
	{
		myStr = s;
	}
	
	public int countOccurrences(String s)
	{
		//return myStr.split(s).length -1; //Fine. I guess I'll use indexOf instead. :P
		int i = 0;
		int count = 0;
		while(true)
		{
			i = myStr.indexOf(s, i) + 1;
			if(i!=0) count++;
			else break;
		}
		return count;
	}
	
	public int countOccurrences(char c)
	{
		return countOccurrences(String.valueOf(c));
	}
	
	int countUpperCaseLetters()
	{
		int count = 0;
		for(char c : myStr.toCharArray())
		{
			if(Character.isUpperCase(c)) count++;
		}
		return count;
	}
	
	int countLowerCaseLetters()
	{
		int count = 0;
		for(char c : myStr.toCharArray())
		{
			if(Character.isLowerCase(c)) count++;
		}
		return count;
	}
	
	public void printCounts(String s, char c)
	{
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr="+myStr);
		System.out.println("Number of Upper case letters=" + countUpperCaseLetters());
		System.out.println("Number of Lower case letters=" + 	countLowerCaseLetters());
		System.out.println("Number of "+s + " is "+ countOccurrences(s));
		System.out.println("Number of "+c + " is "+ countOccurrences(c));
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