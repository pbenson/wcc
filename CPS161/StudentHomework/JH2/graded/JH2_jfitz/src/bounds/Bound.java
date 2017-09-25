package bounds;
import java.util.Scanner;

public class Bound {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the starting number: ");
		int startNum = keyboard.nextInt();
		
		System.out.print("Enter the upper bound: ");
		int upperBound = keyboard.nextInt();
		
		System.out.print("Enter the step size: ");
		int stepSize = keyboard.nextInt();
		
		int counter = 1;
		
		for (int numb = startNum; numb < upperBound; numb += stepSize)
		{
			System.out.print(numb + (counter % 10 == 0 ? "\n" : " "));
			
			counter++;
		}
		
		keyboard.close();
	}
}
