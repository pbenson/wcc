package gas_mileage;
import java.util.Scanner;

class gas_mileage {

	public static void main(String[] args) {
		 	double numgallons;
	        double distance;
	        double milespergallon;
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Enter number of gallons");
	        numgallons = keyboard.nextDouble();
	        System.out.println("Enter distance traveled");
	        distance = keyboard.nextDouble();
	        milespergallon = distance / numgallons;
	        System.out.println(" The miles per gallon is " + milespergallon);
	}

}
