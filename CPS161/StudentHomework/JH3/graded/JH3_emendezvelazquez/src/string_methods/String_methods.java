package string_methods;

import java.util.Scanner;

public class Mystringmethods

{
	private String myStr = "";

	public void readString() {

		{

			Scanner keyboard = new Scanner(System.in);

			System.out.println(" Enter desired string ");

			String myStr = keyboard.nextLine();
		}

	}

	public void setString(String s) {
		myStr = s;
	}

	public int countOccurrences(String s) {
		int y = 0;
		int count = 0;

		{
			for (int x = 0; s.length(); x++) {
				y = s.charAt(x);
				if (y == 's')
					count += 1;
			}
		}
		System.out.println("found " + count + " s's ");

		// use indexOf and return the number of occurrences of the string "s" in "myStr"
	}

	public int countOccurrences(char c) {
		// use indexOf and return the number of occurrences of the character "c" in
		// "myStr"
	}

	int countUpperCaseLetters() {
	}

	// return the number of upper case letters in "myStr" }
	int countLowerCaseLetters() {
		// return the number of lower case letters in "myStr"
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
//		Mystrings msm = new String_methods();
//		msm.readString();
//		msm.printCounts("big", 'a');
//		msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
	}

//	{
//		msm.printCounts("van", 'a');
//		String_methods msm2 = new String_methods();
//		msm2.setString("the elephant in the room wouldn't budge");
//		msm2.printCounts("the", 'i');
//	}
}