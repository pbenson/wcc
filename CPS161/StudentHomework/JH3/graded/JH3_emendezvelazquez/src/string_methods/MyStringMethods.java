package string_methods;

import java.util.Scanner;

public class MyStringMethods 
{
private 	String myStr="";

    public void readString() 

{
  

    	Scanner keyboard = new Scanner(System.in);
    	
    	System.out.print( " Enter desired string " );
    
    	 myStr = keyboard.nextLine();
    	

    }
    
    
    private char charAt(String nextLine) {
		// TODO Auto-generated method stub
		return 0;
	}


	public void setString(String s)
    {
String myStr = s; }
    public int countOccurrences1(String s) {

    int count = 0;
    boolean keeplooping = true; 
    int position = 0;
    
    	while (keeplooping) {
    		
    		
			position = myStr.indexOf(s, position+1);
    			if (position >=0)
    				count +=1;
    	}
    	System.out.println( "found " + count + " s's ");
    			
    return count;
// use indexOf and return the number of occurrences of the string "s" in "myStr"
    }
    public int countOccurrences(char c)
   
    {
    	return 1;
// use indexOf and return the number of occurrences of the character "c" in "myStr"
    }
    int countUpperCaseLetters() {
  

        int count = 0;
   
        int position = 0;
        	
        for (int x = 0; x < myStr.length(); x++) {
        		
          char upper = myStr.charAt(x);
        			if (upper >= 'A'&& upper <= 'Z')
        				count +=1;
        	}
        	
			return position;
    	
    }

// return the number of upper case letters in "myStr" }
    int countLowerCaseLetters()
    { int count = 0;

    int position = 0;
    
    for (int x = 0; x < myStr.length(); x++) {
    		
    		char lower = myStr.charAt(x);
    			if (lower >= 'a'&& lower <= 'z')
    				count +=1;
    	}
    	
		return position;
    
    }
    public void printCounts(String s, char c)
    {
System.out.println("***************************************"); System.out.println("Analyzing: myStr="+ myStr); System.out.println("Number of Upper case letters="+
countUpperCaseLetters());
System.out.println("Number of Lower case letters="+ countLowerCaseLetters());

System.out.println("Number of "+ s + " is "+ countOccurrences1(s)); System.out.println("Number of "+c + " is "+ countOccurrences(c));
}
    public static void main(String[] args) { MyStringMethods msm = new MyStringMethods(); msm.readString();

msm.printCounts("Big ", 'a');
msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
    }}
//msm.printCounts("van", 'a');
//MyStringMethods msm2 = new MyStringMethods(); msm2.setString("the elephant in the room wouldn't budge"); msm2.printCounts("the", 'i');