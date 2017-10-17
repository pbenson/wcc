package string_methods;

import java.util.Scanner;

public class MyStringMethods {
	private String myStr = "";

	public void readString() {
		System.out.println("Please enter your String:");
		Scanner keyboard = new Scanner(System.in);
		myStr = keyboard.nextLine();
		keyboard.close();
	}

	public void setString(String s) {
		myStr = s;
	}

	public int countOccurrences(String s) {
		int count = 0;
		int curPos = 0;
		
		while (true) {
			if (curPos > myStr.length())
				break;
			int index = myStr.indexOf(s, curPos);
			
			if (index == -1 || (index == 0 && curPos != 0))
				break;
			
			count++;
			curPos = index + 1;
		}
		return count;
	}

	public int countOccurrences(char c) {
		int count = 0;
		int curPos = 0;
		
		while (true) {
			if (curPos > myStr.length())
				break;
			int index = myStr.indexOf(c, curPos);
			
			if (index == -1 || (index == 0 && curPos != 0))
				break;
			
			count++;
			curPos = index + 1;
		}
		return count;
	}

	int countUpperCaseLetters() {
		int count = 0;
		
		char[] charArr = myStr.toCharArray();
		
		for (int i = 0; i < charArr.length; i++)
			if (isUpper(charArr[i]))
				count++;
		return count;
	}

	int countLowerCaseLetters() {
		int count = 0;
		
		char[] charArr = myStr.toCharArray();
		
		for (int i = 0; i < charArr.length; i++)
			if (isLower(charArr[i]))
				count++;
		return count;
	}
	
	boolean isLower(char c) {
		if (c >= 'a' && c <= 'z')
			return true;
		return false;
	}
	boolean isUpper(char c) {
		if (c >= 'A' && c <= 'Z')
			return true;
		return false;
	}

	public void printCounts(String s, char c) {
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr=" + myStr);
		System.out.println("Number of Upper case letters=" + countUpperCaseLetters());
		System.out.println("Number of Lower case letters=" + countLowerCaseLetters());
		System.out.println("Number of " + s + " is " + countOccurrences(s));
		System.out.println("Number of " + c + " is " + countOccurrences(c));
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
