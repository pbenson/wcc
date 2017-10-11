
package string_methods;

// Starting Template
import java.util.Scanner;

public class MyStringMethods {
	private String myStr = "";

	public void readString()
{
// Prompt the user and read in a String from a Scanner class from the keyboard
// with the nextLine() method and store it in "myStr" 
		System.out.println ("Enter in the desired String: ");
		Scanner keyboard= new Scanner (System.in);
		myStr= keyboard.nextLine();
    }

	public void setString(String s) {
		myStr = s;
	}

	public int countOccurrences(String s) {
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
		int start =0;
        int indexs;
        int countOccurrences_s =0;

        do
        {
            indexs = myStr.indexOf(s,start);
            if ( indexs >= 0)
            {
                start = indexs +1;
                countOccurrences_s += 1;
            }

        } while (indexs >= 0);
		
//	        int counter =0;
//
//	        for(int i=0;i<s.length();i++)
//	        {
//	        		if('s'==s.charAt(i))
//	        		{
//	        			counter++;
//	        		}
//	        }
//	        	
		return countOccurrences_s;	
	}

	public int countOccurrences(char c) {
		// use indexOf and return the number of occurrences of the character "c" in
		// "myStr"
		int start =0;
        int indexc;
        int countOccurrences_c =0;

        do
        {
            indexc = myStr.indexOf(c,start);
            if ( indexc >= 0)
            {
                start = indexc +1;
                countOccurrences_c += 1;
            }

        } while (indexc >= 0);

	    //why I cannot put s. here? 
		return countOccurrences_c;
	}

	int countUpperCaseLetters()
	{
		int countUpperCaseLetters=0; 
		for (int i =0; i < myStr.length( ); i++)
		 {
		     char c2 = myStr.charAt(i);
		     if (c2 >= 'A' && c2 <= 'Z')
		    	 {
		    	 	countUpperCaseLetters+=1;
		    	 }   
		     // do whatever you want with the character
		 }
		return countUpperCaseLetters;
		
	}
	// return the number of upper case letters in "myStr" }
		
	int countLowerCaseLetters() {
		// return the number of lower case letters in "myStr"
		int countLowerCaseLetters=0; 
		for (int i =0; i < myStr.length( ); i++)
		 {
		     char c3 = myStr.charAt(i);
		     if (c3 >= 'a' && c3 <= 'z')
		   {
		    	 countLowerCaseLetters+=1;  
		   }
		     // do whatever you want with the character
		 }
		return countLowerCaseLetters;
	
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
