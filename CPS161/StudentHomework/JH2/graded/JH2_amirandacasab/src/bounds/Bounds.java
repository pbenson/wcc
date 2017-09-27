package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter starting number:");
		int x = keyboard.nextInt();
		
		System.out.println("Enter upper bound:");
		int y = keyboard.nextInt();
		
		System.out.println("Enter step size:");
		int z = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.print("Your Starting Number: " + x + " ");
		System.out.print("Your Upper Bound: " + y + " ");
		System.out.println("Your Interval Size: " + z + " ");
		
		int count = 0;
		
		while (x < y) {
			count += 1;
			System.out.print(x + " ");
			x += z;
			if ( (count % 10) == 0) {
				count = 0;
				System.out.println();
			}
		}
	}
}