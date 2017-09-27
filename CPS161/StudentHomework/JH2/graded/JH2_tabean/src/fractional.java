import java.util.Scanner;

public class fractional 
{
	public static void main(String[] args) 
	{
		String ans = "y";
		while(ans.equals("y"))
		{
		int N, frac;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter N: ");
		N = keyboard.nextInt();
		frac = N * (N-1) * (N-2) * 1;
		System.out.println("\nThe Frac is: " + frac);
		System.out.println("want to  kep going? (y for yes)");
		ans = keyboard.next();
		}
	}
}
