package bounds;
import java.util.Scanner;

public class bounds {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
			
		
		System.out.println("Enter starting number: ");
		int start = keyboard.nextInt();
		
		System.out.println("Enter step size: ");
		int step = keyboard.nextInt();
		
		System.out.println("Enter upper limit: ");
		int up = keyboard.nextInt();
		
		int numPerLine = 0;
				
		for (int x=start; x<up; x+=step)
		{
			System.out.print(x+" ");
			
			numPerLine+=1;
			if (numPerLine == 10)
			{
				System.out.println();
				numPerLine = 0;
			}
		}

		keyboard.close();
	}

}
