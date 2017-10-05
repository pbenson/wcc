package string_methods;
// Starting Template
import java.util.Scanner;
public class MyStringMethods {
    private String myStr="";
    public void readString(){
    	// Read in String from user
    	System.out.println("Please enter a String:");
    	Scanner scan = new Scanner(System.in);
    	myStr = scan.nextLine();
    	scan.close();
    }
    
    public void setString(String s){
    	myStr =s; 
    	}
    
    public int countOccurrences(String s){
    	String myString=myStr;
    	int count=0;
    	while (myString.indexOf(s)!=-1){
    		count++;
    		myString=myString.substring(myString.indexOf(s)+1);
    		}
    	return count;
    }
    
    public int countOccurrences(char c){
    	int count=0;
    	for (int i=0; i<(myStr.length()); i++){
    		if ((myStr.charAt(i))==c){
    		count++;
    		}
    	}
    	return count;    
    	}
    
    int countUpperCaseLetters(){
        	int count=0;
        	for (int i=0; i<(myStr.length()); i++){
        		if (Character.isUpperCase(myStr.charAt(i))){
        		count++;
        		}
        	}
        	return count;      	
        	}
    
    int countLowerCaseLetters(){
    	int count=0;
    	for (int i=0; i<(myStr.length()); i++){
    		if (Character.isLowerCase(myStr.charAt(i))){
    		count++;
    		}
    	}
    	return count;  
    }
    
    public void printCounts(String s, char c){
    	System.out.println("***************************************"); System.out.println("Analyzing: myStr="+myStr); System.out.println("Number of Upper case letters="+countUpperCaseLetters());
    	System.out.println("Number of Lower case letters="+ countLowerCaseLetters());
    	System.out.println("Number of "+s + " is "+ countOccurrences(s)); System.out.println("Number of "+c + " is "+ countOccurrences(c));
    	}
    public static void main(String[] args) { 
    	MyStringMethods msm = new MyStringMethods(); 
    	msm.readString();
    	msm.printCounts("big", 'a');
    	msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
    	} 
    }
