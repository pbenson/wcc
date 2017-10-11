package newton_sqrt;

public class NewtonSqrtCalculator {

	public double numberEntered;
	private double actualSqrt;
	private double lastGuess;
	private double newGuess;
	private double accuracy;

	public void executeCalculation()
	{

		lastGuess = numberEntered / 2;
		newGuess = ((numberEntered / lastGuess) + lastGuess) / 2;
		accuracy = Math.abs(newGuess - lastGuess);

		while(accuracy >= .000001)
		{
			lastGuess = newGuess;
			newGuess = ((numberEntered / lastGuess) + lastGuess) / 2;
			accuracy = Math.abs(newGuess - lastGuess);
		}

		actualSqrt = Math.sqrt(numberEntered);

		System.out.println("Newton (" + numberEntered + ") = " + newGuess);
		System.out.println("Math.sqrt = " + actualSqrt);
	}

}
