package factorial;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args){
   String answer = "y";
   int num=3, factor=1;
   int n=1;

   while (answer.equals("y")) {
	   System.out.println("Enter an integer to factor: ");
	   Scanner keyboard = new Scanner(System.in);
	   num=keyboard.nextInt();
	   
	     while (n<=num){
	      factor = factor * n;
	     
	      n++;
	     }
	     
	     System.out.println("The factorial is " + factor);
	     
	     System.out.println("Would you like to factor another number? y or n");
	     Scanner input = new Scanner(System.in);
	     answer = input.nextLine();
	     
	     if (answer.equals("n")) {
	    	 keyboard.close();
	    	 input.close();
	     }
	     
   }
   
   
}
  	
  }
