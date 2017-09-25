package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNum;
		int upperBound;
		int stepSize;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Starting Number: ");
		startNum = keyboard.nextInt();
		
		System.out.println("Enter Upper Bound: ");
		upperBound = keyboard.nextInt();
		
		System.out.println("Enter Step Size: ");
		stepSize = keyboard.nextInt();
		
		int result = startNum;
		while (result <= upperBound) {
			System.out.println(result);
			
			result = result + stepSize;
		}
		keyboard.close();
	}

}
