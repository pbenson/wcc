package temperature;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		int temp = 0;
		double total1 = 0.0;
		double total2 = 0.0;
		int count = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(temp > -100)
		{
			System.out.println("Enter Temp in Centigrade or <= -100 to quit: "     );
			temp = keyboard.nextInt();
			double fahrenheit = (9.0/5.0)*temp+32.0;
			double centigrade = temp;
			System.out.println("Temperature: " + "F: " + fahrenheit + " " +  "C: " + centigrade );
			
			count += 1;
			total1 += centigrade;
			total2 += fahrenheit;
			if (temp <= -100)
				
				System.out.printf("Average: Centigrade - " + count/total1 + " " + "Average: Fahrenheit - " + count/total2 );
		}
			// i'm  not sure where i'm going wrong/where to go from here
	}

}
