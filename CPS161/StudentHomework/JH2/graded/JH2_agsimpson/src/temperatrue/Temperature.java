package temperatrue;

import java.util.Scanner;

public class Temperature {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		double runs = 0;
		double totalF = 0;
		double totalC = 0;
		while(true){
			
			
			System.out.print("Enter Temp in Centigrade or -100.0 to quit: ");
			double centigrade = keyboard.nextDouble();
			if(centigrade==-100)				
				break;
			runs++;
			double fahrenheit = 1.8*centigrade+32;
			System.out.println("Temperature: F("+fahrenheit+") C("+centigrade+")");
			totalF=totalF+fahrenheit;
			totalC=totalC+centigrade;
					
		}
		double avrgC=totalC/runs;
		double avrgF=totalF/runs;

		System.out.println("Average Centigrade ("+avrgC+")	Average Fahrenheit ("+avrgF+")");
		keyboard.close();
	}

}
