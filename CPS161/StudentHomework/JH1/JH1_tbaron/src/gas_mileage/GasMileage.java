package gas_mileage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GasMileage {
    
		public static void main(String[] args) {
	        
			float galGasCons;   
	        float distance; 
	        float mpg;
	        
	        
	        Scanner keyboard = new Scanner(System.in);
	        
	        System.out.println("Enter gallons of gas consumed");
	        galGasCons = keyboard.nextFloat();
	        
	        System.out.println("distance traveled");
	        distance = keyboard.nextFloat();
	        
	        mpg = distance / galGasCons; 
	        
	        DecimalFormat numberFormat = new DecimalFormat("#");
	        /*DecimalFormat numberFormat = new DecimalFormat("#.00") for reference;*/
	        /* System.out.println(numberFormat.format(mpg)); for reference */
	        
	        System.out.println("Your vehicle gets " + mpg + " miles per gallon"); 
	        System.out.println("Considering significant digits, your vehicle gets " + numberFormat.format(mpg) + " miles per gallon");     
	    }
}