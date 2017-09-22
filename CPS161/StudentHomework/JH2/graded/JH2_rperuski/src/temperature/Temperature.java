package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		double temp_Cen=0, temp_Far, avg_Cen=0, avg_Far=0;
	    int userCount=0;
	    
	    System.out.println("Please enter the temperature in Celsius or enter <= -100 to quit: ");
        Scanner keyboard = new Scanner(System.in);
        temp_Cen=keyboard.nextDouble();
        
  
	    do {
	    		
            avg_Cen+=temp_Cen;
           
            temp_Far = (9.0/5.0)*temp_Cen + 32.0;
            avg_Far+=temp_Far;
            
            System.out.println("The temperature of " + temp_Cen + " is " +
  	    		  temp_Far + " Farenheit.");
	  	    
            userCount++;   
	  	    
            System.out.println("Please enter the temperature in Celsius or enter <= -100 to quit: ");
	  	    temp_Cen=keyboard.nextDouble();
	  	 
	    } while (temp_Cen>-100);
	    
	    	avg_Cen = (avg_Cen)/userCount;
	    	avg_Far = avg_Far/userCount;
	    	keyboard.close();
	    System.out.println("The average temp in Celsius is " + avg_Cen + " and in Farenheit is " + avg_Far);
	    }

	     
	    
}
