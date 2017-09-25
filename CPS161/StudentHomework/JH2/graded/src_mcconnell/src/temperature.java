10
20
30import java.util.Scanner;
public class temperature {
	public static void main(String[] args){
		double centigrade;
		double sum_centigrade;
		double count;
		double fahrenheit;
		double sum_fahrenheit;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Temp in Centigrade or <= -100.0 to quit:");
		centigrade = keyboard.nextInt();
		count = 0;
		sum_centigrade = 0;
		sum_fahrenheit = 0;
		while (centigrade > -100){
			fahrenheit = (9.0/5.0)*centigrade + 32.0;
			System.out.println("Tempature: F (" + fahrenheit + ")" + " C (" + centigrade + ")");
			count++;
			sum_fahrenheit = fahrenheit + sum_fahrenheit;
			sum_centigrade = centigrade + sum_centigrade;
			System.out.println("Enter Temp in Centigrade or <= -100.0 to quit:");
			centigrade = keyboard.nextInt();
		}
		System.out.println("Average Tempature: F (" + (sum_fahrenheit/count) + ")" + "C (" + (sum_centigrade/count) + ")");
		keyboard.close();
	}
}