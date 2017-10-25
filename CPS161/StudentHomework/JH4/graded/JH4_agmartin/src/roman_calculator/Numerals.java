package roman_calculator;

public class Numerals
{
	private Numeral[] numerals;
	private char[] letters;
	
	public static Numerals Roman = new Numerals(Numeral.Roman);
	
	public Numerals(Numeral[] numerals)
	{
		this.numerals = numerals;
		this.letters = new char[numerals.length];
		for(int i=0; i<numerals.length; i++)
		{
			this.letters[i] = numerals[i].getLetter();
		}
	}

	public String convertToNumerals(int value)
	{
		String result = "";
		for(Numeral numeral : this.numerals)
		{
			while(value >= numeral.getValue())
			{
				value -= numeral.getValue();
				result += numeral.getLetter();
			}
		}
		return result;
	}
	
	public int convertFromNumerals(String value)
	{
		int result = 0;
		int i = 0;
		int charNum = 1;
		for(char c : value.toCharArray())
		{
			boolean found = false;
			while(!found)
			{
				if(i >= this.numerals.length) return -charNum;
				else if(c != this.numerals[i].getLetter()) i++;
				else
				{
					result += numerals[i].getValue();
					found = true;
				}
			}
			charNum++;
		}
		return result;
	}

}
