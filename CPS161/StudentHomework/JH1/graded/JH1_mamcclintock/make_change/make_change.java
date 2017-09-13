package make_change;

import java.util.Scanner;
import java.math.*;

public class make_change {
public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Price Dollars:");
        int dollars;
        dollars = keyboard.nextInt();
        
        System.out.println("Enter Price Cents:");
        int cents;
        cents = keyboard.nextInt();
        
        System.out.println("Enter Dollars Tendered:");
        int dollarsPaid;
        dollarsPaid = keyboard.nextInt();
        
        System.out.println("Enter Cents Tendered:");
        int centsPaid;
        centsPaid = keyboard.nextInt();
        
        keyboard.close();
        
        int changeDue = (100*dollarsPaid+centsPaid)-100*dollars-cents;
        
        if (changeDue<0){
        	System.out.println("You didn't pay enough! Please try again.");
        	return;
        }
        if (changeDue==0){
        	System.out.println("Your change owed is $0.");
        	return;
        }
        int dollarsChange = changeDue/100;
        changeDue = changeDue%100;
        int quartersChange = changeDue/25;
        changeDue = changeDue%25;
        int dimesChange = changeDue/10;
        changeDue = changeDue%10;
        int nickelsChange = changeDue/5;
        changeDue = changeDue%5;
        int penniesChange = changeDue;
        
        System.out.println("Change returned:");
        System.out.println("Dollars:" + dollarsChange);
        System.out.println("Quarters:" + quartersChange);
        System.out.println("Dimes:" + dimesChange);
        System.out.println("Nickels:" + nickelsChange);
        System.out.println("Pennies:" + penniesChange);
        
        }
}
