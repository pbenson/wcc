package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double centigrade;
		double farenheit;
		double avgCent;
		double avgFar;
		double sumCent=0;
		double sumFar=0;
		int FarCount = 0;
		int CentCount = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Temp in Centigrade or <= -100.0 to quit: ");
		centigrade = keyboard.nextDouble();
		
		farenheit = 1.8*centigrade + 32;
	
		while (centigrade > -100) {
			
			System.out.println("Centigrade: "+ centigrade);
			System.out.println("Fahrenheit: "+ farenheit);
			System.out.println("Enter Temp in Centigrade or <= -100.0 to quit: ");
			centigrade = keyboard.nextDouble();
			
			if (centigrade <= -100) {
				break;
			}
			CentCount ++;
			FarCount ++;
			
			farenheit = 1.8*centigrade + 32;
			
			sumCent = sumCent + centigrade;
			sumFar = sumFar + farenheit;
		
		}	
		avgCent = sumCent/CentCount;
		avgFar = sumFar/FarCount;
		
			System.out.println("Average Centigrade is: "+avgCent);			
			System.out.println("Average Farenheit is: "+avgFar);		
	

	keyboard.close();
}
}