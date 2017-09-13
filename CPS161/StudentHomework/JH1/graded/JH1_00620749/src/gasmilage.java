/**Programmer: Trevor Bean 
 * Program: Basic Gas Mileage
 * Teacher: Peter Benson**/
import java.util.Scanner;

/**Programmer: Trevor Bean 
 * Program: Basic Gas Mileage
 * Teacher: Peter Benson**/

public class gasmilage 
{
	public static void main(String[] args)
	{
		float gm;
		System.out.println("Hello, welcome to the gas milage Identifier \n Please input your Gallons used, and the distance traveled.");
		Scanner keyboard = new Scanner(System.in);
		float gas = keyboard.nextFloat();
		float dist = keyboard.nextFloat();
		gm = dist/gas;
		keyboard.close();
		System.out.print("Traveling " + dist +  " Miles with "+ gas + " Gallons of gas means your Gas milage is "+ gm);
	}

}
