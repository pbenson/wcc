package jar;

import java.text.DecimalFormat;
import java.util.Scanner; 

public class Jar {

	    
			public static void main(String[] args) {
		        
				int pennies;  
		        int nickels;   
		        int dimes;
		        int quarters; 	
		        float subtotal;
		        float total;
		        		        
		        Scanner keyboard = new Scanner(System.in);
		        
		        System.out.println("Enter the number of pennies:");
		        pennies = keyboard.nextInt();
		        
		        System.out.println("Enter the number of nickels:");
		        nickels = keyboard.nextInt();
		        
		        System.out.println("Enter the number of dimes:");
		        dimes = keyboard.nextInt();
		        
		        System.out.println("Enter the number of quarters:");
		        quarters = keyboard.nextInt();
		        
		        DecimalFormat numberFormat = new DecimalFormat("#.00");
		        /* System.out.println(numberFormat.format(total)); for reference */
		        
		        subtotal = 1*pennies + 5*nickels +10*dimes + 25*quarters;
		    
		        total = subtotal/100; 
		        System.out.println("The total is = $" + numberFormat.format(total));     
		    }
		}
	
	
