package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		char YorN;
		boolean redo;
		do {
			System.out.print("Enter Number: ");
			int num1 = keyboard.nextInt();

			int num2 = 1;
			for (int x = 1; x <= num1; x++) {
				num2 = x * num2;
			}
			System.out.println("Factorial = " + num2);
			System.out.print("Do you want to continue (y/n) : ");
			String yesOrNo = keyboard.next();
			YorN = yesOrNo.charAt(0);

			if (YorN == 121) {
				redo = true;
			} else {
				redo = false;
			}

		} while (redo);
		System.out.println("Have a good day");
		keyboard.close();
	}

}
