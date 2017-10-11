package sine_calculator;

public class SineCalculator {

	//declare the public variable
	public double degreesEntered;

	//declare the private variables
	private double angleRadians;
	private double delta;
	private int n;
	private double xPower;
	private double nFactorial;
	private int sign;
	private double guess;
	private double nextGuess;

	//process the initial iteration
	private double setInitial()
	{
		angleRadians = degreesEntered * Math.PI / 180.0;
		n = 1;
		sign = 1;
		nFactorial = 1;
		xPower = angleRadians;
		guess = angleRadians;
		delta = 1000;
		return angleRadians;
	}

	//iterate and return the n variable
	private int setN()
	{
		n += 2;
		return n;
	}

	//calculate and return the guess variable
	private double setGuess()
	{
		xPower = xPower * angleRadians * angleRadians;
		nFactorial = nFactorial * n * (n-1);
		sign = -sign;
		double nextTerm = sign * xPower / nFactorial;
		nextGuess = guess + nextTerm;
		return guess;
	}

	//calculate and return the delta variable
	private double setDelta()
	{
		delta = guess - nextGuess;
		if(delta < 0 )
			delta = -delta;
		guess = nextGuess;
		return delta;
	}

	//execute the program
	public void processCalcuation()
	{
		angleRadians = setInitial();

		while (delta >= .00000001)
		{
			n = setN();
			guess = setGuess();
			delta = setDelta();
			System.out.println("N=" + n + " guess=" + guess + " delta=" + delta);
		}
		System.out.println("***** Done *****");
		System.out.println("My guess =" + guess + " Math.sin(angle)=" + Math.sin(angleRadians));
	}	
}