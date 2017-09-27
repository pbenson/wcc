package temperature;
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the Centigrade to Farenheit converter!");
		System.out.println("In order to quit this program, input a value below or equal to -100.");
		
		int userInputs = 0;
		double totalTempCentigrade = 0;
		
		while(true)
		{
			System.out.print("Enter temperature in Centigrade: ");
			double tempCentigrade = keyboard.nextDouble();
			if (tempCentigrade <= -100) {
				break;
			}
			double tempFarenheit = toFarenheit(tempCentigrade);
			
			System.out.printf("Temperature: F(%f) C(%f)\n", tempFarenheit, tempCentigrade);
			userInputs++;
			totalTempCentigrade += tempCentigrade; 
		}
		
		System.out.printf("Average: F(%f) C(%f)", 
							toFarenheit(totalTempCentigrade / userInputs), 
							totalTempCentigrade/ userInputs);
		
		keyboard.close();
		
	}
	static double toFarenheit(double centigrade) {
		return 9d / 5 * centigrade + 32;
	}
}
