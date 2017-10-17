package string_methods;
// Starting Template
import java.util.Scanner;
public class MyStringMethods {
	private String myStr="";

	public void readString()
	{

		System.out.println("Enter a string to be analyzed");
		Scanner keyboard = new Scanner(System.in);
		myStr = keyboard.nextLine();

		keyboard.close();

	}
	public void setString(String s)
	{
		myStr =s;
	}
	public int countOccurrences(String s)
	{
		int charNum = 0;
		int index; 
		int foundStr = 0;

		do 
		{
			index = myStr.indexOf(s,charNum);
			if (index >= 0) {
				charNum = index + 1;
				foundStr++;
			}

		}while (index >= 0);
		return foundStr; 
	}




	public int countOccurrences(char c)
	{
		int charNum = 0;
		int index; 
		int foundChar = 0;

		do 
		{
			index = myStr.indexOf(c,charNum);
			if (index >= 0) {
				charNum = index + 1;
				foundChar++;
			}

		}while (index >= 0);
		return foundChar; 
	}
	int countUpperCaseLetters()
	{
		int isCapital = 0;

		for (int i=0; i<myStr.length();i++) {

			if (Character.isUpperCase(myStr.charAt(i))) {
				isCapital++;
			}
		}

		return isCapital;

	}
	int countLowerCaseLetters()
	{

		int isLower = 0;

		for (int i=0; i<myStr.length();i++) {

			if (Character.isLowerCase(myStr.charAt(i))) {
				isLower++;
			}
		}

		return isLower;
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
