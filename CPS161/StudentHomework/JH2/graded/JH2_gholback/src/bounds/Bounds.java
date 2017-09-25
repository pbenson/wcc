package bounds;

import java.util.Scanner;

public class Bounds {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the starting number?");
		int startI = keyboard.nextInt();

		System.out.println("What is the upper bound number?");
		int boundI = keyboard.nextInt();			

		System.out.println("What is the step interval number?");
		int stepI = keyboard.nextInt();

		int numsOnLine = 0;

		while (startI < boundI){
			System.out.print(startI + " ");

			startI += stepI;

			numsOnLine += 1;

			if((numsOnLine % 10) == 0){
				System.out.println();
			}

		}

		keyboard.close();

	}

}
