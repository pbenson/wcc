package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double AvgCenti;
		double AvgFahren;
	
		double SumCenti = 0.0;
		double SumFahren = 0.0;
		
		int count = 0;
		
		Scanner keyboard = new Scanner(System.in);
			
		while (true) {
			System.out.println("Enter Temp in Centigrade for conversion ... or a Temp <=-100.0 to quit:");
			double centi = keyboard.nextDouble();
			
			if( centi < -99.999999)
			{
				break;
			}
			
			double fahren = (9.0/5.0)*centi + 32.0;
			System.out.println("Temperature:" + "f(" + fahren + ")" + "    C(" + centi + ")");
			
			
			count++;
			SumCenti = SumCenti + centi;
			SumFahren = SumFahren + fahren;
			
		}
		
		AvgCenti = SumCenti/ count;
		AvgFahren = SumFahren/ count;
		System.out.print("Average: Centigrade(" + AvgCenti + ")    Average: Fahrenheit(" + AvgFahren + ")");
		
	    keyboard.close();
		
	}

}
