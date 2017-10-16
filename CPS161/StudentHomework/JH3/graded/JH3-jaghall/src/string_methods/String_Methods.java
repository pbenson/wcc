package string_methods;

import java.util.Scanner;

public class String_Methods {
	private String myStr = "";

	public void readString() {
		Scanner keyboard = new Scanner(System.in);
		myStr = keyboard.nextLine();
        keyboard.close();
	}

	public void setString(String s) {
		myStr = s;
	}

	public int countOccurrences(String s) {
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
		int count = 0;
		int index = myStr.indexOf(s);
		while (index > -1) {
			index = myStr.indexOf(s, index + 1);
			count++;
		}
		return count;
	}
	
	public int countOccurrences(char c) {
		String s = String.valueOf(c);
		return countOccurrences(s);
	}

	int countUpperCaseLetters() {
		int count = 0;
		for (int i = 0; i < myStr.length(); i++) {
			char c = myStr.charAt(i);
			
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		
		return count;
	}

	int countLowerCaseLetters() {
		int count = 0;
		for (int i = 0; i < myStr.length(); i++) {
			char c = myStr.charAt(i);
			
			if (Character.isLowerCase(c)) {
				count++;
			}
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
		String_Methods msm = new String_Methods();
		System.out.print("Enter a string for analysis: ");
		msm.readString();
		msm.printCounts("big", 'a');
		
		msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
		msm.printCounts("van", 'a');
		
		String_Methods msm2 = new String_Methods();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');
	}
}