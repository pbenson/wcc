package make_change;

import java.util.Scanner; 

public class MakeChange {
		    
				public static void main(String[] args) {
			        
					int dollars;  
			        int cents;   
			        int received_dollars;
			        int received_cents; 	
			        
			        int total_cents_owed;
			        int total_received_cents;
			        
			        int change;
			        int dollar_change;
			        int change_after_dollars;
			        int quarter_change;
			        int change_after_quarters;
			        int dime_change;
			        int change_after_dimes;
			        int nickel_change;
			        int change_after_nickels;
			        int penny_change;
			        		        
			        Scanner keyboard = new Scanner(System.in);
			        
			        System.out.println("Enter the number of dollars in the price:");
			        dollars = keyboard.nextInt();
			        
			        System.out.println("Enter the number of cents in the price:");
			        cents = keyboard.nextInt();
			        
			        System.out.println("Enter the number of dollars received as payment:");
			        received_dollars = keyboard.nextInt();
			        
			        System.out.println("Enter the number of cents received as payment:");
			        received_cents = keyboard.nextInt();
			        
			        total_cents_owed = 100*dollars + cents;
			        
			        System.out.println("The total cost of the item is " + total_cents_owed + " cents");
			        
			        total_received_cents = 100*received_dollars + received_cents;
			        
			        System.out.println("You paid " + total_received_cents + " cents");
			        
			        change = total_received_cents - total_cents_owed;
			        
			        System.out.println("The change owed to you is " + change + " cents");
			        
			        dollar_change = change/100;
			        change_after_dollars = change % 100;
			        
			        quarter_change = change_after_dollars/25;
			        change_after_quarters = change_after_dollars % 25;
			        
			        dime_change = change_after_quarters/10;
			        change_after_dimes = change_after_quarters % 10;
			        
			        nickel_change = change_after_dimes/5;
			        change_after_nickels = change_after_dimes % 5;
			        
			        penny_change = change_after_nickels;
			        
			        
			        System.out.println("You get:");
			        System.out.println(dollar_change + " dollar(s)");
			        System.out.println(quarter_change + " quarter(s)");
			        System.out.println(dime_change + " dime(s)");
			        System.out.println(nickel_change + " nickel(s)");
			        System.out.println(penny_change + " penn(y)(ies)");
			        
			       
			        
			        
			   
			    }
			}
	
		
	
