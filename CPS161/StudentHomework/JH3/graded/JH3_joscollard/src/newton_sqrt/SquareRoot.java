package newton_sqrt;
import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter square root N: ");
		double N = scan.nextDouble();
		double accuracy = 1;
		double guess = 1;
		
		while (accuracy >= .000001) {
			double next_guess = ((N/guess)+guess)/2;
			
			accuracy = guess - next_guess;
			if (accuracy < 0)
				accuracy = - accuracy;
			guess = next_guess;			
		}
		System.out.println("Newton("+N+")= "+ guess);
		System.out.println("Math.sqrt = " + Math.sqrt(N));
		
		scan.close();
	}
	

}
