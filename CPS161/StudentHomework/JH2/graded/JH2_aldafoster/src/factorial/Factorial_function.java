package factorial;
import java.util.Scanner;

public class Factorial_function {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String quit = "";
		
	do {
		int N;
		int x = 1;
		int factorial = 1;
		
		
		System.out.println("Enter in N: ");
		N = keyboard.nextInt();
		
		while (x <= N) {
			factorial *= x;
			x++;
			
		};
		System.out.println("Fatorial = " + factorial);
		System.out.println("Do you want to continue?: (y/n): ");
		quit = keyboard.next();
				
	}while(!quit.equals("n"));
	System.exit(0);

	}

}
