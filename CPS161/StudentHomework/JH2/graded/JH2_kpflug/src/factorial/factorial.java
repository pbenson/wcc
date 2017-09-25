package factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		String a;
		boolean condition = true;
		int N;
		int factorial;
		
		while (condition == true) {
		
			System.out.println("Enter in N:");
			N = scan.nextInt();
			factorial = N; 
			
		// calculate factorial
			while (N >1) {
				factorial = factorial * (N-1);
				N--; 	
			}
			

			// print reusults of factorial
			System.out.println("Factorial = " + factorial );
				
			
			System.out.println ("Do you want to continue?: (y/n):");
			a = scan.next();
			
			if (a.equals("n")){
				condition = false;	
			}
			
		} //end first while loop
		System.out.println("Have a good day");
	}
}


