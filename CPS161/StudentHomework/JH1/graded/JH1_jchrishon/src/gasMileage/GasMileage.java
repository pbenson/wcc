/**
 * 
 */
/**
 * @author Julesia
 *
 */
package gasMileage;

import java.util.Scanner;
class GasMileage
{
	public static void main(String[] args)
	{
		double GasGallons ; //Gallons of gas consumed by car
		double Miles; // Miles car has traveled 
		double MilesPerGallon;
		//Start of Key board input
		
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter gallons of gas consumed");
		GasGallons = keyboard.nextDouble();
		System.out.println("Enter the number of miles travled");
		Miles = keyboard.nextDouble();
		MilesPerGallon = Miles/GasGallons ; // simple variable arithmetic
		System.out.println(" The miles per gallon are:"+ MilesPerGallon );
		keyboard.close();
	}
}