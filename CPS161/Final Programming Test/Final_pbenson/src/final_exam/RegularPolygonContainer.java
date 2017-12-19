package final_exam;

public class RegularPolygonContainer extends Container {
	// add appropriate data definitions
	private double side;
	private int numSides;

	RegularPolygonContainer(double height, double side, int numSides) {
		// Fill in details
		super(height);
		this.side = side;
		this.numSides = numSides;
	}
	// implement required abstract methods

	@Override
	double getTopArea() {
		// TODO Auto-generated method stub
		return numSides * side * side / (4 * Math.tan(Math.PI / numSides));
	}

	@Override
	double getTopPerimeter() {
		// TODO Auto-generated method stub
		return numSides * side;
	}

}
