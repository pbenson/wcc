package Averager;

import java.util.Scanner;

public class averager {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int answer;
		
		Scanner keyboard = new Scanner(System.in);
		
        System.out.println("Enter number 1:");
        num1 = keyboard.nextInt();
        System.out.println("Enter number 2:");
        num2 = keyboard.nextInt();
        System.out.println("Enter number 3:");
        num3 = keyboard.nextInt();
        answer = (num1 + num2 + num3) / 3;
        		
        System.out.println("The average is =" + answer);
	}

}
