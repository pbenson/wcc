package bounds;
import java.util.Scanner;
import util.Util;

public class Bounds
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int number = Util.readInt(scanner, "Enter the Starting Number: ");
		int upper = Util.readInt(scanner, "Enter the Upper Bound: ");
		int step = Util.readInt(scanner, "Enter the Step Size: ");
		
		for(int i=0; number<upper; number+=step)
		{
			i++;
			System.out.print(number);
			if(i % 10 == 0) System.out.print("\n");
			else System.out.print('\t');
		}
		
		scanner.close();
	}
}
