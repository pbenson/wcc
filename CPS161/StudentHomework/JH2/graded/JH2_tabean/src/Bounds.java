import java.util.Scanner;

public class Bounds 
{ 
	public static void main(String[] args) 
	{
		int start, incr, upper, c = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the bound step program, please /n enter a starting number");
		start = keyboard.nextInt();
		System.out.println("\n Now please enter a Number to incrimently increase by:");
		incr = keyboard.nextInt();
		System.out.println("\n Snf finslly dhoe mr ehrtr you want to end ^^ :");
		upper = keyboard.nextInt();
		System.out.println("\n Ok here we go:");
		System.out.print(start + " ");
		while( start < upper)
		{
			c += 1;
			start += incr;
			System.out.print(start + " ");
			if (c > 8)
				{
				System.out.println("");
				c = 0;
				}
		}
		
	}

	
}
