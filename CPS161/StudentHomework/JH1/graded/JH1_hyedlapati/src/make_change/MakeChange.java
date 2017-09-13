package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int priceDollars;
		int priceCents;
		int price;
		int dollarsRecieved;
		int centsRecieved;
		int recieved;
		int changeDue;
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter price dollars: ");
		priceDollars = keyboard.nextInt();

		System.out.println("Enter price cents: ");
		priceCents = keyboard.nextInt();
		
		System.out.println("Enter dollars recieved: ");
		dollarsRecieved = keyboard.nextInt();

		System.out.println("Enter cents recieved: ");
		centsRecieved = keyboard.nextInt();

		price = priceDollars*100 + priceCents;
		recieved = dollarsRecieved*100 + centsRecieved;
		changeDue = recieved-price;
		dollars = changeDue/100;
		quarters = (changeDue-dollars*100)/25;
		dimes = (changeDue-dollars*100-quarters*25)/10;
		nickels = (changeDue-dollars*100-quarters*25-dimes*10)/5;
		pennies= (changeDue-dollars*100-quarters*25-dimes*10-nickels*5);
		
		System.out.println("dollars returned: " + dollars);
		System.out.println("quarters returned: " + quarters);
		System.out.println("dimes returned: " + dimes);
		System.out.println("nickels returned: " + nickels);
		System.out.println("pennies returned: " + pennies);

	}

}
