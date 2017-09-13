package averager;

import java.util.Scanner;

public class averager {

	public static void main(String[] args) {
		int num1, num2, num3;
		double average;
		
		Scanner keyboard = new Scanner(System.in);
	      System.out.println("Enter first number");
	       num1= keyboard.nextInt();
	      
	      System.out.println("Enter second number");
	       num2 =keyboard.nextInt();
	       
	      System.out.println("Enter third number");
	       num3 =keyboard.nextInt();
	 
	      System.out.println("The integers you entered");
	      System.out.println(num1);
	      System.out.println(num2);
	      System.out.println(num3);
	      
	      average=(num1+num2+num3)/3;
	      System.out.println("The average is " + average);
	      
	}

}
