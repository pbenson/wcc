package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		    int num1;
	        int num2;
	        int num3;
	        double answer;
	       
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Enter first number");
	        num1 = keyboard.nextInt();
	        System.out.println("Enter second number");
	        num2 = keyboard.nextInt();
	        System.out.println("Enter third number");
	        num3 = keyboard.nextInt();
	        
	        double dnum1 = num1;
	        double dnum2 = num2;
	        double dnum3 = num3;
	        answer = (dnum1  + dnum2 + dnum3) / 3;
	        System.out.println("The first number is " + num1);
	        
	        System.out.println("The second number is " + num2);
	       
	        System.out.println("The third number is "+ num3);
	        
	        System.out.println("The average is "+ answer);

	}

}
