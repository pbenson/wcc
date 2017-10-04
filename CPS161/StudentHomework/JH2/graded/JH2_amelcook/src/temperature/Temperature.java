package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		double c = 0;
		double f = 0;
		double sumC = 0;
		double sumF = 0;
		double count = 0;
		double countF = 0;
		double average_c;
		double average_f;
			
		Scanner keyboard = new Scanner(System.in);
		
	do {	

		System.out.println("Enter Temp in Centigrade or <= -100.0 to quit: ");
		c = keyboard.nextDouble();
		sumC = sumC + c;
		count++;
		
		f = ((9.0/5.0)*c+32.0);
		sumF = sumF + f;
		countF++;
		System.out.println(" F (" + f + ") " + "C(" + c +")");
		
	} while (c > -100);{  	
	
		
	//do {
	
		average_f = (sumF / countF);
	average_c = (sumC / count);
	System.out.println("Average: Farenheit(" + average_f + ")"
			+ " Average: Celcius(" + average_c + ")");
	keyboard.close();
	} while (c <= -100);
	return;
	
	}}


				
	
		
		
	
	

