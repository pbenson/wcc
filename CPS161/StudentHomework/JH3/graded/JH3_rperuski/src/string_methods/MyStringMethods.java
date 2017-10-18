package string_methods;
// Starting Template
import java.util.Scanner;
import java.lang.Character;


public class MyStringMethods {
 private String myStr="";

 public void readString()
 {
	 System.out.println("Please enter a string: ");
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
 // use indexOf and return the number of occurrences of the string "s"in "myStr"	
	int sCount= 0;
	int start = 0;
	
	
	while(true) {
		int found = myStr.indexOf(s, start);
		if (found != -1) {
			sCount++;
		}
		
		if (found==-1) break;
		start = found + s.length();
	}
	
	return sCount;
 }
 public int countOccurrences(char c)
 {
 // use indexOf and return the number of occurrences of the character "c" in "myStr"
	 	int cCount= 0;
		int start = 0;
		
		
		while(true) {
			int found = myStr.indexOf(c, start);
			if (found != -1) {
				cCount++;
			}
			
			if (found==-1) break;
			start = found+1;
		}
		
	
	 
//	I personally like a for loop better and initially did it this way
//	int cCount=0;
//	 for (int i=0; i<myStr.length(); i++) {
//		 if (myStr.charAt(i) == c) {
//			 cCount++;
//			 
//		 }
//	 }
	 return cCount;
 }
 int countUpperCaseLetters()
 {
 // return the number of upper case letters in "myStr"
	 int uCount=0;
	 for(int i=0; i<myStr.length(); i++) {
		 if (Character.isUpperCase(myStr.charAt(i))) {
			 uCount++;
			
		 }
	 }
	 return uCount;
 }
 int countLowerCaseLetters()
 {
 // return the number of lower case letters in "myStr"
	 int lCount=0;
	 for(int i=0; i<myStr.length(); i++) {
		 if (Character.isLowerCase(myStr.charAt(i))) {
			 lCount++;
		 }
	 }
	 return lCount;
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

 msm.setString("Parked in a van down by the river bank .... The van vanished near a lot of other vans");
 msm.printCounts("van", 'a');

 MyStringMethods msm2 = new MyStringMethods();
 msm2.setString("the elephant in the room wouldn't budge");
 msm2.printCounts("the", 'i');
 }
}

