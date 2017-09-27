import java.util.Scanner;

public class temp 
{
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		double far = 0, ceci = 0, ave, num = 0, add = 0, avef, addf = 0;
		while(ceci > -100) 
		{
			System.out.println("\nEnter Temp in Centi or <= -100.0 to quit:");
			ceci = keyboard.nextDouble();
			add+= ceci;
			far = (9.0/5.0)*ceci + 32.0;
			addf+= far;
			num += 1;		
			System.out.println("Temp: F(" + far +") C(" + ceci + ")");
		}
		ave = add/num;
		avef = addf/num;
		System.out.println("Average Temp: F(" + avef +") C(" + ave + ")");
	}
	
}
