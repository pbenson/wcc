package temperature;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		
		  Scanner keyboard = new Scanner(System.in);
		  double Cent_temperature=0;
		  double Fah_temperature; 
		  
		  int count = 0;
		  double Fahrenheit_sum=0; 
		  double Centigrade_sum=0;
		  double Average_Fahrenheit; 
		  double Average_Centigrade;
		  
		
		  

		  	while (Cent_temperature > -100.0){
				  System.out.println ("Enter Temp in Centigrade or <= -100.0 to quit:");
				  Cent_temperature = keyboard.nextDouble( );

	        if (Cent_temperature <= -100.0) 
	         	break;
	      
		        		
		        		Fah_temperature = (Cent_temperature * (1.8) + 32);
		        	    System.out.println ( "Temperature: F(" + Fah_temperature + ")" + " C(" + Cent_temperature + ")");
		        	
		        	    count ++;
	       
		        	    Centigrade_sum = Centigrade_sum + Cent_temperature;
		        	    Fahrenheit_sum = Fahrenheit_sum + Fah_temperature;
		        	    
		  	} // end of while loop
			
		  	Average_Fahrenheit = Fahrenheit_sum/count;
			Average_Centigrade = Centigrade_sum/count;
			System.out.println("Average: Centigrade " +"(" + Average_Centigrade + ") " + "Average: Fahrenheit " + "(" + Average_Fahrenheit + ")" );
		  	
	}

}
	   




