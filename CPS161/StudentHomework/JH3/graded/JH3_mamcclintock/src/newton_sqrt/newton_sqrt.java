package newton_sqrt;
import java.util.*;

public class newton_sqrt {
	
	public static double newton_sqrt(double inputNumber){
		// Number to calculate square root of
		double number=inputNumber;
		double currentGuess=number/2.0;
		double lastGuess=currentGuess;
		double accuracy=1;
		
		//While loop to calculate Newton approximation of square root
		while(accuracy> .000001){
			lastGuess=currentGuess;
			currentGuess = ((number/lastGuess) + lastGuess)/2;
			accuracy = Math.abs((currentGuess-lastGuess));
		}
		return currentGuess;
	    }
	
	public static void main(String[] args) {
    
		// Read in number from user
		System.out.println("Enter in N for Newton:");
		Scanner scan = new Scanner(System.in);
		double number = scan.nextDouble();
		scan.close();
	
		//Call Newton method
		double result = newton_sqrt(number);
	
		//Output Newton calculation and Math.sqrt calculation
		System.out.println("Newton: (" + number + ") = " + result );
		System.out.println("Math.sqrt: " + Math.sqrt(number));
		}
	}
