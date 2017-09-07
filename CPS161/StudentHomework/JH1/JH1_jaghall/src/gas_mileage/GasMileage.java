package gas_mileage;
import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		double gallons;
		
		double miles;
		double answer;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter gallons of gas consumed");
		gallons = keyboard.nextDouble();
		
		System.out.println("Enter distance traveled (miles)");
		miles = keyboard.nextDouble();
		
		answer = miles / gallons;
		
		System.out.println(answer + " miles per gallon");
	}

}