package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {

	    int qAmt;
	    int dAmt;
	    int nAmt;
	    int pAmt;
	    
	    int answer;
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter in the amount of quarters in the Jar: ");
		qAmt = keyboard.nextInt();
		System.out.println("Enter in the amount of dimes in the Jar: ");
		dAmt = keyboard.nextInt();
		System.out.println("Enter in the amount of nickels in the Jar: ");
		nAmt = keyboard.nextInt();
		System.out.println("Enter in the amount of pennies in the Jar: ");
		pAmt = keyboard.nextInt();
		
		answer = ( (25 * qAmt) + (10 * dAmt) + (5 * nAmt) + (1 * pAmt));
		System.out.println("The Jar contains " + answer + " cents.");
		
		
		keyboard.close();
		
		
	}

}
