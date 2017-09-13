package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		double gas;
		double distance;
		double answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How much gas was consumed by your car?");
		gas = keyboard.nextDouble();
		
		System.out.println("How far did you travel?");
		distance = keyboard.nextDouble();
		
		answer = distance / gas;
		
		System.out.println(answer+" miles to the gallon");
	}

}
