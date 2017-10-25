package roman_calculator;

public class Numeral
{
	private char letter;
	private int value;
	
	public static Numeral M = new Numeral('M', 1000);
	public static Numeral D = new Numeral('D', 500);
	public static Numeral C = new Numeral('C', 100);
	public static Numeral L = new Numeral('L', 50);
	public static Numeral X = new Numeral('X', 10);
	public static Numeral V = new Numeral('V', 5);
	public static Numeral I = new Numeral('I', 1);
	public static Numeral[] Roman = {M, D, C, L, X, V, I};
	
	public Numeral(char letter, int value)
	{
		this.letter = letter;
		this.value = value;
	}
	
	public char getLetter()
	{
		return this.letter;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
