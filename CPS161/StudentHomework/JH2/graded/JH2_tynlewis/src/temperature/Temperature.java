package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	
	double currentDegreesCentigrade = 0, currentDegreesFahrenheit, totalDegreesCentigrade = 0, totalDegreesFahrenheit = 0;
	int userInputCount = 0;
	
	while(currentDegreesCentigrade > -100) {
		
		System.out.print("What is the temperature in Centigrade? (Enter a number <= -100 to exit): ");
		currentDegreesCentigrade = keyboard.nextDouble();
		
		if(currentDegreesCentigrade > -100) {
			currentDegreesFahrenheit = (9.0/5.0) * currentDegreesCentigrade + 32.0;
			totalDegreesCentigrade += currentDegreesCentigrade;
			totalDegreesFahrenheit += currentDegreesFahrenheit;
			userInputCount++;
			System.out.printf("Temperature: F(%.1f) C(%.1f)%n", currentDegreesFahrenheit, currentDegreesCentigrade);			
		}
	}
	
	keyboard.close();
	
	System.out.printf("%nAverage: Centigrade(%.1f) Average: Fahrenheit(%.1f)", totalDegreesCentigrade / userInputCount, totalDegreesFahrenheit / userInputCount );

	}

}
