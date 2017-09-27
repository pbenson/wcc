package practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		  
		     Scanner input = new Scanner (System.in);
	
		    {
		    double i;
		    double sum = 0;
		    int count = 0;
		    while(input.hasNextDouble())
		    {
		        System.out.println("input");
		        i = input.nextDouble();
		        sum = sum + i;
		        count++;
		    }
		    System.out.println("sum is " + sum + " count is " + (count));
		    System.out.println("average is " + sum / (count));
		}
		    input.close();
		}
	
	}