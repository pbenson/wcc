package bounds;
import java.util.Scanner;
import util.Util;

public class Bounds
{
	public static void main()
	{
		Scanner scanner = new Scanner(System.in);
		
		int number = Util.readInt(scanner, "Enter the Starting Number: ");
		int upper = Util.readInt(scanner, "Enter the Upper Bound: ");
		int step = Util.readInt(scanner, "Enter the Step Size: ");
		
		for(int i=0; number<upper; number+=step)
		{
			i++;
			System.out.print(i);
			if(i % 10 == 0) System.out.print("\n");
			else System.out.print('\t');
		}
		
		scanner.close();
	}
}
