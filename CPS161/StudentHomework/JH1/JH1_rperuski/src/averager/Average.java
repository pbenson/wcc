package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		float average;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first whole number: ");
		a = keyboard.nextInt();
		System.out.println("Enter your second whole number: ");
		b = keyboard.nextInt();
		System.out.println("Enter your third whole number: ");
		c = keyboard.nextInt();
		
		average = (a+b+c)/3;
		System.out.println("The average is " + average);
	}

}
