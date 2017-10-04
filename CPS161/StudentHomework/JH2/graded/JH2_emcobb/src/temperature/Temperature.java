package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	
	double fahrenheitTemp;
	double averageCelsius = 0;
	double averageFahrenheit = 0;
	double userInputs = 0;
	
	while(true) {
			
		System.out.println("Please enter the temperature in centigrade or "
				+ "<= -100 to quit.");
		double temperature = keyboard.nextDouble();
	
		if (temperature <= -100) {
			break;
			
		}
	
		else {
			fahrenheitTemp = temperature * (9.0/5.0) + 32.0;
			averageCelsius += temperature;
			averageFahrenheit += fahrenheitTemp;
			++userInputs;
		}
			
		System.out.println("Temperature: F(" + fahrenheitTemp + ") C(" +
		temperature + ")");
		
		
	}
	
	System.out.println("Average: Centigrade(" + averageCelsius/userInputs + 
			") Average: Fahrenheit(" + averageFahrenheit/userInputs + ")");
	
		keyboard.close();
	
	}
	
}
