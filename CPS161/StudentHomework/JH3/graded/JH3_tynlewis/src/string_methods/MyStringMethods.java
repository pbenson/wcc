package string_methods;

import java.util.Scanner;

public class MyStringMethods { 

	private String myStr="";
	private int myStrLen = 0;
	private int count;
	private int index;

	public void readString(){

		// Prompt the user and read in a String from a Scanner class from the keyboard           
		// with the nextLine() method and store it in "myStr" 

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in the desired String: ");
		setString(keyboard.nextLine());
		keyboard.close();
	}     

	public void setString(String s){         
		myStr = s;
		myStrLen = myStr.length();
	}     

	public int countOccurrences(String s){  

		// use indexOf and return the number of occurrences of the string "s" in "myStr"   
		count = 0;
		index = 0;

		if (myStr.indexOf(s) >= 0){
			do{
				count++;
				index = myStr.indexOf(s, index) + 1;
			} while (myStr.indexOf(s, index) > 0);
		}
		return count;
	}     

	public int countOccurrences(char c){

		// use indexOf and return the number of occurrences of the character "c" in "myStr" 
		count = 0;
		index = 0;

		if (myStr.indexOf(c) >= 0){		
			do{
				count++;
				index = myStr.indexOf(c, index) + 1;
			} while (myStr.indexOf(c, index) > 0);
		}
		return count;
	}     

	int countUpperCaseLetters(){         

		// return the number of upper case letters in "myStr"
		index = 0;
		count = 0;

		while(index < myStrLen){
			if(Character.isUpperCase(myStr.charAt(index))){
				count++;
			}
			index++;
		}	
		return count;
	} 

	int countLowerCaseLetters(){ 
		// return the number of lower case letters in "myStr"     
		index = 0;
		count = 0;

		while(index < myStrLen){
			if(Character.isLowerCase(myStr.charAt(index))){
				count++;
			}
			index++;
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
		System.out.println("Number of "+c + " is "+ countOccurrences(c));     } 

} 