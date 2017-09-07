package averager;

import java.util.Scanner; 

public class Averager {
    
		public static void main(String[] args) {
	        
			int num1;  
	        int num2;   
	        int num3; 
	        int ave;
	        
	        
	        Scanner keyboard = new Scanner(System.in);
	        
	        System.out.println("Enter first number:");
	        num1 = keyboard.nextInt();
	        
	        System.out.println("Enter second number:");
	        num2 = keyboard.nextInt();
	        
	        System.out.println("Enter third number:");
	        num3 = keyboard.nextInt();
	        
	        
	        ave = (num1 + num2 + num3)/3;  
	        System.out.println("The average (mean) = " + ave);     
	    }
	}
	

