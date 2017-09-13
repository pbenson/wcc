package make_change;

import java.util.Scanner;

public class Make_change {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter Price Dollars");
		int Pdollar = keyboard.nextInt();
		System.out.println("Enter Price Cents");
		int Pcent = keyboard.nextInt();
		System.out.println("Enter Received Dollars");
		int Rdollar = keyboard.nextInt();
		System.out.println("Enter Received Cents");
		int Rcent = keyboard.nextInt();
		
		int Dollar = Rdollar - Pdollar;
		Dollar = Dollar-1;
		Rcent = Rcent +100;
		int CentTotal = Rcent - Pcent;
		
		
		
		//System.out.print(CentTotal); <------- for testing 
		int quarter = CentTotal / 25;
		//System.out.print(CentTotal);

		int dime = (CentTotal % 25) / 10;
		//System.out.print(CentTotal);

		int nickel = ((CentTotal % 25) % 10) / 5;
		//System.out.print(CentTotal);

		int penny = (((CentTotal % 25) % 10) % 5) / 1;
		//System.out.print(CentTotal);

		System.out.println("Number of Dollars "+Dollar);
		System.out.println("Number of Quarters "+quarter);
		System.out.println("Number of Dimes "+dime);
		System.out.println("Number of Nickels "+nickel);
		System.out.println("Number of Pennies "+penny);

		
		
	}
	
	
}
