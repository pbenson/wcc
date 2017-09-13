import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		double integer1; 
		double integer2; 
		double integer3; 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 1st integer:");
		integer1 = keyboard.nextDouble();
		System.out.println("Enter 2nd integer:");
		integer2 = keyboard.nextDouble();
		System.out.println("Enter 3rd integer:");
		integer3 = keyboard.nextDouble();
		keyboard.close();
		double average = (integer1 + integer2 + integer3)/3;
		System.out.println("The average is "+ average);
	}
}