package temperature;

import java.util.Scanner;

public class Temperature {

		public static void main(String[] args) {
			double centigrade = 0;
			double F_temp = 0;
			int user_inputs = -1;
			double total_F = 0;
			double total_C = 0;
			double avg_F;
			double avg_C;
			
			Scanner keyboard = new Scanner(System.in);
			
			while (centigrade >= -99) {
				user_inputs = user_inputs + 1;
				
				System.out.println("Temperature: F("+F_temp+") C("+centigrade+")");
				total_C = total_C + centigrade;
				total_F = total_F + F_temp;
				
				System.out.println("Enter Temp in Centigrade or <= -100 to quit:");
				centigrade = keyboard.nextDouble();
				
				F_temp = (9.0 / 5.0) * centigrade + 32.0;
			}
			avg_C = total_C / user_inputs;
			avg_F = total_F / user_inputs;
			System.out.println("Average: Centigrade("+avg_C+")  Average: Fahrenheit ("+avg_F+")");
		keyboard.close();	
		}
}
