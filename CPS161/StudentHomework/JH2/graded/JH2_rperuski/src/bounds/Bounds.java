package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {

		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int a=keyboard.nextInt();
		System.out.println("Enter the ending number: ");
		int b=keyboard.nextInt();
		System.out.println("Enter the step size:");
		int c=keyboard.nextInt();
		keyboard.close();
		
		int count = 0;
		for(int i=a; i<=b; i+=c) {
			
			System.out.print(" " + i);
			
			count++;
			   if(count % 10 == 0) {
			      System.out.print("\n");
			   }
			   
		}
		
	
	}

}
