package gas_mileage;
import java.util.Scanner;

public class GasMileage {
	
	public static void main(String[] args) {
		double distance;
		double gas;
		double mpg;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter distance (miles): ");
		distance = keyboard.nextDouble();
		
		System.out.println("Enter gas used (gallons): ");
		gas = keyboard.nextDouble();
		
		mpg = distance/gas;
		
		System.out.printf("Your car has %.2f mpg.", mpg);
		
	}
}
