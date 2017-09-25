package temperature;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {

		double EnterTemp = 0;
		double Inputs = 0;

		double TotalTempFah = 0; 
		double TotalTempCen = 0;

		boolean Run = true;

		Scanner keyboard = new Scanner(System.in);

		while (Run == true){

			System.out.println("Enter the Temp in Centigrade or <= -100 to quit:");
			EnterTemp = keyboard.nextInt();

			if (EnterTemp > -100){
				Inputs = Inputs + 1; 

				double Cen = EnterTemp;
				double Fah = ((9.0/5.0)*EnterTemp+32);


				TotalTempFah = TotalTempFah + Fah;
				TotalTempCen = TotalTempCen + Cen;

				System.out.println("Temperature: C("+ Cen +") F:("+ Fah +")");
			}
			else {

				double AverageFah = TotalTempFah / Inputs;
				double AverageCen = TotalTempCen / Inputs;

				System.out.println("");	

				System.out.print("Average: C("+ AverageCen +") F:("+ AverageFah +")"); 
				Run = false;
			}
		}
		keyboard.close();
	}
}
