package gas_mileage;

import java.util.Scanner;

public class gas_mileage {

	public static void main(String[] args) {
		
		 double miles;
		 double gallons;
		 double miles_per_gallon;
		 
		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("Enter the distance traveled");
		  miles= keyboard.nextDouble();
		 
	     System.out.println("Enter the gallons of gas consumed");
	      gallons =keyboard.nextDouble();

	     miles_per_gallon= miles /gallons;
	       System.out.println("The Miles per Gallon for your vehicle is " + miles_per_gallon);

	}

}
