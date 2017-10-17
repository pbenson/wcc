package newton_sqrt;

public class absoluteValue {
	
	public double Abv (double x) {
		
		double absoluteValue;
		
		if (x >= 0)
			absoluteValue = x;
		else
			absoluteValue = -x;
		
		return absoluteValue;
	}
}
