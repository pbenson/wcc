package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// Local variable declaration/initialization
		double inputC        = 0;
		double inputF        = 0;
		double sumFahrenheit = 0;
		double sumCentigrade = 0;
		int totalInputs      = 0;
		Scanner keyboard     = new Scanner(System.in);
		
		// Main logic while loop. 
		// This is an infinite while loop and is only exited through an explicit break call to avoid calculating temperatures <= -100.
		while (true) {
			// Poll user input
			System.out.print("Enter Temp in Centigrade or <= -100 to quit: ");
			inputC = keyboard.nextInt();
			
			// Break condition
			if (inputC <= -100) {
				break;
			}
			
			// Calculate fahrenheit
			inputF = (9.0 / 5.0) * inputC + 32.0;
			System.out.printf("Temperature: F(%.1f) C(%.1f)\n", inputF, inputC);
			
			// Add to sums
			totalInputs++;
			sumFahrenheit += inputF;
			sumCentigrade += inputC;
		}
		
		// Averages
		System.out.printf("\nAverage: Centigrade(%.2f)  Average: Fahrenheit(%.2f)", sumCentigrade / totalInputs, sumFahrenheit / totalInputs);
		keyboard.close();
	}

}
