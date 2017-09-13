package gas_mileage;

import java.util.Scanner;

public class Gas_mileage {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Number of Gallons");
		double gallons = keyboard.nextDouble();
		System.out.println("Enter Number of Miles");
		double miles = keyboard.nextDouble();
		


		double total = miles/gallons;
		System.out.println(" you get " + total + " miles per gallon");
		
	}}
