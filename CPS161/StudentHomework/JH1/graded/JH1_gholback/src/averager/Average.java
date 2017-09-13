package averager;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		
		int firstInt;
		int secondInt;
		int thirdInt;
		int average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter three integers in order to find their average");
		
		firstInt = keyboard.nextInt();
		secondInt = keyboard.nextInt();
		thirdInt = keyboard.nextInt();
		
		average = (firstInt + secondInt + thirdInt)/3;
		
		System.out.println("The average of " + firstInt + ", " + secondInt + ", and " + thirdInt + " is " + average);
		
		keyboard.close();	
	}
}
