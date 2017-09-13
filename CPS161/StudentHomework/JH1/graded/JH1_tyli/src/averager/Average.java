package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Float num1;
		Float num2;
		Float num3;
		Float avg;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Here is an number averager that only averages 3 numbers");
		System.out.println("");
		System.out.println("Please enter your first integer");
		num1 = keyboard.nextFloat();
		
		System.out.println("Please enter your second integer");
		num2 = keyboard.nextFloat();
		
		System.out.println("Please enter your last number");
		num3 = keyboard.nextFloat();
		
		//This lists the three numbers that the person selects
		System.out.println("Here are your three integers you selected: " + num1 + ", " + num2 + ", " + num3);
		
		//Here is a Space
		System.out.println("");
		
		
		System.out.println("By taking the sum of the three numbers and dividing by 3, you get the average.");
		//This is the average
		avg = (num1 + num2 + num3) / 3;
		
		System.out.println("The average of the three numbers you selected is " + avg);
		
		keyboard.close();
		

		}

	}
