package factorial;

import java.util.Scanner;

public class FactorialFunction 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 int N = 0;
		 String YesOrNo;


		 
	     Scanner keyboard = new Scanner(System.in);
	     
	     
	     do
	     {	
	    	 
    	
			System.out.println("Enter in N");
			N = keyboard.nextInt();			
			keyboard.nextLine();	
			int factorial = 1;
			
			if( N < 1)
			{
				continue;
			}
			
			for(int i = N; i > 1; i--)
			{
				factorial = factorial * i;
			}
			
			System.out.println("Factorial = " + factorial);
		
			System.out.println("Do you want to continue? ... y or n");

	    	YesOrNo = keyboard.nextLine();
	    	 
	    	 if( YesOrNo.equals("n") )
	    	 {
	    		 break;
	    	 }
	    	 
		 							 				

	
	     } while(true);
	 System.out.println("Have a great, amazing, wonderfully good day");
	    keyboard.close();    
	   
	}
	

}
