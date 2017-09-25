package factorial;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Value for N: ");
			int nVal = keyboard.nextInt();
			
			int factorial = 1;
			for(int curNum = 0; curNum < nVal; curNum++) {
				factorial *= nVal - curNum;
			}
			
			System.out.printf("Factorial of %d: %d\n", nVal, factorial);
			
			System.out.print("Would you like to continue? (y/n): ");
			
			if (keyboard.next().startsWith("n"))
				break;
		}
		
		System.out.print("Have a nice day!");
		
		keyboard.close();
	}
}
