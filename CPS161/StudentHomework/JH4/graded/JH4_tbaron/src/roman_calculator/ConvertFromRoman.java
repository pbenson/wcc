package roman_calculator;

public class ConvertFromRoman {
	
	static int convert_from_Roman(String value)
	{
		int decimal = 0;

	    String romanNumeral = value.toUpperCase();
	    for(int x = 0;x<romanNumeral.length();x++)
	    {
	        char convertToDecimal = value.charAt(x);

	        switch (convertToDecimal)
	        {
	        case 'M':
	            decimal += 1000;
	            break;

	        case 'D':
	            decimal += 500;
	            break;

	        case 'C':
	            decimal += 100;
	            break;

	        case 'L':
	            decimal += 50;
	            break;

	        case 'X':
	            decimal += 10;
	            break;

	        case 'V':
	            decimal += 5;
	            break;

	        case 'I':
	            decimal += 1;
	            break;
	        }
	    }
	    if (romanNumeral.contains("IV"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("IX"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("XL"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("XC"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("CD"))
	    {
	        decimal-=100;
	    }
	    if (romanNumeral.contains("CM"))
	    {
	        decimal-=100;
	    }
	    System.out.println(decimal);
	    return decimal;
		
	}


	public static void main(String[] args) {
		
		convert_from_Roman("XX");

	}

}