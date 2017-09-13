package averager;

import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1 = keyboard.nextInt();
		
		System.out.println("Enter second number:");
		num2 = keyboard.nextInt();
		
		System.out.println("Enter third number:");
		num3 = keyboard.nextInt();
		
		answer = (num1 + num2 + num3) / 3;
		
		System.out.println("The average of ");
		System.out.println(+ num1);
		System.out.println(+ num2);
		System.out.println(+ num3);
		System.out.println("= " + answer);
		// TODO Auto-generated method stub

	}

}
