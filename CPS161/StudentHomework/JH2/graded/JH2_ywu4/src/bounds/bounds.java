package bounds;

import java.util.Scanner;

public class bounds {

	public static void main(String[] args) {
		int starting_number, upper_bound, step_size, numPerline=0,
				count=0, answer=0;

		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter three integers: ");
		starting_number = scan.nextInt();
		upper_bound = scan.nextInt();
		step_size = scan.nextInt();
		
		System.out.println("The three numbers entered: " + starting_number + " "+ upper_bound + " " + step_size);
		
		while (starting_number<upper_bound)
			
		{System.out.print(starting_number + " ");
		 numPerline+=1;
		 if (numPerline==10)
		 {
		 System.out.println();
		 numPerline=0;
		 }
		
		starting_number+= step_size;
		}
	
	}

}
