package make_change;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;

public class MakeChange {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter price:");
		float price = 100 * keyboard.nextFloat();
		
		System.out.println("Enter money recieved:");
		float recieved = 100 * keyboard.nextFloat();
		
		keyboard.close();
		
		checkVars(price, recieved);
		
		int difference = (int)(recieved - price);
		
		int dollars = difference / 100;
		difference = difference % 100;
		
		int quarters = difference / 25;
		difference = difference % 25;
		
		int dimes = difference / 10;
		difference = difference % 10;
		
		int nickels = difference / 5;
		difference = difference % 5;
		
		int pennies = difference;
		
		System.out.printf("Dollar(s): %d\nQuarter(s): %d\nDime(s): %d\nNickel(s): %d\nPennies: %d", 
				  		  dollars, quarters, dimes, nickels, pennies);
		
	}
	static void checkVars(float price, float recieved) {
		if((int)price != price) {
			throw new IndexOutOfBoundsException(
						"The price entered: $" + price / 100 + " had too many decimal digits");
		}
		if((int)recieved != recieved) {
			throw new IndexOutOfBoundsException(
						"The price entered: $" + recieved / 100 + " had too many decimal digits");
		}
		if(price > recieved) {
			throw new IndexOutOfBoundsException(
						"The recieved amount of money (" + recieved / 100 + 
						") must be greater than the price (" + price / 100);
		}
	}
}