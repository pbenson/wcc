package bounds;

import java.util.Scanner;

public class bounds {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		

		 System.out.println("Enter starting number");
		 int Starting_Number = scan.nextInt();
		 System.out.println("The starting number is "+Starting_Number);
		 
		 System.out.println("Enter upper bound");
		 int Upper_Bound = scan.nextInt();
		 System.out.println("The upper bound is "+Upper_Bound);
		 
		 System.out.println("Enter step size");
		 int Step_Size = scan.nextInt();
		 System.out.println("The step size is "+Step_Size);
		 
		 int count =0;
		 int New_Number = Starting_Number;
		 
		 
		 while (New_Number < Upper_Bound)
		 {System.out.print( New_Number + " ");
		 New_Number = New_Number + Step_Size;
		 
		 count += 1;
		 if ((count % 10) == 0)
			 System.out.println();
		 
		 }
		
		 
		 
	
	
		 
		 
	}}
