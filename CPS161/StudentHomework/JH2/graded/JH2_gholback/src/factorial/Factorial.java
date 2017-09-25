package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Boolean KeepGoing = true;

		while (KeepGoing == true){
			System.out.println("What is N?");
			int N = keyboard.nextInt();
			int totalN = N;

			while (N > 1){
				N--;
				totalN *= N;
			}

			System.out.println("Factorial: " + totalN);

			System.out.println("Would you like to continue?: (y/n)");
			String response = keyboard.next();
			String yes= "y"; 
			String no= "n";

			if (response.equals(yes)){
				System.out.println("");
				KeepGoing = true;
			} 
			else if (response.equals(no)){
				System.out.println("");	
				System.out.println("Have a nice day!");	
				KeepGoing = false;
			}	
			else {
				System.out.println("");
				System.out.println("Well... That wasn't 'y' or 'n' , but we'll continue anyways. ");
				System.out.println("");
				KeepGoing = true;
								
			}
		}
	}
}
