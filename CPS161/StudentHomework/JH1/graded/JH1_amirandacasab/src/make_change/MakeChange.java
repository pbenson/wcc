package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter price dollars:");
		int num1 = keyboard.nextInt();
		
		System.out.println("Enter price cents:");
		int num2 = keyboard.nextInt();
		
		System.out.println("Enter dollars recieved:");
		int num3 = keyboard.nextInt();
		
		System.out.println("Enter cents recieved:");
		int num4 = keyboard.nextInt();
		
		keyboard.close();
		
		int change = ((num3 * 100) + num4) - ((num1 * 100) + num2);
		
		int dollars = change / 100;
		
		int remainder1 = change % 100;
		
		int quarters = remainder1 / 25;
				
		int remainder2 = remainder1 % 25;
				
		int dimes = remainder2 / 10;
		
		int remainder3 = remainder2 % 10;
		
		int nickles = remainder3 / 5;
		
		int remainder4 = remainder3 % 5;
		
		int pennies = remainder4;
		
		System.out.println("Change Returned:");
		System.out.println(dollars + " dollar(s)");
		System.out.println(quarters + " quarter(s)");
		System.out.println(dimes + " dime(s)");
		System.out.println(nickles + " nickle(s)");
		System.out.println(pennies + " pennies");

	}

}
