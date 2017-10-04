package Bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int StartNum;
		int UpBound;
		int StepSize;
		
		int Constant = 0;
		int Solution = 0;
		int i = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a Start Number");
		StartNum = keyboard.nextInt();
		
		System.out.println("Enter an Upper Bound");
		UpBound = keyboard.nextInt();
		
		System.out.println("Enter a Step Size");
		StepSize = keyboard.nextInt();
		

		
	
		while (Solution < (UpBound-StepSize)) 
		{
				
				Solution = StartNum + (Constant * StepSize);
				System.out.print(Solution + " ");
				i++;
				Constant++;
			if (i % 10 == 0)
				System.out.println();
		}
		
		
		// OR HERE IS ANOTHER WAY OF DOING IT
		
		/*
		for ( int sol = StartNum; sol < UpBound; sol = sol+StepSize) {
			System.out.print(sol + " ");
		}
		*/
		
	
	
	keyboard.close();	
	}

}
