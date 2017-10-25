package roman_calculator;

public class ConvertToRoman {
	static String convert_to_Roman(int value)
	{
		
		
	    String s = "";
	    while (value >= 1000) 
	    {
	    	s += "M";
	    	value -= 1000;        
	    	}
	    while (value >= 900) 
	    {
	    	s += "CM";
	    	value -= 900;
	    }
	    while (value >= 500) 
	    {
	    	s += "D";
	    	value -= 500;
	    }
	    while (value >= 400) 
	    {
	    	s += "CD";
	    	value -= 400;
	    }
	    while (value >= 100) 
	    {
	    	s += "C";
	    	value -= 100;
	    }
	    while (value >= 90) 
	    {
	    	s += "XC";
	    	value -= 90;
	    }
	    while (value >= 50) 
	    {
	    	s += "L";
	    	value -= 50;
	    }
	    while (value >= 40) 
	    {
	    	s += "XL";
	    	value -= 40;
	    }
	    while (value >= 10) 
	    {
	    	s += "X";
	    	value -= 10;
	    }
	    while (value >= 9) 
	    {
	    	s += "IX";
	    	value -= 9;
	    }
	    while (value >= 5) 
	    {
	    	s += "V";
	    	value -= 5;
	    }
	    while (value >= 4) 
	    {
	    	s += "IV";
	    	value -= 4;
	    }
	    while (value >= 1) 
	    {
	    	s += "I";
	    	value -= 1;
	    }    
	    System.out.println(s);
	    return s;
		

	}

	public static void main(String[] args) {
		
		convert_to_Roman(100);
		
	}

}
