package temperature;

import java.util.Scanner;

public class Temperature3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		double tempC;
		double tempF;
		boolean tempCalculatorInProgress = true;
		double count = 0;
		double totalC = 0;
		double totalF = 0;
		
		while (tempCalculatorInProgress)
		{
			System.out.println("Enter the Temperature in Celsius or <= -100.0 to quit:");
			tempC = keyboard.nextDouble();
			
			if (tempC <= -100)
			{
				tempCalculatorInProgress = false;
				double aveC = totalC/count;
				double aveF = totalF/count;
				
				System.out.println("Average: Celsius: (" + aveC + ")");
				System.out.println("Average: Farenheit: (" + aveF + ")");
			}
			
			else if (tempC > -100)
			{
				tempF = (9.0/5.0) * tempC + 32.0;
				System.out.println("Temperature: F (" + tempF + ")" + " C (" + tempC + ")");
				count ++;
				totalC = totalC + tempC;
				totalF = totalF + tempF;
				
			}
	
				
		}
	}

}