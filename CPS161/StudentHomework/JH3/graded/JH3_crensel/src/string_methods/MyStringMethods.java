package string_methods;

import java.util.Scanner;

public class MyStringMethods {

	private String myStr = "";

	public void readString() {
		// Prompt the user and read in a String from a Scanner class from the keyboard
		// with the nextLine() method and store it in "myStr"
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in the desired String: ");
		myStr = keyboard.nextLine();
		keyboard.close();
	}

	public void setString(String s) {
		myStr = s;
	}

	public int countOccurrences(String s) {
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
		int count = 0;
		int start = 0;
		int index = 0;
		
		while (index >= 0) {
			index = myStr.indexOf(s, start);
			if (index >= 0) {
				start = index + 1;
				count++;
			}
		}
		
		return count;
	}

	public int countOccurrences(char c) {
		// use indexOf and return the number of occurrences of the character "c" in
		// "myStr"
		int count = 0;
		int start = 0;
		int index = 0;
		
		while (index >= 0) {
			index = myStr.indexOf(c, start);
			if (index >= 0) {
				start = index + 1;
				count++;
			}
		}
		
		return count;
	}

	private int countUpperCaseLetters() {
		// return the number of upper case letters in "myStr"
		int count = 0;
		
		for (int i = 0; i < myStr.length(); i++) {
			char c = myStr.charAt(i);
			if (c >= 'A' && c <= 'Z') // Upper-case ASCII codes are between 65 and 90.
				count++;
			/*
			 * You could also use this
			 * 
			 * 	if (Character.isUpperCase(c))
					count++;
			 */
		}
		
		return count;
	}

	private int countLowerCaseLetters() {
		// return the number of lower case letters in "myStr"
		int count = 0;
		
		for (int i = 0; i < myStr.length(); i++) {
			char c = myStr.charAt(i);
			if (c >= 'a' && c <= 'z') // Lower-case ASCII codes are between 97 and 122 
				count++;
			/*
			 * You could also use this
			 * 
			 * 	if (Character.isLowerCase(c))
					count++;
			 */
		}
		
		return count;
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
		msm.setString("Parked in a van down by the river bank .... The van evan  vanished  near a lot of other vans");
		msm.printCounts("van", 'a');
		MyStringMethods msm2 = new MyStringMethods();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');
	}

}
