package factorial;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		boolean start = true;
		
		while (start){
			System.out.println("Enter N: ");
			int n = scan.nextInt();
			int answer = 1;
			for (int x = 1; x <= n; x++)
			answer *= x;
		
			if (n > 0)
				System.out.println("Factorial = " + answer);
			else
				System.out.println("Invalid number.");
		
			System.out.println("Do you want to continue (y/n)?:");
			String resume = scan.next();
			if(resume.charAt(0) != 'y')
				start = false;		
		}
		System.out.println("Have a nice day!");
		
		scan.close();
	}
}
