package make_change;

import java.util.Scanner;

public class make_change {

	public static void main(String[] args) {
       int priceDollars, priceCents, receivedDollars, receivedCents,
           changeDollars, changeQuarters, changeDimes, changeNickels, changePennies,
           totalChange;
       
       Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter price dollars");
		priceDollars= keyboard.nextInt();
	    
	    System.out.println("Enter price cents");
	    priceCents= keyboard.nextInt();
	    
	    System.out.println("Enter money received dollars");
	    receivedDollars= keyboard.nextInt();
	    
	    System.out.println("Enter money received cents");
	    receivedCents= keyboard.nextInt();
	    
	    totalChange= receivedDollars*100 + receivedCents - (priceDollars*100 + priceCents);
	    changeDollars= totalChange/100;
	    changeQuarters= (totalChange % 100)/25;
	    changeDimes= ((totalChange % 100)% 25)/10;
	    changeNickels=  (((totalChange % 100)% 25) %10)/5;
	    changePennies= (((totalChange % 100)% 25) %10) % 5;
	    
	    System.out.println("Change returned: " + changeDollars + " Dollar(s) " 
	    + changeQuarters + " Quarter(s) "+ changeDimes + " Dime(s) "+ changeNickels + " Nickel(s) "
	    + changePennies + " Pennie(s) ");
	}
	

}
