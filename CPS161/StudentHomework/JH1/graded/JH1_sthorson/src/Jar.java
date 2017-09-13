import java.util.Scanner;
public class Jar {
	public static void main(String[] args) {
		double penny; 
		double nickle; 
		double dime;
		double quarter;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of pennies:");
		penny = keyboard.nextDouble();
		System.out.println("Enter enter number of nickles:");
		nickle = keyboard.nextDouble();
		System.out.println("Enter number of dimes:");
		dime = keyboard.nextDouble();
		System.out.println("Enter number of quarters:");
		quarter = keyboard.nextDouble();
		keyboard.close();
		double total = penny + (nickle *5) + (dime * 10)+ (quarter * 25);
		System.out.println("The jar contains " + total +" cents." );
	}
}