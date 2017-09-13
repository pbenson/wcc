package jar;
import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		int numQuarters, numDimes, numNickels, numPennies;
		
		
		System.out.println("Please enter the amount of Quarters: ");
		Scanner keyboard = new Scanner(System.in);
		numQuarters = keyboard.nextInt();
		System.out.println("Please enter the amount of Dimes: ");
		numDimes = keyboard.nextInt();
		System.out.println("Please enter the amount of Nickles: ");
		numNickels = keyboard.nextInt();
		System.out.println("Please enter the amount of Quarters: ");
		numPennies = keyboard.nextInt();
		
		double quarterVal = numQuarters*.25; 
		double dimeVal = numDimes*.10; 
		double nickelVal=numNickels*.05; 
		double penniesVal=numPennies*.01;
		
		double total = quarterVal + dimeVal + nickelVal + penniesVal;
		
		System.out.println("Total value: " + total + " cents");
	}
}
