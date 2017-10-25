package sine;
import util.Util;

public class SineCalculator
{
	public static void main(String[] args)
	{
		System.out.println("Enter an angle θ (in degrees) for sine calculation:");
		double angle = Util.readDouble("θ=");
		double radians = degreesToRadians(angle);
		System.out.println("sin(" + angle + "°)      = " + sin(radians));
		System.out.println("Math.sin(" + angle + "°) = " + Math.sin(radians));
	}
	
	/**
	 * Restricts the domain to 0 <= x < 2pi by finding a coterminal angle if the given angle is out of range
	 * 
	 * @param angle The angle in radians
	 * @return A coterminal angle between 0 and 2pi
	 */
	public static double fixDomain(double angle)
	{
//		while(angle >= Math.PI*2) angle -= Math.PI*2;
//		while(angle < 0) angle += Math.PI*2;
		if(angle >= Math.PI) angle -= (2*Math.PI) * Math.floor(angle / (2*Math.PI));
		else if(angle < 0) angle += (2*Math.PI) * (Math.floor(-angle / (2*Math.PI))+1);
		return angle;
	}
	
	/**
	 * Converts an angle in degrees to an angle in radians.
	 * 
	 * @param angle The angle in Degrees
	 * @return The angle in Radians.
	 */
	public static double degreesToRadians(double angle)
	{
		return angle * Math.PI/180;
	}
	
	/**
	 * Converts an angle in radians to an angle in degrees.
	 * 
	 * @param angle The angle in Radians
	 * @return The angle in Degrees.
	 */
	public static double radiansToDegrees(double angle)
	{
		return angle * 180/Math.PI;
	}
	
	/**
	 * Returns the sum from n=[your_initial_n] to infinity of:
	 * (-1)^(n-[your_initial_n] times
	 * (x^(2n-[your_initial_n]))/((2n-)!)
	 * 
	 * (I'm going to look into seeing if I can use LaTeX or MathJax or something for those equations)
	 * 
	 * @param x Your x value
	 * @param n Your initial n value
	 * @param threshold The cutoff threshold for accuracy.
	 * @return The result of the series, plus or minus the threshold.
	 */
	private static double taylorSeries(double x, double n, double threshold)
	{
		double angle = x;
		int sign = 1;
		double nFactorial = 1;
		double xPower = Math.pow(angle,n);
		double guess = xPower;
		double delta = Double.POSITIVE_INFINITY; //They said the initial value didn't matter ¯\_(ツ)_/¯ 
		while(delta >= threshold)
		{
			n+=2;
			xPower *= angle*angle;
			nFactorial *= n*(n-1);
			sign = -sign;
			double nextTerm = sign * xPower / nFactorial;
			double nextGuess = guess + nextTerm;
			delta = Math.abs(guess - nextGuess);
			guess = nextGuess;
			System.out.println("n=" + n + "; x=" + guess + "; Δx = " + delta);
		}
		System.out.println("******* Done *******");
		return guess;
	}
	
	/**
	 * Returns the sum from n=[your_initial_n] to infinity of:
	 * (-1)^(n-[your_initial_n] times
	 * (x^(2n-[your_initial_n]))/((2n-)!)
	 * 
	 * (I'm going to look into seeing if I can use LaTeX or MathJax or something for those equations)
	 * 
	 * @param x Your x value
	 * @param n Your initial n value
	 * @return The result of the series, plus or minus the threshold.
	 */
	private static double taylorSeries(double x, double n)
	{
		return taylorSeries(x, n, 0.00000001);
	}
	
	/**
	 * Finds the sine of an angle.
	 * 
	 * @param angle The angle in radians.
	 * @return The sine of the angle.
	 */
	public static double sin(double angle)
	{
		angle = fixDomain(angle);
		return taylorSeries(angle, 1);
	}
	
	/**
	 * Finds the cosine of an angle.
	 * 
	 * @param angle The angle in radians.
	 * @return The cosine of the angle.
	 */
	public static double cos(double angle)
	{
		angle = fixDomain(angle);
		return taylorSeries(angle, 0);
	}
	
	/**
	 * Finds the tangent of an angle.
	 * 
	 * @param angle The angle in radians.
	 * @return The tangent of the angle.
	 */
	public static double tan(double angle)
	{
		return sin(angle)/cos(angle);
	}
	
	/**
	 * Finds the cosecant of an angle.
	 * 
	 * @param angle The angle in radians.
	 * @return The cosecant of the angle.
	 */
	public static double csc(double angle)
	{
		return 1/sin(angle);
	}
	
	/**
	 * Finds the secant of an angle.
	 * 
	 * @param angle The angle in radians.
	 * @return The secant of the angle.
	 */
	public static double sec(double angle)
	{
		return 1/cos(angle);
	}
	
	/**
	 * Finds the cotangent of an angle.
	 * 
	 * @param angle The angle in radians.
	 * @return The cotangent of the angle.
	 */
	public static double cot(double angle)
	{
		return 1/tan(angle);
	}
	
	/**
	 * Finds n!
	 * 
	 * @param n Number to find the factorial of.
	 * @return n!
	 */
	public static int factorial(int n)
	{
		/* I know it said not to use this, so I don't, but the logic is just two lines.
		 * Plus with memoization it would be nearly as efficient as their hardcoded method, just a couple extra function calls.
		 * And it's definitely much more readable at a glance.
		 */
		if(n == 0) return 1;
		else return(n * factorial(n-1));
	}
}