/**Programmer: Trevor Bean 
 * Program: Basic Gas Mileage
 * Teacher: Peter Benson**/
import java.util.Scanner;

public class Averager 
{
	public static void main(String[] args)
	{
		int ans;
		System.out.println("Type in three numbers to be average.");
		Scanner keyboard = new Scanner(System.in);
		int n1 = keyboard.nextInt();
		int n2 = keyboard.nextInt();
		int n3 = keyboard.nextInt();
		ans = (n1 + n2 + n3)/3;
		keyboard.close();
		System.out.print("Your combination of " + n1 + " + " + n2 + " + " + n3 + " Equals " + ans);
	}
}
