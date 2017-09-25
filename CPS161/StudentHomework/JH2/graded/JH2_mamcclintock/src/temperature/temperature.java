package temperature;
import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// Create scanner 
		Scanner keyboard = new Scanner(System.in);
       
		// Initialize variable to control iteration of while loop
		double temperatureC = 0; 
		double temperatureF = 0;
		// Initialize variables to count number of temperatures entered and running total of temperatures
		double count = 0;
		double totalF = 0;
		double totalC = 0;
		
		//Begin while loop
		while (temperatureC>-100.0){
		//Prompt user for temperature or quit command
			System.out.println("Enter Temp in Centigrade or <= -100.0 to quit:");
			temperatureC = keyboard.nextInt();
        
			if (temperatureC>-100){
				//Convert C to F
				temperatureF = (temperatureC*1.8)+32;
				System.out.println("Temperature: F: (" + temperatureF + ") " + "C: (" + temperatureC + ")");
				count = count+1;
				totalF = totalF+temperatureF;
				totalC = totalC+temperatureC;
				}
			}
		keyboard.close();
		
		// Print out average Centigrade and Fahrenheit temperatures, disregarding last "quit" command entry
		System.out.println("");
		System.out.println("Average Temperature: F: (" + (totalF)/(count) + ") " + "C: (" + (totalC)/(count) + ")");
		
	}

}
