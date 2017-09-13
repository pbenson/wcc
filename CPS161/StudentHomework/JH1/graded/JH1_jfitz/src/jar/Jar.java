package jar;
import java.util.Scanner;

public class Jar {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int total = 0;
		for(int i = 0; i < 4; i++) {
			String coinType = i == 0 ? "quarter(s)" :
							  i == 1 ? "dime(s)" : 
							  i == 2 ? "nickel(s)" :
							           "pennies";
			System.out.println("Number of " + coinType + " in jar:");
			total += keyboard.nextInt() * (i == 0 ? 25 : 
											i == 1 ? 10 : 
											i == 2 ? 5 : 1);
		}
		
		System.out.printf("The jar contains %d cents", total);
		keyboard.close();
	}
}
