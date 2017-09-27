package temperature;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		int total_user_inputs=0;
		double Total_of_Centigrade=0, Centigrade, Fahrenheit, Total_of_Fahrenheit = 0;

		Scanner scan= new Scanner (System.in);
		System.out.println ("Enter Temp in Centigrade or <= -100.0 to quit: ");
		Centigrade = scan.nextInt();
		
		while( Centigrade > -100)
			{
			Fahrenheit=(9.0/5.0)*Centigrade+32.0;
			Total_of_Centigrade= Total_of_Centigrade + Centigrade;
			Total_of_Fahrenheit= Total_of_Fahrenheit + Fahrenheit; 
			total_user_inputs++;
			System.out.print("Temperature: F(" + Fahrenheit + ") " );
			System.out.printf("C(%.1f) %n", Centigrade);
			System.out.println ("Enter Temp in Centigrade or <= -100.0 to quit: ");
			Centigrade = scan.nextInt();
			}
		if (total_user_inputs==0)
			System.out.println("No scores entered.");
		else 

		{
			double Average_Fahrenheit= Total_of_Fahrenheit/total_user_inputs;
			double Average_centigrade= Total_of_Centigrade/total_user_inputs;
			
			System.out.printf("Average: Centigrade(%.1f) ", Average_centigrade);
			System.out.printf(" Average: Fahrenheit (%.15f)", Average_Fahrenheit);
		}

	}

}


