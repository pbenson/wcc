package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		int numquarters; 
		int numdimes; 
		int numnickels; 
		int numpennies; 
		int numcents; // total number of cents
		
		int cents; // remainder 
		int dollars; 
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter number of quarters");
		numquarters = keyboard.nextInt(); 
		
		System.out.println("Enter number of dimes");
		numdimes = keyboard.nextInt(); 
		 
		System.out.println("Enter number of nickles");
		numnickels = keyboard.nextInt();
		
		System.out.println("Enter number of pennies");
		numpennies = keyboard.nextInt();
		
		numcents = numquarters * 25 + numdimes * 10 + numnickels * 5 + numpennies;
		//System.out.println("the jar contains " + numcents + " cents");
		cents = numcents % 100;
		dollars = numcents / 100;
		System.out.println("The jar contains " + dollars + " dollars and "+ cents + " cents");

	}

}
