package temperature;
import java.util.Scanner;

public class temperature {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double cent = 0;
		double sum = 0;
		int count = 0;
		
		while (cent > -100.0)
		{
			System.out.println("Enter centigrade (-100.0 to quit): ");
			cent = scan.nextDouble();
			System.out.println("F("+((9.0/5.0*(cent)+32.0)+") C("+cent+")"));
			if (cent > -100.0) {
			sum += cent;
			count++;
			}
		}
		
		System.out.println("Temperature : F("+((9.0/5.0)*(sum/count)+32.0)+") C(" + sum/count+")");
		
		
		scan.close();
	}
	

}
