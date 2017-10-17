package string_methods;
import java.util.Scanner;

public class MyStringMethods {
	private String myStr="";
	public void readString()
	{
	// Prompt the user and read in a String from a Scanner class from the keyboard
	// with the nextLine() method and store it in "myStr"
		System.out.println("Enter a string : ");
		Scanner scan = new Scanner(System.in);
		myStr = scan.nextLine();
		scan.close();
	}
	public void setString(String s)
	{
	myStr =s;
	}
	public int countOccurrences(String s)
	{
	// use indexOf and return the number of occurrences of the string "s" in "myStr"
		int count = 0;
		int index = myStr.indexOf(s);
		while(index >=0) {
			index = myStr.indexOf(s, index+1);
			count += 1;
		}
		return count;
	}
	public int countOccurrences(char c)
	{
	// use indexOf and return the number of occurrences of the character "c" in "myStr"
		int count = 0;
		int index = myStr.indexOf(c);
		while(index >=0) {
			index = myStr.indexOf(c, index+1);
			count += 1;
		}
		return count;
	}
	int countUpperCaseLetters()
	{
	// return the number of upper case letters in "myStr"
		int count = 0;
		for (int i =0; i < myStr.length(); i++) {
			char u = myStr.charAt(i);
			if (u >= 'A' && u <= 'Z')
				count += 1;			
		}		
		return count;
	}
	int countLowerCaseLetters()
	{
	// return the number of lower case letters in "myStr"
		int count = 0;
		for (int i =0; i < myStr.length(); i++) {
			char l = myStr.charAt(i);
			if (l >= 'a' && l <= 'z')
				count += 1;			
		}		
		return count;
	}
	public void printCounts(String s, char c)
	{
	System.out.println("***************************************");
	System.out.println("Analyzing: myStr="+myStr);
	System.out.println("Number of Upper case letters="+countUpperCaseLetters());
	System.out.println("Number of Lower case letters="+countLowerCaseLetters());
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
