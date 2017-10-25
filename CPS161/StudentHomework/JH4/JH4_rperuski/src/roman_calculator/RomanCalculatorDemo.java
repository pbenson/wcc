package roman_calculator;

import java.util.Scanner;

public class RomanCalculatorDemo {

	public static void main(String[] args) {
		
			RomanCalculator calc = new RomanCalculator();
			Scanner input = new Scanner(System.in);
			
			while (calc.keepCalculating()) {
				System.out.println("=======================");
			}
			
			
			input.close();
			System.out.println("Thanks for playing!");

		}

	}


