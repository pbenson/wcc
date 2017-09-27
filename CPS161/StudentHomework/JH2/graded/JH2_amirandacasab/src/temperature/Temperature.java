package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		double centigrade;
		double fahrenheit = 0;
		int count = -1;
		double totalCentigrade = 0;
		double totalFahrenheit = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter Temp in Centigrade or <= -100 to quit: ");
			centigrade = keyboard.nextDouble();
			
			count += 1;
			
			if (centigrade > -100) {
				fahrenheit = ((1.8) * centigrade) + 32;
				System.out.printf("Temperature: F(%.2f) C(%.2f)%n", fahrenheit, centigrade);
				totalCentigrade += centigrade;
				totalFahrenheit += fahrenheit;
			}
			
		} while (centigrade > -100);
		
		keyboard.close();
		
		System.out.println();
		System.out.println("You're done! Your average temperatures: ");
		
		double avgCentigrade = totalCentigrade / count;
		double avgFahrenheit = totalFahrenheit / count;
		
		System.out.printf("Average Centigrade: C(%.2f)%n", avgCentigrade);
		System.out.printf("Average Fahrenheit: F(%.2f)%n", avgFahrenheit);

	}

}