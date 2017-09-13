package gas_mileage;
import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		float dist;
		float gallons;
		
		System.out.println("Distance traveled:");
		dist = keyboard.nextFloat();
		
		System.out.println("Gallons of gas consumed:");
		gallons = keyboard.nextFloat();
		
		System.out.printf("The gas mileage of your car is: %f" + " miles per gallon", dist / gallons);
		
		keyboard.close();
	}
}
