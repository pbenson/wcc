import java.util.Scanner;
public class GasMileage {
	public static void main(String[] args) {
		double miles; 
		double gallons; 
		double mileage; 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter miles traveled:");
		miles = keyboard.nextDouble();
		System.out.println("Enter gas Consumed:");
		gallons = keyboard.nextDouble();
		keyboard.close();
		mileage = miles / gallons; 
		System.out.println("Your gas mileage is "+ mileage +" miles per gallon.");
	}
}