package alphabet;
import java.text.MessageFormat;

public class Alphabet
{
	public static final char[] VOWLS = {'a', 'e', 'i', 'o', 'u', 'y'};
	public static void main(String[] args)
	{
		for(char i='a'; i<='z'; i++) //This feels so wrong XD
		{
			String type = "consonant";
			for(char voul: VOWLS)
			{
				if(i == voul) 
				{
					type = "vowl";
					break;
				}
			}
			String output = MessageFormat.format("{0} is a {1}", i, type);
			System.out.println(output);
		}
	}
}
