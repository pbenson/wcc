package Temperature;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		double centigrade = 0;
		double fahrenheit;
		double totalCentigrade = 0;
		double totalFahrenheit = 0;
		double count = 0;

	    Scanner keyboard = new Scanner(System.in);
	    
	    while (true) {
	    		System.out.println("Enter temperature in Centigrade or <= -100.0 to quit:");
	    		centigrade = keyboard.nextDouble();
	    		
	    		if (centigrade <= -100) { 
	    			break; 
    			}
	    		
	    		fahrenheit = (9.0/5.0)*centigrade + 32.0;
	    		
	    		totalCentigrade += centigrade;
	    		totalFahrenheit+= fahrenheit;
	    		count += 1;
	    		
	    		System.out.println("Temperature: F(" + fahrenheit + ") C(" + centigrade + ")");
	    }
	    
	    double avgCentigrade = totalCentigrade / count;
	    double avgFahrenheit = totalFahrenheit / count;
	    System.out.println("Avg.temperature: F(" + avgFahrenheit + ") C(" + avgCentigrade + ")");
    }
}
