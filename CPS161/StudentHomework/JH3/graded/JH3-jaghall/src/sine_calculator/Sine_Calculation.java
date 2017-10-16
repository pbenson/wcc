package sine_calculator;
import java.util.Scanner;


public class Sine_Calculation {

    
    public static void main(String[] args) {
        System.out.println("Enter the angle for Sine Calculation:");
        Scanner keyboard = new Scanner(System.in);
        
        double angle_degrees = keyboard.nextDouble();
        double angle_radians = angle_degrees * Math.PI / 180.0;
        
        // Calculate the N=1 values 
        double sign = 1.0;
        double nfactorial=1;
        double xPower = angle_radians;
        double guess = xPower;
        double delta = 1000; // Want to go into the while loop at least once
        int N = 1;
        
        while (delta > .00000001)
        {
            // Calculate the next term
            N += 2;  // sequence 1, 3, 5, 7, etc.
            nfactorial = nfactorial * N * (N-1);
            xPower = xPower * angle_radians * angle_radians;
            sign = - sign;
            double next_term = sign * xPower / nfactorial;
            
            double next_guess = guess + next_term;
            delta = guess - next_guess;
            if (delta < 0)
                delta = - delta;
            guess = next_guess;
            // debug
            System.out.println("N="+ N + " guess="+guess + " delta="+delta);
            
        }
        System.out.println("*******  Done  *******");
        System.out.println(" Math.sin(angle)="+ Math.sin(angle_radians));

    }

}