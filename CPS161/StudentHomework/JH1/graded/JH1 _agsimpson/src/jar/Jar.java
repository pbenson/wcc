package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String args[]) {
		int qrt;
		int dim;
		int nck;
		int pen;
		// imput
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter number of quarters");
		qrt = keyboard.nextInt();
		System.out.println("enter number of dimes");
		dim = keyboard.nextInt();
		System.out.println("enter number of nickles");
		nck = keyboard.nextInt();
		System.out.println("enter number of penies");
		pen = keyboard.nextInt();
		//calc
		qrt = 25*qrt;
		dim = 10*dim;
		nck = 5*nck;
		
		int total = qrt+dim+nck+pen;
		//output
		System.out.println("you have " + total + " cents ");
		
	}
	
	
	
	
	
}
