package string_methods;

// Starting Template
import java.util.Scanner;

public class StringMethods {
	private String myStr = "";

	public void readString() {
		// Prompt the user and read in a String from a Scanner class from the keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in a String: ");
		// with the nextLine() method and store it in "myStr"
		myStr = keyboard.nextLine();
	}

	int lenth = input.length();

	public void setString(String s) {
		myStr = s;
	}

	public int countOccurrences(String s) {
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
	}

	public int countOccurrences(char c) {
		// use indexOf and return the number of occurrences of the character "c" in
		// "myStr"
	}

	int countUpperCaseLetters() {
		// return the number of upper case letters in "myStr"
	}

	int countLowerCaseLetters() {
		// return the number of lower case letters in "myStr"

		for (int i = 0; i < myStr.length(); i++) {
			char c2 = myStr.charAt(i);
			System.out.println("Number of lowercase letters: " + i);

			// do whatever you want with the character
		}

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