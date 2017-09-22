package bounds;

import java.util.Scanner;

public class Bounds {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Lower Bound: ");
		int lowerBound = keyboard.nextInt();//2
		System.out.print("Enter Upper Bound: ");
		int upperBound = keyboard.nextInt();//90
		System.out.print("Enter Step Size: ");
		int stepSize = keyboard.nextInt();//4
		int currentNum = lowerBound;

		for(int n = lowerBound; n<upperBound ; n=n+stepSize ) {

			for (int x = 1; x <= 10; x++) {
				System.out.print(currentNum + " ");
				if(upperBound==stepSize+currentNum) {
					break;}//Im sorry im using a lazy way
				currentNum = currentNum + stepSize;

			}if(upperBound==stepSize+currentNum) {
				break;}
			System.out.println(" ");
			
			
			
			
		}
		keyboard.close();
	}

}
