package gas_mileage;

import java.util.Scanner;
import java.math.*;


public class Gas_Mileage {
	
	public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of gallons of gas used by car:");
        double gasGallons;
        gasGallons = keyboard.nextDouble();
        
        System.out.println("Enter number of miles traveled");
        double miles;
        miles = keyboard.nextDouble();
        
        keyboard.close();
        
        double mpg = miles/gasGallons;
        
        System.out.println("The MPG is " + mpg);
        

}

}
