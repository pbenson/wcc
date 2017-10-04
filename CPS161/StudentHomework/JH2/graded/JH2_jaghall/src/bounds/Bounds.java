package bounds;

import java.util.Scanner;

public class Bounds {
	public static void main(String[] args) {
		int lower;
		int upper;
		int stepSize;

	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter lower bound");
	    lower = keyboard.nextInt();
	    
	    System.out.println("Enter upper bound");
	    upper = keyboard.nextInt();
	    
	    System.out.println("Enter step size");
	    stepSize = keyboard.nextInt();
	    
	    System.out.println("Lower: " + lower + "\nUpper: " + upper + "\nStep Size: " + stepSize);
	    
	    int count = 0;
	    
	    String output = "";
	    int i = lower;
	    
	    for (int step = 0; i < upper; step += 1) {
	    		i = lower + (stepSize * step);
	    		
	    		if (count == 10 || i >= upper) {
	    			System.out.println(output);
	    			count = 0;
	    			output = i + ", ";
	    			continue;
	    		}
	    		
	    		output = output + i + ", ";
	    		count += 1;
	    }
	    
	}
}
