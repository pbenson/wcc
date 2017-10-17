/**
 * 
 */
/**
 * @author kimberlypflug
 *
 */
package string_methods;


import java.util.Scanner;

public class MyStringMethods {
	 private String myStr="";
	 
	 public void readString()
	 {
		// prompt the user and read in a String from a Scanner class from the keyboard
		// with the nextLine() method and store it in "myStr"
		 
		 System.out.println ( "Enter in the desired String");
		 Scanner scanner = new Scanner(System.in);
		 myStr = scanner.nextLine(); 
	 }
	 
	 public void setString(String s)
	 {
		 myStr =s;
	 }
	  
	 public int countOccurrences(String s)
	 {		
		 // use indexOf and return the number of occurrences of the string "s" in "myStr"	 
				
		 int i = 0; 
		 int count = 0; 
		 boolean occurences = true; 
		 
		 
		 while ( occurences == true )
			 if (myStr.indexOf(s, i) >= 0)
			 {
				 i = myStr.indexOf ( s, i) +1; 
				 count +=1; 
			 }
			 
			 else 
				 occurences  = false;
	
		 return count;
	 }
	 
	  public int countOccurrences(char c)
	  {
		 
				// use indexOf and return the number of occurrences of the character "c" in "myStr"
		  int i = 0; 
			 int count = 0; 
			 boolean occurences = true; 
			 
			 
			 while ( occurences == true )
				 if (myStr.indexOf(c, i) >= 0)
				 {
					 i = myStr.indexOf ( c, i) +1; 
					 count +=1; 
				 }
				 
				 else 
					 occurences  = false;
		
			 return count;
	  }
	  
	  int countUpperCaseLetters()
	    {
		
	// return the number of upper case letters in "myStr" 
	 
	      int len = myStr.length();
		  int count = 0;
		  for (int i = 0; i < len; i++)
		  {  
		  if (myStr.charAt(i) >= 'A' && myStr.charAt(i) <= 'Z')
			  count += 1; 
		  }
		 return count;
	    }
	  
	  int countLowerCaseLetters()
	    {
		 		  
		  int len = myStr.length();
		  int count = 0;
		  for (int i = 0; i < len; i++)
		  {  
		  if (myStr.charAt(i) >= 'a' && myStr.charAt(i) <= 'z')
			  count += 1; 
		  }
		 return count;
	    }
	    
	  public void printCounts(String s, char c)
	    {
		  System.out.println("***************************************"); 
		  System.out.println("Analyzing: myStr="+myStr); 
		  System.out.println("Number of Upper case letters="+ countUpperCaseLetters());
		  System.out.println("Number of Lower case letters="+ countLowerCaseLetters());
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
				  
				  