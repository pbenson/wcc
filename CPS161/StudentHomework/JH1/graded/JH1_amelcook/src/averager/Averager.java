package averager;

import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Let's find the average of 3 numbers.");
		
		System.out.println("Enter value a: ");
		a = keyboard.nextInt();
		System.out.println("Enter value b: ");
		b = keyboard.nextInt();
		System.out.println("Enter value c: ");
		c = keyboard.nextInt();
		
		answer = (a + b + c) / 3;
		System.out.println("The average value of a + b + c = " + answer);
		
		keyboard.close();
	}

}
