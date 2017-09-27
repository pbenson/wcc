package factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		String y_or_n = null; 
		int N=0, result=1;
		Scanner keyboard = new Scanner(System.in);
		do 
		{
System.out.println ("Enter in N: ");
N = keyboard.nextInt();
{			for (int i=1; i <=N; i++) 
			{result=result*i;	
			}
	  System.out.println("Factorial= " + result);
	  
}
	  System.out.println ("Do you want to continue? (y/n): ");
	    y_or_n =keyboard.next();
	  
}while (y_or_n.equals("y"));

System.out.println("have a nice day");
		  
	}	    
	
}
