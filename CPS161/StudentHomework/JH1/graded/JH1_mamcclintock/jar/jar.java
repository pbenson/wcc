package jar;
import java.util.Scanner;
import java.math.*;
public class jar {
	
public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of pennies:");
        int pennies;
        pennies = keyboard.nextInt();
        
        System.out.println("Enter the number of nickles:");
        int nickles;
        nickles = keyboard.nextInt();
        
        System.out.println("Enter the number of dimes:");
        int dimes;
        dimes = keyboard.nextInt();
        
        System.out.println("Enter the number of quarters:");
        int quarters;
        quarters = keyboard.nextInt();
        
        keyboard.close();
        
        int totalCents = pennies+5*nickles+10*dimes+25*quarters;
        if (totalCents >= 100){
        	int totalDollars = totalCents/100;
        	int remainingCents = totalCents-totalDollars*100;
        	System.out.println("The jar contains " + totalDollars + " dollars and " + remainingCents + " cents." );
        }
        if (totalCents==1){
        	System.out.println("The jar contains 1 cent.");
        }
        
        else if (totalCents<100){
        	System.out.println("The jar contains: " + totalCents + " cents.");
        
}

}
}
